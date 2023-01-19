package com.physics30.ct.controller;

import com.physics30.ct.domain.User;
import com.physics30.ct.exception.ValidationException;
import com.physics30.ct.form.UserCredentialsRegister;
import com.physics30.ct.form.validator.UserCredentialsRegisterValidator;
import com.physics30.ct.service.JwtService;
import com.physics30.ct.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/1")
public class UserController {
    private final JwtService jwtService;
    private final UserService userService;
    private final UserCredentialsRegisterValidator userCredentialsRegisterValidator;

    public UserController(JwtService jwtService, UserService userService, UserCredentialsRegisterValidator userCredentialsRegisterValidator) {
        this.jwtService = jwtService;
        this.userService = userService;
        this.userCredentialsRegisterValidator = userCredentialsRegisterValidator;
    }

    @GetMapping("users")
    public List<User> findUsers() {
        return userService.findAll();
    }

    @PostMapping("users")
    public String create(@RequestBody @Valid UserCredentialsRegister userCredentials, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidationException(bindingResult);
        }

        User user = userService.register(userCredentials);
        return jwtService.create(user);
    }

    @GetMapping("users/auth")
    public User findUserByJwt(@RequestParam String jwt) {
        return jwtService.find(jwt);
    }
}
