<template>
    <div class="tasks">
        <h3>Циклы: </h3>
        <CycleLink v-for="cycle in Object.values(cycles)" :cycle="cycle" :key="cycle.id"/>
    </div>
</template>

<script>
import CycleLink from "@/components/patterns/CycleLink.vue";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "CycleListPage",
    components: {CycleLink},
    props: ["cycles"],

}
</script>

<style scoped>

</style>