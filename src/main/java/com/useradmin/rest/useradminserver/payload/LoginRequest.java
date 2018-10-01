package com.useradmin.rest.useradminserver.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    private String userNameOrEmail;

    @NotBlank
    private String password;

    public String getUserNameOrEmail() {
        return userNameOrEmail;
    }

    public void setUserNameOrEmail(String usernameOrEmail) {
        this.userNameOrEmail = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}