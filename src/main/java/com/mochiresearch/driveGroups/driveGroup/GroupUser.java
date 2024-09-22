package com.mochiresearch.driveGroups.driveGroup;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"group", "email"})})
public class GroupUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    private DriveGroup group;

    @NotEmpty
    private String email;

    public GroupUser() {
    }

    public GroupUser(DriveGroup group, String email) {
        this.group = group;
        this.email = email;
    }

    public DriveGroup getGroup() {
        return group;
    }

    public void setGroup(DriveGroup group) {
        this.group = group;
    }

    public @NotEmpty String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty String email) {
        this.email = email;
    }
}
