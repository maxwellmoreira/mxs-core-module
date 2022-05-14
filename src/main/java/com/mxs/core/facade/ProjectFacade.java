package com.mxs.core.facade;

import com.mxs.core.dto.StartProjectDto;
import com.mxs.core.exception.CustomGenericException;
import com.mxs.core.feature.StartProjectFeature;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProjectFacade {

    @Autowired
    private StartProjectFeature startProjectFeature;

    public void startProject(StartProjectDto startProjectDto) {
        try {
            this.startProjectFeature.startProject(startProjectDto);
        } catch (Exception exception) {
            throw new CustomGenericException(exception.getMessage());
        }
    }
}
