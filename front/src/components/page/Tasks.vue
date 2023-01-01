<template>
  <div class="tasks">
    <TaskCycleLink  v-for="task in Object.values(tasksCycles)" :taskCycle="task" :key="task.id"/>
  </div>
</template>

<script>
import TaskCycleLink from "@/components/patterns/TaskCycleLink.vue";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Tasks",
  components: {TaskCycleLink},
  props: ["tasksCycles"],

}
</script>

<style scoped>

</style>