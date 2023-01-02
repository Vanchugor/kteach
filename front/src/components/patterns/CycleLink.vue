<template>
    <div class="taskCycleLink">
        <ul>
            <li class="title">
                <a href="#" @click.prevent="changeToCycle(taskCycle)">
                    {{ taskCycle.title }}
                </a>
            </li>
            <li class="task-number">Задач: 5</li>
            <li class="date-from">Начало: 01.01.2023</li>
            <li class="date-to">Конец: 10.01.2023</li>
            <li class="send">
                <a href="#">Сдать</a>
            </li>
        </ul>
    </div>
</template>

<script>
export default {
    name: "TaskCycleLink",
    props: ["taskCycle"],
    methods: {
        changeToCycle: function (taskCycle) {
            this.$root.$emit("changeToCycle", taskCycle);
        }
    }
}
</script>

<style scoped>
.taskCycleLink {
    background: #E1E1E1;
    margin-bottom: 0.5rem;
    padding: 0.3rem;
    text-align: left;
}

.taskCycleLink ul {
    padding-left: 1rem;
}

.taskCycleLink ul li {
    display: inline;
    margin-left: 1rem;
}
</style>