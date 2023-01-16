<template>
  <div id="app">
    <Header/>
    <Middle :cycles="tasksCycles"/>
    <Footer/>
  </div>
</template>

<script>
import Footer from "@/components/Footer.vue";
import Header from "@/components/Header.vue";
import Middle from "@/components/Middle.vue";

export default {
  name: 'App',
  components: {
    Middle,
    Header,
    Footer,
  },
  data: function () {
    return this.$root.$data;
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
