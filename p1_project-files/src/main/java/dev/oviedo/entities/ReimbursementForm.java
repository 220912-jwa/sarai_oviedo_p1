package dev.oviedo.entities;

public class ReimbursementForm extends Staff{
    //connects w tuition-reimbursement-form-db

    //inherit staffID
    //inherit staffFName
    //inherit staffLName
    //inherit availableReimbursement

    private int requestID;
    private String requestDate;
    private String eventDate;
    private String eventLocation;
    private String eventDescription;
    private int eventCost;
    private ReimbursementType eventType;
    private String workJustification;
    private String missedWorktime;
    private String alreadyApproved;
    private ReimbursementType alreadyApprovedType;

    public ReimbursementForm(){
        //no args constructor
    }

    public ReimbursementForm(int staffID, String staffFName, String staffLName, int availableReimbursement,
                             int requestID, int requestDate, String eventDate, String eventLocation,
                             String eventDescription, int eventCost, ReimbursementType eventType,
                             String workJustification, String missedWorktime, String alreadyApproved,
                             ReimbursementType alreadyApprovedType){
        //this.staffID = getStaffID();
        //this.staffFName = getStaffFName;
        //this.staffLName = getStaffLName;
        //this.availableReimbursement = getAvailableReimbursement;
    }
}
