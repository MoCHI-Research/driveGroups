package com.mochiresearch.driveGroups.driveGroup;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"group", "owner"})})
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    private DriveGroup group;

    @NotEmpty
    private String owner;

    public Archive() {
    }

    public Archive(DriveGroup group, String owner) {
        this.group = group;
        this.owner = owner;
    }

    public DriveGroup getGroup() {
        return group;
    }

    public void setGroup(DriveGroup group) {
        this.group = group;
    }

    public @NotEmpty String getOwner() {
        return owner;
    }

    public void setOwner(@NotEmpty String owner) {
        this.owner = owner;
    }
}
