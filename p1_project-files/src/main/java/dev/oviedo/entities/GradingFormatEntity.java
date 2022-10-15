package dev.oviedo.entities;

public enum GradingFormatEntity {
    //connects w lvl0 grading-formats-db

    PASS_FAIL(1),
    LETTER_GRADE(2),
    OTHER(3);

    private int gradingFormatID;

    private GradingFormatEntity(int gradingFormatID){
        this.gradingFormatID = gradingFormatID;
    }
}
