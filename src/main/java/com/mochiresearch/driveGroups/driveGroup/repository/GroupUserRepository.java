package com.mochiresearch.driveGroups.driveGroup.repository;

import com.mochiresearch.driveGroups.driveGroup.GroupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupUserRepository extends JpaRepository<GroupUser, String> {
}
