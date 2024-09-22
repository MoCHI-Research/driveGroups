package com.mochiresearch.driveGroups.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "user_account")
public class User {

    @Id
    @Column(unique = true, nullable = false)
    private String userId;

    @NotEmpty
    @Column(unique = true, nullable = false)
    private String userEmail;

    public User(String userId, String userEmail) {
        this.userId = userId;
        this.userEmail = userEmail;
    }

    public User() { }

    public @NotEmpty String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(@NotEmpty String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
