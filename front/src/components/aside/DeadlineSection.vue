<template>
    <BaseSection :sectionClass="sectionClass"
                 :headerText="headerText"
                 :bodyText="bodyText"
                 :footerLink="footerLink"
                 :footerLinkText="footerLinkText">
    </BaseSection>
</template>

<script>
import BaseSection from "@/components/aside/BaseSection";

export default {
    name: "DeadlineSection",
    computed: {
        sectionClass: function () {
            return "deadline-info";
        },
        headerText: function () {
            return undefined;
        },
        bodyText: function () {
            return "Ближайший дедлайн через: ";
        },
        footerLink: function () {
            return "#";
        },
        footerLinkText: function () {
            return "К циклу";
        },
    },
    components: {
        BaseSection
    },
}
</script>

<style scoped>

</style>