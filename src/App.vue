<template>
  <div class="rootElement">
    <Navbar />
    <router-view />
  </div>
</template>

<script>
import Navbar from "./components/Navbar.vue";

export default {
  name: "App",
  components: { Navbar },
  created() {
    this.$store.dispatch("fetchMovie");
    this.$store.dispatch("fetchViewings");
  },
};
</script>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");

.rootElement {
  height: 100%;
  width: 100%;
  font-family: "Poppins", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: white;
  box-sizing: border-box;
}
</style>

