package com.example.demo.payload.requests;

import javax.validation.constraints.NotBlank;
import java.util.Set;

public class SignupRequest {
    @NotBlank
    private String password;

    @NotBlank
    private String email;

    private Set<String> role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
