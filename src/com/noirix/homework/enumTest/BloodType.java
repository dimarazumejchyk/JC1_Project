package com.noirix.homework.enumTest;

public enum BloodType {
    FIRST_P("rhFactor+"),
    FIRST_M("rhFactor-"),
    SECOND_P("rhFactor+"),
    SECOND_M("rhFactor-"),
    THIRD_P("rhFactor+"),
    THIRD_M("rhFactor-"),
    FOURTH_P("rhFactor+"),
    FOURTH_M("rhFactor-");
    private String rhFactor;

    BloodType(String rhFactor) {

        this.rhFactor = rhFactor;
    }

    public String getRhFactor() {

        return rhFactor;
    }

}