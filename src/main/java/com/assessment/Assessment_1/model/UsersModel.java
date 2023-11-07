package com.assessment.Assessment_1.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.Objects;

@Entity
@Table(name = "userTable")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsersModel that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getPassword(), getEmail());
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
