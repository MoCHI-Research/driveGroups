package com.mochiresearch.driveGroups.driveGroup;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"drive_group", "file_id"})})
public class GroupFileAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(targetEntity = DriveGroup.class, fetch = FetchType.EAGER)
    private DriveGroup driveGroup;

    @NotEmpty
    private String fileId;

    @NotEmpty
    private String access;

    public GroupFileAccess() {
    }

    public GroupFileAccess(DriveGroup driveGroup, String fileId, String access) {
        this.driveGroup = driveGroup;
        this.fileId = fileId;
        this.access = access;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DriveGroup getDriveGroup() {
        return driveGroup;
    }

    public void setDriveGroup(DriveGroup driveGroup) {
        this.driveGroup = driveGroup;
    }

    public @NotEmpty String getFileId() {
        return fileId;
    }

    public void setFileId(@NotEmpty String fileId) {
        this.fileId = fileId;
    }

    public @NotEmpty String getAccess() {
        return access;
    }

    public void setAccess(@NotEmpty String access) {
        this.access = access;
    }
}
