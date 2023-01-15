<template>
    <div class="middle">
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
        <main>
            <UsefulLinks v-if="page === 'UsefulLinks'"/>
            <CycleListPage v-if="page === 'CycleListPage'" :tasksCycles="tasksCycles"/>
            <Cycle v-if="page === 'Cycle'" :cycle="cycle"/>
        </main>
    </div>
</template>

<script>
import UsefulLinks from "@/components/page/UsefulLinks.vue";
import CycleListPage from "@/components/page/CycleListPage.vue";
import Cycle from "@/components/patterns/Cycle.vue";
import ContactsSection from "@/components/aside/ContactsSection.vue";
import DeadlineSection from "@/components/aside/DeadlineSection";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "Middle",
    data: function () {
        return {page: 'Index', cycle: null}
    },
    components: {
        Cycle,
        CycleListPage,
        UsefulLinks,
        ContactsSection,
        DeadlineSection,
    },
    props: ["tasksCycles"],
    beforeCreate() {
        this.$root.$on("onChangePage", (page) => this.page = page);
        this.$root.$on("changeToCycle", (cycle) => {
            this.page = "Cycle";
            this.cycle = cycle
        })
    }
}

</script>

<style scoped>

</style>