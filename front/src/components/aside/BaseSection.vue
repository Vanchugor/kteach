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
section {
    border: 1px solid var(--border-color);
    border-top-left-radius: var(--border-radius);
    border-top-right-radius: var(--border-radius);
    margin-bottom: 0.5rem;
}

section .header {
    border-bottom: 1px solid var(--border-color);
    padding: 0.25rem;
    font-weight: bold;
    color: var(--caption-color);
}

section .header:before {
    content: "→";
}

section .body {
    padding: 1rem;
}

section .footer {
    border-top: 1px solid var(--border-color);
    overflow: auto;
    padding: 0.25rem;
}

section .footer a {
    float: right;
    font-size: 0.75rem;
}

section .footer a:after {
    content: " →";
}
</style>