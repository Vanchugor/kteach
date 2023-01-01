<template>
  <div class="task">
    <div class="name"> {{ task.name }} </div>
    <div class="text"> {{ task.text }} </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Task",
  props: ["task"]
}
</script>

<style scoped>

</style>