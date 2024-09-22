package com.mochiresearch.driveGroups.driveGroup.repository;

import com.mochiresearch.driveGroups.driveGroup.GroupFileAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupFileAccessRepository extends JpaRepository<GroupFileAccess, String> {
}
