package com.company;

import com.company.models.Customer;
import com.company.utilities.HashPassword;
import express.Express;
import org.dizitart.no2.objects.ObjectFilter;
import org.dizitart.no2.objects.filters.ObjectFilters;

import static express.database.Database.collection;

public class Authentication {

    private Express app;

    public Authentication(Express app) {
        this.app= app;
        initAuth();

    }

    private void initAuth() {
        String secretSalt = "hnjfew45%!dhDsdqw-_!dwOL";

        app.post("/api/register", (req,res) -> {
            if(req.session("currentUser") != null) {
                res.send("Du är redan inloggad");
                return;
            }


            // Validating that email isn't already taken
            var customer = req.body(Customer.class);

            Customer customerInCollection = collection("Customer").findOne(ObjectFilters.eq("email", customer.getEmail()));
            if(customerInCollection != null) {
                res.send("Den adressen finns redan");
                return; // Don't save the customer if email already exists
            }

            String hashedPassword = HashPassword.hash(customer.getPassword() + secretSalt);
            customer.setPassword(hashedPassword);

            collection("Customer").save(customer);

            customer.setPassword(null);

            // Save customer in session
            req.session("currentUser", customer);
            res.json(customer);

        });


        app.post("/api/login", (req, res) -> {
            if(req.session("currentUser") != null) {
                res.send("Redan inloggad");
                return;
            }

            var customer = req.body(Customer.class);
            Customer customerInCollection = collection("Customer").findOne(ObjectFilters.eq("email", customer.getEmail()));

            //If no user with email found in collection
            if (customerInCollection == null) {
                res.send("Fel uppgifter");
                return;
            }

            // Validate password
            if(HashPassword.match(customer.getPassword() + secretSalt, customerInCollection.getPassword())) {
                // Correct email and password
                customerInCollection.setPassword(null);
                // Save customer in session
                req.session("currentUser", customerInCollection);
                res.json(customerInCollection);
            } else {
                // Wrong password
                res.send("Fel uppgifter");
            }
        });

        app.get("/api/whoami", (req, res) -> {
            Customer customer = req.session("currentUser");
            res.json(customer);
        });

        app.get("/api/logout", (req, res) -> {
            req.session("currentUser", null);
            res.send("Utloggad");
        });
    }

}
