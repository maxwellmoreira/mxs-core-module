package com.mxs.core.feature;

import com.mxs.core.dto.CreateClassDto;
import com.mxs.core.enumerator.AccessModifierEnumerator;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class CreateClassFeature {

    private static final String FILE_EXTENSION = ".java";

    public void createClass(CreateClassDto createClassDto) throws IOException {
        String fullPath = createClassDto.getPath() + createClassDto.getClassName() + FILE_EXTENSION;
        boolean fileCreated = createFile(fullPath);
        if (fileCreated) {
            writeFile(
                    fullPath,
                    AccessModifierEnumerator.valueOf(createClassDto.getAccessModifier()),
                    createClassDto.getClassName());
        }
    }

    private boolean createFile(String fullPath) throws IOException {
        File file = new File(fullPath);
        return file.createNewFile();
    }

    private void writeFile(String fullPath, AccessModifierEnumerator accessModifierEnumerator, String className) throws IOException {
        FileWriter fileWriter = new FileWriter(fullPath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.printf("%s class %s {", accessModifierEnumerator.getCode(), className);
        printWriter.print("");
        printWriter.printf("}");
        printWriter.close();
    }
}
