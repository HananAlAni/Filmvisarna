<template>
  <div>
    <div class="logoBox">
      <img class="logo" src="../assets/logo2.png" />
    </div>
    <nav>

  <router-link to="/">Start</router-link>
      <router-link to="/films">Filmer</router-link>
   <router-link to="/biograf">Biograf</router-link>
   
            </nav>
  </div>
</template>

<script>


export default {
 

};
</script>

<style scoped>
a, p, button {
  text-decoration: none;
  font-weight: bald;
  padding: 10px;
  padding-left: 25px;
  border: 1px;
  font-size: 20px;
  color: rgb(136, 44, 49);
  float: left;
}

a:hover {
  color: rgba(121, 122, 131, 0.281);
}


nav {
  padding:37px;
  height: 20px;
  text-align: center;
  border-bottom: 2px solid rgb(99, 96, 96);
  box-shadow: 1px 3px 3px grey;
  background-color: rgb(8, 8, 8);
  padding-left: 170px;
}
.logoBox {
  float: left;
  /*position: fixed;*/
}
.logo {
  width: 50%;
  height: auto;
  padding-bottom: 20px;
}

button {
  border: none;
  background: none;
  cursor: pointer;
  float: right;
}


button:focus{
  outline: none;
  color: rgba(122, 62, 85, 0.281);
 }

 button:hover {
   color: rgba(121, 122, 131, 0.281);
 }

.fa-user-alt {
  font-size: 30px;
}
</style>