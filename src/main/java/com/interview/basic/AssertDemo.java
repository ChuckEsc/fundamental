package com.interview.basic;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.junit.jupiter.api.*;
import org.springframework.util.Assert;


public class AssertDemo {
    public static void main(String[] args) {
        Assert.isNull("null");
    }
}

class FlyWayDemo{
    public static void main(String[] args) {
        ClassicConfiguration configuration = new ClassicConfiguration();
        Flyway flyway = new Flyway(configuration);
    }
}
