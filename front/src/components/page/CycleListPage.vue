<template>
    <div class="tasks">
        <h3>Циклы: </h3>
        <CycleLink v-for="task in Object.values(tasksCycles)" :taskCycle="task" :key="task.id"/>
    </div>
</template>

<script>
import CycleLink from "@/components/patterns/CycleLink.vue";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "CycleListPage",
    components: {CycleLink},
    props: ["tasksCycles"],

}
</script>

<style scoped>

</style>