<template>
  <div class="cycle">
    <Task v-for="taskId in cycle.tasksId" :task="findTask(taskId)" :key="taskId"/>
  </div>
</template>

<script>
import Task from "@/components/patterns/Task.vue";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
  name: "Cycle",
  components: {
      Task
  },
  props: ["cycle"],
  methods: {
    findTask: function (id) {
      let ans = -1;
      Object.values(this.$root.tasks).forEach(task => {
        if (task.id === id) {
          ans = task;
        }
      });
      return ans
    }
  }
}
</script>

<style scoped>

</style>