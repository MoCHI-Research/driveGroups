package com.mochiresearch.driveGroups.file;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class File {

    @Id
    @Column(nullable = false, unique = true)
    private String file_id;

    public File() {
    }

    public File(String file_id) {
        this.file_id = file_id;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }
}
