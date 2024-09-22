package com.mochiresearch.driveGroups.driveGroup;

import com.mochiresearch.driveGroups.driveGroup.repository.DriveGroupRepository;
import com.mochiresearch.driveGroups.driveGroup.repository.GroupFileAccessRepository;
import com.mochiresearch.driveGroups.driveGroup.repository.GroupUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriveGroupService {

    private final DriveGroupRepository driveGroupRepository;
    private final GroupFileAccessRepository groupFileAccessRepository;
    private final GroupUserRepository groupUserRepository;

    @Autowired
    public DriveGroupService(DriveGroupRepository driveGroupRepository,
                             GroupFileAccessRepository groupFileAccessRepository,
                             GroupUserRepository groupUserRepository) {
        this.driveGroupRepository = driveGroupRepository;
        this.groupFileAccessRepository = groupFileAccessRepository;
        this.groupUserRepository = groupUserRepository;
    }

    // TODO: Add all of the logic from backend appscript files here
}
