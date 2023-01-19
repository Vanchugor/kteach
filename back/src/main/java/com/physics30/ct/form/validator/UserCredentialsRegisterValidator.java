package com.physics30.ct.form.validator;

import com.physics30.ct.form.UserCredentialsRegister;
import com.physics30.ct.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.physics30.ct.service.UserService;

@Component
public class UserCredentialsRegisterValidator implements Validator {
    private final UserService userService;

    public UserCredentialsRegisterValidator(UserService userService) {
        this.userService = userService;
    }

    public boolean supports(Class<?> clazz) {
        return UserCredentialsRegister.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        if (!errors.hasErrors()) {
            UserCredentialsRegister registerForm = (UserCredentialsRegister) target;

            if (!registerForm.getPassword().equals(registerForm.getConfirmPassword())) {
                errors.reject("wrong-password-confirmation", "Password confirmation is wrong");
            }
            if (userService.findByLogin(registerForm.getLogin()) != null) {
                errors.reject("login-is-taken", "This login is already taken");
            }
        }
    }
}
