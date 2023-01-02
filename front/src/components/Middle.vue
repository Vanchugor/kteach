<template>
    <div class="middle">
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
        <main>
            <UsefullLinks v-if="page === 'UsefullLinks'"/>
            <CycleListPage v-if="page === 'CycleListPage'" :tasksCycles="tasksCycles"/>
            <Cycle v-if="page === 'Cycle'" :cycle="cycle"/>
        </main>
    </div>
</template>

<script>
import UsefullLinks from "@/components/page/UsefullLinks.vue";
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
        UsefullLinks,
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