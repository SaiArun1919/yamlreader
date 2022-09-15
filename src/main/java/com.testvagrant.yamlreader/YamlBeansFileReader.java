package com.testvagrant.yamlreader;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class YamlBeansFileReader {

    public <T> T read(File filePath, Class<T> tClass) throws FileNotFoundException, YamlException {
        YamlReader yamlReader = new YamlReader(new FileReader(filePath));
        T obj = yamlReader.read(tClass);
        return obj;
    }

    public Object readAsMap(File filePath, String value) throws FileNotFoundException, YamlException {
        YamlReader yamlReader = new YamlReader(new FileReader(filePath));
        Map read = (Map) yamlReader.read();
        return read.get(value);
    }

    public Object readAsMapWithConfig(File filePath, String value, boolean configValue) throws FileNotFoundException, YamlException {
        YamlConfig yamlConfig = new YamlConfig();
        yamlConfig.setAllowDuplicates(configValue);
        YamlReader yamlReader = new YamlReader(new FileReader(filePath),yamlConfig);
        Map read = (Map) yamlReader.read();
        return read.get(value);
    }

}

