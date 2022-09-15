package com.testvagrant.yamlreader;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

public class SnakeYamlFileReader {
    public <T> T read(InputStream filePath, Class<T> tClass) {
        Yaml yaml = new Yaml(new Constructor(tClass));
        return yaml.load(filePath);
    }
}
