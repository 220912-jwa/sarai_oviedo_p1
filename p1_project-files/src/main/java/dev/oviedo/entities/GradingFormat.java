package dev.oviedo.entities;

public enum GradingFormat {
    //connects w lvl0 grading-formats-db

    PASS_FAIL(1),
    LETTER_GRADE(2),
    OTHER(3);

    private int gradingFormatID;

    private GradingFormat(int gradingFormatID){
        this.gradingFormatID = gradingFormatID;
    }
}
