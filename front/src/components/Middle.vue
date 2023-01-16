<template>
    <div class="middle">
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
        <main>
            <UsefulLinksPage v-if="page === 'UsefulLinksPage'"/>
            <CycleListPage v-if="page === 'CycleListPage'" :cycles="cycles"/>
            <SubmitPage v-if="page === 'SubmitPage'" :cycleId="submitCycleId"/>
            <TopListPage v-if="page === 'TopListPage'"/>
            <EnterPage v-if="page === 'EnterPage'"/>
            <RegisterPage v-if="page === 'RegisterPage'"/>
            <IndexPage v-if="page === 'IndexPage'"/>
        </main>
    </div>
</template>

<script>
import UsefulLinksPage from "@/components/page/UsefulLinksPage.vue";
import CycleListPage from "@/components/page/CycleListPage.vue";
import IndexPage from "@/components/page/IndexPage.vue";
import TopListPage from "@/components/page/TopListPage.vue";
import SubmitPage from "@/components/page/SubmitPage.vue";
import EnterPage from "@/components/page/EnterPage.vue";
import RegisterPage from "@/components/page/RegisterPage.vue";
import ContactsSection from "@/components/aside/ContactsSection.vue";
import DeadlineSection from "@/components/aside/DeadlineSection.vue";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "Middle",
    data: function () {
        return {page: 'IndexPage', submitCycleId: undefined}
    },
    components: {
        CycleListPage,
        IndexPage,
        TopListPage,
        SubmitPage,
        UsefulLinksPage,
        EnterPage,
        RegisterPage,
        ContactsSection,
        DeadlineSection,
    },
    props: ["cycles"],
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