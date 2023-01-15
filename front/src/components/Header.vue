<template>
  <header>
    <div class="enter-or-register-box">
      <template v-if="user">
        {{ user.name }}
        |
        <a href="#" @click.prevent="onLogout">Logout</a>
      </template>
      <template v-else>
        <a href="#" @click.prevent="changePage('Enter')">Enter</a>
        |
        <a href="#" @click.prevent="changePage('Register')">Register</a>
      </template>
    </div>
    <nav>
      <ul>
        <li><a href="#" @click.prevent="changePage('Info')">Информация</a></li>
        <li><a href="#" @click.prevent="changePage('CycleListPage')">Условия Задач</a></li>
        <li><a href="#" @click.prevent="changePage('UsefulLinks')">Полезные ссылки</a></li>
      </ul>
    </nav>
  </header>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Header",
  props: ["user"],
  methods: {
    changePage: function (page) {
      this.$root.$emit("onChangePage", page);
    },
  }
}
</script>

<style scoped>

</style>