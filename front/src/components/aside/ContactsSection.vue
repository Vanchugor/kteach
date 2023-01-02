<template>
    <BaseSection :sectionClass="sectionClass"
                 :headerText="headerText"
                 :bodyText="bodyText"
                 :footerLink="footerLink">
    </BaseSection>
</template>

<script>
import BaseSection from "@/components/aside/BaseSection";

export default {
    name: "ContactsSection",
    computed: {
        sectionClass: function () {
            return "contact-info";
        },
        headerText: function () {
            return "Контакты";
        },
        bodyText: function () {
            return "Почта: blabla@gmail.com";
        },
        footerLink: function () {
            return undefined;
        },
    },
    components: {
        BaseSection
    },
}
</script>

<style scoped>

</style>