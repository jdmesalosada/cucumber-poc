package com.jmconsultant.hellocucumber.util;

import java.util.ResourceBundle;

public class TestDataReader {

    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("dev");
        }
    }

    public static String getTestData(String key) {
        return resourceBundle().getString(key);
    }
}
