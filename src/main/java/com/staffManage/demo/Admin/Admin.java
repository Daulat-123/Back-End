package com.staffManage.demo.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "admin")
public class Admin {
    @Id
    private Long id;
    private String email;
    private String password;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
