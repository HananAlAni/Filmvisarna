<template>
  <div class="rootElement">
    <h1>Aktuella Filmer</h1>
    <div class="movie-list" v-for="item of movie" :key="item.id">
      <router-link :to="'/movieshow/details/' + item.id">
        <div class="movie-details">
          <img :src="item.poster" alt="" />
          <h3 class="movie-name">{{ item.title }}</h3>
        </div>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  props: ["id"],
  computed: {
    movie() {
      return this.$store.state.movie;
    },
  },
};
</script>

<style scoped>
.movie-list {
  padding: 10px;
  float: left;
}
select:focus {
  outline: none;
}

.movie-details {
  height: 260px;
  width: 200px;
  border: 1px solid whitesmoke;
  border-radius: 5px;
  padding: 1px;
  text-decoration: none;
  overflow: hidden;
}
a {
  color: inherit;
  text-decoration: inherit;
}

.movie-details,
img,
h3,
p,
a {
  background-color: whitesmoke;
}

img {
  max-width: 150px;
  max-height: 100px;
}
img {
  max-width: 300px;
}
</style>