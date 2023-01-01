<template>
  <div class="middle">
    <main>
      <UsefullLinks v-if="page === 'UsefullLinks'"/>
    </main>
  </div>
</template>

<script>
import UsefullLinks from "@/components/page/UsefullLinks.vue";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Middle",
  data : function () {
    return {page : 'Index'}
  },
  components: {UsefullLinks},
  beforeCreate() {
  this.$root.$on("onChangePage", (page) => this.page = page)
}
}
</script>

<style scoped>

</style>