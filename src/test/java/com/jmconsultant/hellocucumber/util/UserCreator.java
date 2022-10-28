package com.jmconsultant.hellocucumber.util;

import com.jmconsultant.hellocucumber.model.User;

public class UserCreator {

    public static User noValidUser() {
        User user = new User();
        user.setPassword(TestDataReader.getTestData("novalid.user.name"));
        user.setUsername(TestDataReader.getTestData("novalid.user.password"));
        return user;
    }

    public static User validUser() {
        User user = new User();
        user.setPassword(TestDataReader.getTestData("valid.user.name"));
        user.setUsername(TestDataReader.getTestData("valid.user.password"));
        return user;
    }

    public static User blockedUser() {
        User user = new User();
        user.setPassword(TestDataReader.getTestData("blocked.user.name"));
        user.setUsername(TestDataReader.getTestData("blocked.user.password"));
        return user;
    }

    public static User getUserByType(String type) {

        switch (type) {

            case "blocked":
                return blockedUser();

            case "no valid user":
                return noValidUser();

            case "valid user":
                return validUser();

            default:
                throw new IllegalArgumentException("No user type defined for: " + type);
        }
    }

}
