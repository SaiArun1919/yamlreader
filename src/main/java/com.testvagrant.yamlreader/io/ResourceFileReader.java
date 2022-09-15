package com.testvagrant.yamlreader.io;

import com.testvagrant.yamlreader.YamlBeansFileReader;

import java.io.File;
import java.io.InputStream;

public class ResourceFileReader {
    public File getFile(String path) {
        return new File(YamlBeansFileReader.class.getClassLoader().getResource(path).getFile());
    }

    public InputStream getFileAsStream(String path) {
        InputStream inputStream  = this.getClass()
                .getClassLoader()
                .getResourceAsStream(path);
        return inputStream;
    }
}
