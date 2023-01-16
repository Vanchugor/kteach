<template>
    <header>
        <div class="enter-or-register-box">
            <template v-if="user">
                {{ user.name }}
                |
                <a href="#" @click.prevent="onLogout">Logout</a>
            </template>
            <template v-else>
                <a href="#" @click.prevent="changePage('EnterPage')">Enter</a>
                |
                <a href="#" @click.prevent="changePage('RegisterPage')">Register</a>
            </template>
        </div>
        <nav>
            <ul>
                <li><a href="#" @click.prevent="changePage('IndexPage')">Новости</a></li>
                <li><a href="#" @click.prevent="changePage('CycleListPage')">Условия&nbsp;Задач</a></li>
                <li><a href="#" @click.prevent="changePage('SubmitPage')">Сдать&nbsp;работу</a></li>
                <li><a href="#" @click.prevent="changePage('TopListPage')">Рейтинг</a></li>
                <li><a href="#" @click.prevent="changePage('UsefulLinksPage')">Полезные&nbsp;ссылки</a></li>
            </ul>
        </nav>
    </header>
</template>

<script>
export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "Header",
    props: ["user"],
    methods: {
        changePage: function (page) {
            this.$root.$emit("onChangePage", page);
        },
    }
}
</script>

<style scoped>
header {
    position: relative;
}

header .enter-or-register-box {
    float: top;
    text-align: right;
}

header nav {
    float: bottom;
    border: 1px solid var(--border-color);
    border-radius: var(--border-radius);
    padding: 0.75rem 0.25rem;
    margin-top: 1rem;
}

header nav ul {
    margin: 0;
    padding: 0;
}

header nav ul li {
    display: inline;
    margin-left: 1rem;
}

header nav ul li::before {
    content: " | ";
    color: var(--border-color);
    margin-right: 1rem;
}

header nav ul li:first-child::before {
    content: " ";
    margin-right: 1rem;
}

header nav ul li a {
    text-decoration: none;
    color: var(--black-color);
    font-family: "Arial Narrow", sans-serif;
    font-weight: bold;
    text-transform: uppercase;
}
</style>