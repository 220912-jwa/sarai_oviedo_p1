package dev.oviedo.entities;

public class ReimbursementFormEntity extends StaffEntity {

    //connects w tuition-reimbursement-form-db

    //inherit staffID from Staff
    //inherit staffFName from Staff
    //inherit staffLName from Staff
    //inherit availableReimbursement from Staff

    private int requestID;
    private String requestDate;
    private String eventDate;
    private String eventTime;
    private String eventLocation;
    private String eventDescription;
    private int eventCost;
    private GradingFormatEntity gradeFormatID;
    private ReimbursementTypeEntity requestType;
    private String workJustification;
    private String missedWorktime;
    private String alreadyApproved;
    private ReimbursementTypeEntity alreadyApprovedType;

    public ReimbursementFormEntity(){
        //no args constructor
    }

    public ReimbursementFormEntity(int staffID, String staffFName, String staffLName, int availableReimbursement,
                                   int requestID, String requestDate, String eventDate, String eventTime, String eventLocation,
                                   String eventDescription, int eventCost, GradingFormatEntity gradeFormatID, ReimbursementTypeEntity requestType,
                                   String workJustification, String missedWorktime, String alreadyApproved,
                                   ReimbursementTypeEntity alreadyApprovedType){

        super(staffID, staffFName, staffLName, availableReimbursement);
        this.requestID = requestID;
        this.requestDate = requestDate;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.eventCost = eventCost;
        this.gradeFormatID = gradeFormatID;
        this.requestType = requestType;
        this.workJustification = workJustification;
        this.missedWorktime = missedWorktime;
        this.alreadyApproved = alreadyApproved;
        this.alreadyApprovedType = alreadyApprovedType;

    }

    public int getRequestID(){
        return requestID;
    }

    public void setRequestID(){
        this.requestID = requestID;
    }

    public String getRequestDate(){
        return requestDate;
    }

    public void setRequestDate(){
        this.requestDate = requestDate;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(){
        this.eventDate = eventDate;
    }

    public String getEventTime(){
        return eventTime;
    }

    public void setEventTime(){
        this.eventTime = eventTime;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(){
        this.eventLocation = eventLocation;
    }

    public String getEventDescription(){
        return eventDescription;
    }

    public void setEventDescription(){
        this.eventDescription = eventDescription;
    }

    public int getEventCost(){
        return eventCost;
    }

    public void setEventCost(){
        this.eventCost = eventCost;
    }

    public GradingFormatEntity getGradeFormatID(){
        return gradeFormatID;
    }

    public void setGradeFormatID(){
        this.gradeFormatID = gradeFormatID;
    }

    public ReimbursementTypeEntity getRequestType(){
        return requestType;
    }

    public void setRequestType(){
        this.requestType = requestType;
    }

    public void setEventType(){
        this.requestType = requestType;
    }

    public String getWorkJustification(){
        return workJustification;
    }

    public void setWorkJustification(){
        this.workJustification = workJustification;
    }

    public String getMissedWorktime(){
        return missedWorktime;
    }

    public void setMissedWorktime(){
        this.missedWorktime = missedWorktime;
    }

    public String getAlreadyApproved(){
        return alreadyApproved;
    }

    public void setAlreadyApproved(){
        this.alreadyApproved = alreadyApproved;
    }

    public ReimbursementTypeEntity getAlreadyApprovedType(){
        return alreadyApprovedType;
    }

    public void setAlreadyApprovedType(){
        this.alreadyApprovedType = alreadyApprovedType;
    }

    @Override
    public String toString(){
        return "ReimbursementForm{" +
                "staffID=" + getStaffID() +
                ", staffFName='" + getStaffFName() + '\'' +
                ", staffLName='" + getStaffLName()+ '\'' +
                ", availableReimbursement='" + getAvailableReimbursement() + '\'' +
                ", requestID='" + requestDate + '\'' +
                ", requestDate='" + eventDate + '\'' +
                ", eventDate=" + eventTime +
                ", eventLocation=" + eventLocation +
                ", eventDescription=" + eventDescription +
                ", eventCost=" + eventCost +
                ", gradeFormatID=" + gradeFormatID +
                ", requestType=" + requestType +
                ", workJustification=" + workJustification +
                ", missedWorktime=" + missedWorktime +
                ", alreadyApproved=" + alreadyApproved +
                ", alreadyApprovedType=" + alreadyApprovedType +
                '}';
    }
}
