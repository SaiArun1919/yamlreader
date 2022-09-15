package com.testvagrant.yamlreader.tests;

import com.google.inject.Inject;
import com.testvagrant.yamlreader.SnakeYamlFileReader;
import com.testvagrant.yamlreader.io.ResourceFileReader;
import com.testvagrant.yamlreader.tests.models.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;

public class SnakeYamlTest extends BaseTest {
    @Inject
    ResourceFileReader resourceFileReader;

    @Test
    public void readAsAnObject() {
        InputStream file = resourceFileReader.getFileAsStream("data/employee.yml");
        Employee employee = new SnakeYamlFileReader().read(file, Employee.class);
        Assert.assertEquals(employee.getId(),"1");
        Assert.assertEquals(employee.getAge(),35);
    }
}
