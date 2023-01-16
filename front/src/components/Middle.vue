<template>
    <div class="middle">
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
        <main>
            <UsefulLinksPage v-if="page === 'UsefulLinksPage'"/>
            <CycleListPage v-if="page === 'CycleListPage'" :tasksCycles="tasksCycles"/>
            <CyclePage v-if="page === 'CyclePage'" :cycle="cycle"/>
        </main>
    </div>
</template>

<script>
import UsefulLinksPage from "@/components/page/UsefulLinksPage.vue";
import CycleListPage from "@/components/page/CycleListPage.vue";
import CyclePage from "@/components/page/CyclePage.vue";
import ContactsSection from "@/components/aside/ContactsSection.vue";
import DeadlineSection from "@/components/aside/DeadlineSection.vue";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "Middle",
    data: function () {
        return {page: 'IndexPage', cycle: null}
    },
    components: {
        CyclePage,
        CycleListPage,
        UsefulLinksPage,
        ContactsSection,
        DeadlineSection,
    },
    props: ["tasksCycles"],
    beforeCreate() {
        this.$root.$on("onChangePage", (page, kwargs = undefined) => {
            if (kwargs !== undefined) {
                for (const key in kwargs) {
                    this[key] = kwargs[key];
                }
            }
            this.page = page;
        });
    }
}

</script>

<style scoped>
.middle {
    margin-top: 1rem;
    overflow: auto;
}

main {
    margin-right: 21rem;
    border: 1px solid var(--border-color);
    border-radius: var(--border-radius);
    padding: 0.5rem;
}

.middle aside {
    float: right;
    width: 20rem;
}
</style>