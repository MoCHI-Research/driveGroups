package com.mochiresearch.driveGroups.driveGroup;

import com.mochiresearch.driveGroups.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class DriveGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotEmpty
    private String name;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    private User owner;

    private boolean archived;

    @OneToOne
    private DriveGroup parent;

    public DriveGroup() {
    }

    public DriveGroup(String name, User owner, DriveGroup parent) {
        this.name = name;
        this.owner = owner;
        this.archived = false;
        this.parent = parent;
    }

    public DriveGroup(String name, User owner) {
        this.name = name;
        this.owner = owner;
        this.archived = false;
        this.parent = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotEmpty String getName() {
        return name;
    }

    public void setName(@NotEmpty String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public DriveGroup getParent() {
        return parent;
    }

    public void setParent(DriveGroup parent) {
        this.parent = parent;
    }
}
