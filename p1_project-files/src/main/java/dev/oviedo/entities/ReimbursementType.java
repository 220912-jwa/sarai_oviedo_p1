package dev.oviedo.entities;

public enum ReimbursementType {
    //connects w reimbursement-types-db

    UNIVERSITY_COURSE(1),
    SEMINAR(2),
    CERTIFICATION_PREPARATION_COURSE(3),
    CERTIFICATION(4),
    TECHNICAL_TRAINING(5),
    OTHER(6),
    NONE(7);

    private int eventID;

    private ReimbursementType(int eventID){
        this.eventID = eventID;
    }

}
