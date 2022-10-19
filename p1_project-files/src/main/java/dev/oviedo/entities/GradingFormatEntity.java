package dev.oviedo.entities;

public enum GradingFormatEntity {

    PASS_FAIL(1),
    LETTER_GRADE(2),
    OTHER(3);

    private int gradingFormatID;

    private GradingFormatEntity(int gradingFormatID){
        this.gradingFormatID = gradingFormatID;
    }
}
