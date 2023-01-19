<template>
    <div class="enter form-box">
        <div class="header">Регистрация</div>
        <div class="body">
            <form @submit.prevent="onRegister">
                <div class="field">
                    <div class="name">
                        <label for="login">Логин</label>
                    </div>
                    <div class="value">
                        <input autofocus id="login" name="login" v-model="login"/>
                    </div>
                </div>
                <div class="field">
                    <div class="name">
                        <label for="name">Имя</label>
                    </div>
                    <div class="value">
                        <input id="name" name="name" v-model="name"/>
                    </div>
                </div>
                <div class="field">
                    <div class="name">
                        <label for="password">Пароль</label>
                    </div>
                    <div class="value">
                        <input type="password" id="password" name="password" v-model="password"/>
                    </div>
                </div>
                <div class="field">
                    <div class="name">
                        <label for="confirm">Повторите пароль</label>
                    </div>
                    <div class="value">
                        <input type="password" id="confirm" name="confirm" v-model="confirmPassword"/>
                    </div>
                </div>
                <div class="field error">{{ error }}</div>
                <div class="button-field">
                    <input type="submit" value="Зарегистрироваться">
                </div>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    name: "RegisterPage",
    data: function () {
        return {
            login: "",
            name: "",
            password: "",
            confirmPassword: "",
            error: ""
        }
    },
    methods: {
        onRegister: function () {
            this.error = "";
            this.$root.$emit("onRegister", this.login, this.name, this.password, this.confirmPassword);
        }
    },
    beforeMount() {
        this.$root.$on("onRegisterValidationError", error => this.error = error);
    }
}
</script>

<style scoped>

</style>