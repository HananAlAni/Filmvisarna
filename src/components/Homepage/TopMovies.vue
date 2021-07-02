<template>
  <div class="container">
    <div class="component-title">
      <h1>Topp</h1>
      <p>mer...</p>
    </div>
    <div class="topmovies-list">
      <div v-for="movie in movies" :key="movie.id" class="movie">
        <router-link :to="'/movieshow/details/' + movie.id">
        <img :src="movie.poster" alt="">
        </router-link>
        <div class="movie-details">
          <h6 class="title">
            {{ movie.title }} | {{ movie.runtime }} | {{ movie.rated }}
          </h6>
        </div>
        </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["id"],
  computed: {
    movies() {
      return this.$store.state.movie.filter((movie) => movie.score > 7);
    },
  },
};
</script>

<style scoped>
h1,
p {
  color: black;
}

.container {
  margin: 10px;
  padding: 1em;
  border: 1px solid rgba(0, 0, 0, 0.521);
}

.component-title {
  display: flex;
  justify-content: space-between;
  position: relative;
  top: 5px;
  left: 10px;
}

.component-title > p {
  position: relative; 
  top: 25px;
  right: 25px;
}

.topmovies-list {
  display: flex;
  justify-content: space-between;
  padding: 10px;
}

.movie {
  border-radius: 8px;
}

.movie:hover {
  opacity: 0.9;
}

img {
  border-top-left-radius: 8px;
  border-top-right-radius: 8px;
  max-height: 400px;
}

.movie-details {
  background: #333;
  position: relative;
  bottom: 6.8px;
  padding: 3px 5px 0 5px;
  height: 20px;
  border-bottom-left-radius: 8px;
  border-bottom-right-radius: 8px;
}
</style>