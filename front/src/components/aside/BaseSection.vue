<template>
    <section :class="sectionClass">
        <div class="header" v-if="headerText">
            {{ headerText }}
        </div>
        <div class="body" v-if="bodyText">
            {{ bodyText }}
        </div>
        <slot></slot>
        <div class="footer" v-if="footerLink">
            <a :href="footerLink">{{ footerLinkText }}</a>
        </div>
    </section>
</template>

<script>
export default {
    name: "ContactsSection",
    props: ["sectionClass", "headerText", "bodyText", "footerLink", "footerLinkText"],
}
</script>

<style scoped>

</style>