<template>
  <div class="taskLink" @click.prevent="changeToCycle(taskCycle)">
    {{ taskCycle.name }}
  </div>
</template>

<script>
export default {
  name: "TaskCycleLink",
  props: ["taskCycle"],
  methods: {
    changeToCycle: function (taskCycle) {
      this.$root.$emit("changeToCycle", taskCycle);
    }
  }
}
</script>

<style scoped>

</style>