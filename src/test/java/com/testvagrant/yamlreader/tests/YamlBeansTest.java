package com.testvagrant.yamlreader.tests;

import com.esotericsoftware.yamlbeans.YamlException;
import com.google.inject.Inject;
import com.testvagrant.yamlreader.YamlBeansFileReader;
import com.testvagrant.yamlreader.io.ResourceFileReader;
import com.testvagrant.yamlreader.tests.models.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class YamlBeansTest extends BaseTest {
    @Inject
    ResourceFileReader resourceFileReader;

    @Test
    public void readAsAnObject() throws YamlException, FileNotFoundException {
        File file = resourceFileReader.getFile("data/employee.yml");
        Employee employee = new YamlBeansFileReader().read(file, Employee.class);
        Assert.assertEquals(employee.getId(),"1");
        Assert.assertEquals(employee.getAge(),35);
    }

    @Test
    public void readAsMap() throws YamlException, FileNotFoundException {
        File file = resourceFileReader.getFile("data/employee.yml");
        Object salary = new YamlBeansFileReader().readAsMap(file, "salary");
        Assert.assertTrue(salary.equals("1000"));
    }

    @Test
    public void readByIgnoringDuplicateKeyByChangingConfig() throws YamlException, FileNotFoundException {
        File file = resourceFileReader.getFile("data/duplicatekey.yml");
        Object read = new YamlBeansFileReader().readAsMapWithConfig(file, "address",true);
        Assert.assertTrue(read.toString().contains("NYC"));
    }
}
