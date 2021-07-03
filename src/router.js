import { createRouter, createWebHistory } from 'vue-router'

import Films from './views/Films.vue'
import Details from './views/Details.vue'
import Homepage from './views/Homepage.vue'
import Biograf from './views/tempCinema.vue'

const routes = [
  {
    name: 'Homepage',
    path: '/',
    component: Homepage

  },
  {
    name: 'Films',
    path: '/films',
    component: Films

  },
  {
    name: 'Details',
    path: '/movieshow/details/:id',
    component: Details
  },
 
  {
    name: 'Biograf',
    path: '/biograf',
    component: Biograf
  }

]

export default createRouter({
  history: createWebHistory(),
  routes
})
