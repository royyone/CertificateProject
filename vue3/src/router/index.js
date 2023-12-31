// import { createRouter, createWebHashHistory } from "vue-router";
import { createRouter, createWebHistory } from 'vue-router'


const routes = [
  {
    path: "/",
    redirect:"/Login"
  },
  {
    path: '/Login',
    name: 'Login',
    component: () => import("../views/Login.vue")
  },
  {
    path: '/Home',
    name: 'Home',
    component: () => import("../views/Home.vue")

  }
];

const router = createRouter({
    routes,
    history: createWebHistory(process.env.BASE_URL),
});

export default router

