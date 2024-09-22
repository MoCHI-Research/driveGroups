package com.mochiresearch.driveGroups.driveGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("group")
public class DriveGroupController {

    private final DriveGroupService driveGroupService;

    @Autowired
    public DriveGroupController(DriveGroupService driveGroupService) {
        this.driveGroupService = driveGroupService;
    }


}
