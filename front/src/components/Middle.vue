<template>
    <div class="middle">
        <main>
            <UsefullLinks v-if="page === 'UsefullLinks'"/>
            <Tasks v-if="page === 'Tasks'" :tasksCycles="tasksCycles"/>
            <TaskCycle v-if="page === 'TaskCycle'" :cycle="cycle"/>
        </main>
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
    </div>
</template>

<script>
import UsefullLinks from "@/components/page/UsefullLinks.vue";
<<<<<<< HEAD
import Tasks from "@/components/page/Tasks.vue";
import TaskCycle from "@/components/patterns/TaskCycle.vue";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Middle",
  data : function () {
    return {page : 'Index', cycle: null}
  },
  components: {TaskCycle, Tasks, UsefullLinks},
  props: ["tasksCycles"],
  beforeCreate() {
    this.$root.$on("onChangePage", (page) => this.page = page);
    this.$root.$on("changeToCycle", (cycle) => {this.page = "TaskCycle"; this.cycle = cycle})
}
=======
import ContactsSection from "@/components/aside/ContactsSection.vue";
import DeadlineSection from "@/components/aside/DeadlineSection";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "Middle",
    data: function () {
        return {page: 'Index'}
    },
    components: {
        UsefullLinks,
        ContactsSection,
        DeadlineSection
    },
    beforeCreate() {
        this.$root.$on("onChangePage", (page) => this.page = page)
    }
>>>>>>> dev
}
</script>

<style scoped>

</style>