<template>
    <section class="{{ sectionClass }}">
        <div class="header">
            {{ headerText }}
        </div>
        <div class="body">
            {{ bodyText }}
        </div>
        <div class="footer">
            <a href="#">{{ footerLinkText }}</a>
        </div>
    </section>
</template>

<script>
export default {
    name: "ContactsSection",
    props: ["sectionClass", "headerText", "bodyText", "footerLinkText"],
}
</script>

<style scoped>

</style>