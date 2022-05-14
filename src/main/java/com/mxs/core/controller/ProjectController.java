package com.mxs.core.controller;

import com.mxs.core.dto.StartProjectDto;
import com.mxs.core.facade.ProjectFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.mxs.core.constant.UriConstant.BASE_URI;
import static com.mxs.core.constant.UriConstant.PROJECTS;

@Controller
@RequestMapping(value = BASE_URI + PROJECTS)
public class ProjectController {
    @Autowired
    private ProjectFacade projectFacade;

    @PostMapping
    public ResponseEntity<HttpStatus> startProject(@RequestBody StartProjectDto startProjectDto) {
        this.projectFacade.startProject(startProjectDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
