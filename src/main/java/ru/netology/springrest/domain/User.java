package ru.netology.springrest.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Objects;

public class User {
    @NotBlank
    @Size(min = 2, max = 20)
    private String user;
    @NotBlank
    @Min(8)
    @Max(20)
    private String password;
    private List<Authorities> authoritiesList;

    public User(String user, String password, List<Authorities> authoritiesList) {
        this.user = user;
        this.password = password;
        this.authoritiesList = authoritiesList;
    }

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }

    public void setAuthoritiesList(List<Authorities> authoritiesList) {
        this.authoritiesList = authoritiesList;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", authoritiesList=" + authoritiesList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return user.equals(user1.user) && password.equals(user1.password) && Objects.equals(authoritiesList, user1.authoritiesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, authoritiesList);
    }
}
