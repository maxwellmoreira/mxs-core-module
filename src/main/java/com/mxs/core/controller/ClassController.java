package com.mxs.core.controller;

import com.mxs.core.dto.CreateClassDto;
import com.mxs.core.facade.ClassFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.mxs.core.constant.UriConstant.BASE_URI;
import static com.mxs.core.constant.UriConstant.CLASSES;

@Controller
@RequestMapping(value = BASE_URI + CLASSES)
public class ClassController {

    @Autowired
    private ClassFacade classFacade;

    @PostMapping
    public ResponseEntity<HttpStatus> createClass(@RequestBody CreateClassDto createClassDto) {
        this.classFacade.createClass(createClassDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
