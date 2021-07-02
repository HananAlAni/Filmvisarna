<template>
  <div class="container">
    <div class="container-title">
      <h1>Kalender</h1>
    </div>
    <div class="dates">
          <div class="today">
            <h3>Idag</h3>
            <div v-for="movie in movieToday" :key="movie.title" class="movies">
            <router-link :to="'/movieshow/details/' + movie.id">
            <img :src="movie.poster">
            </router-link>
            </div>
          </div>
          <div class="tomorow">
            <h3>Imorgon</h3>
            <div v-for="movie in movieTomorrow" :key="movie.title">
            <router-link :to="'/movieshow/details/' + movie.id">
            <img :src="movie.poster">
            </router-link>
            </div>
          </div>
           </div>
      </div>
</template>
<script>
export default {
  data() {
    return {
      today: "",
      tomorrow: "",
       };
  },
  computed: {
    movies() {
      return this.$store.state.movie
    },
    movieToday() {
              let tempViewing = this.$store.state.allViewings.filter((viewing) => viewing.date === this.today)
 
       return tempViewing[0] ? this.movies.filter((movie) => movie.title === tempViewing[0].movie) : "Inget visas idag"
    },
    movieTomorrow() {
      let tempViewing = this.$store.state.allViewings.filter((viewing) => viewing.date === this.tomorrow)
      return tempViewing[0] ? this.movies.filter((movie) => movie.title === tempViewing[0].movie) : "Inget visas idag"
    },
     methods: {
    setDates() {
          let tday = new Date();
      let tmorrow = new Date();
      tmorrow.setDate(tday.getDate() + 1);
      this.today = tday.toJSON().slice(0, 10).replace(/-/g, "/");
      this.tomorrow = tmorrow.toJSON().slice(0, 10).replace(/-/g, "/");
        }
  },
  mounted() {
    this.setDates()
  },
}
</script>

<style scoped>
img:hover {
  opacity: 0.5;
}

h5 {
  display: inline-block;
  padding-left: 5px;
}

.movies > h3 {
  display: inline-block;
  padding: 0 5px 0 5px;
}

h1,
h3,
h5 {
  color: black;
}

.container {
  margin: 10px;
  padding: 1em;
  border: 1px solid black;
  justify-content: space-between;
}

.dates {
  display: flex;
  justify-content: space-around;
}

.container-title {
  display: inline-block;
}
</style>
