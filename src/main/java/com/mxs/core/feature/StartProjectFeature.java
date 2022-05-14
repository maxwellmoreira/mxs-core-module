package com.mxs.core.feature;

import com.mxs.core.dto.StartProjectDto;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class StartProjectFeature {

    private static final String PATH = "/home/mxs/Downloads";
    private static final String REPOSITORY = "REPOSITORY";
    private static final String PACKAGE = "PACKAGE";
    private static final String REPOSITORY_SRC_MAIN_JAVA = "/" + REPOSITORY + "/src/main/java/" + PACKAGE;
    private static final String REPOSITORY_SRC_TEST_JAVA = "/" + REPOSITORY + "/src/test/java/" + PACKAGE;
    private static final String REPOSITORY_SRC_MAIN_RESOURCES = "/" + REPOSITORY + "/src/main/resources/";
    private static final String REPOSITORY_SRC_TEST_RESOURCES = "/" + REPOSITORY + "/src/test/resources/";
    private static final String APPLICATION_PROPERTIES = "application.properties";

    public void startProject(StartProjectDto startProjectDto) throws IOException {
        createPackages(startProjectDto);
    }

    private void createPackages(StartProjectDto startProjectDto) throws IOException {

        String repositorySrcMainJavaPackage =
                REPOSITORY_SRC_MAIN_JAVA
                        .replace(REPOSITORY, startProjectDto.getRepositoryName())
                        .replace(PACKAGE, startProjectDto.getPackageBase().replace(".", "/"));

        createPackage(repositorySrcMainJavaPackage);

        String repositorySrcTestJavaPackage =
                REPOSITORY_SRC_TEST_JAVA
                        .replace(REPOSITORY, startProjectDto.getRepositoryName())
                        .replace(PACKAGE, startProjectDto.getPackageBase().replace(".", "/"));

        createPackage(repositorySrcTestJavaPackage);

        String repositorySrcMainResources =
                REPOSITORY_SRC_MAIN_RESOURCES.replace(REPOSITORY, startProjectDto.getRepositoryName());

        createPackage(repositorySrcMainResources);
        createFile(repositorySrcMainResources + APPLICATION_PROPERTIES);

        String repositorySrcTestResources =
                REPOSITORY_SRC_TEST_RESOURCES.replace(REPOSITORY, startProjectDto.getRepositoryName());

        createPackage(repositorySrcTestResources);
        createFile(repositorySrcTestResources + APPLICATION_PROPERTIES);
    }

    private boolean createPackage(String path) {
        File file = new File(PATH + path);
        return file.mkdirs();
    }

    private boolean createFile(String path) throws IOException {
        File file = new File(PATH + path);
        return file.createNewFile();
    }
}
