package com.mochiresearch.driveGroups.driveGroup.repository;

import com.mochiresearch.driveGroups.driveGroup.DriveGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriveGroupRepository extends JpaRepository<DriveGroup, String> {
}
