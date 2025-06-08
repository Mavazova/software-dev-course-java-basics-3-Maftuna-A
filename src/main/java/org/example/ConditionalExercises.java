package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int number) {
        if (number < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teen";
        } else {
            return "Adult";
        }
    }



    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }
}