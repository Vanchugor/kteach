<template>
    <div class="middle">
        <main>
            <UsefullLinks v-if="page === 'UsefullLinks'"/>
        </main>
        <aside>
            <DeadlineSection/>
            <ContactsSection/>
        </aside>
    </div>
</template>

<script>
import UsefullLinks from "@/components/page/UsefullLinks.vue";
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
}
</script>

<style scoped>

</style>