package com.mxs.core.facade;

import com.mxs.core.dto.CreateClassDto;
import com.mxs.core.exception.CustomGenericException;
import com.mxs.core.exception.IoCustomException;
import com.mxs.core.feature.CreateClassFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ClassFacade {

    @Autowired
    private CreateClassFeature createClassFeature;

    public void createClass(CreateClassDto createClassDto) {
        try {
            this.createClassFeature.createClass(createClassDto);
        } catch (IOException ioException) {
            throw new IoCustomException(ioException.getMessage());
        } catch (Exception exception) {
            throw new CustomGenericException(exception.getMessage());
        }
    }
}
