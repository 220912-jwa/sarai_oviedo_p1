package dev.oviedo.entities;

public class ReimbursementForm extends Staff{

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
    private GradingFormat gradeFormatID;
    private ReimbursementType requestType;
    private String workJustification;
    private String missedWorktime;
    private String alreadyApproved;
    private ReimbursementType alreadyApprovedType;

    public ReimbursementForm(){
        //no args constructor
    }

    public ReimbursementForm(int staffID, String staffFName, String staffLName, int availableReimbursement,
                             int requestID, String requestDate, String eventDate, String eventLocation,
                             String eventDescription, int eventCost, ReimbursementType eventType,
                             String workJustification, String missedWorktime, String alreadyApproved,
                             ReimbursementType alreadyApprovedType){

        super(staffID, staffFName, staffLName, availableReimbursement);
        this.requestID = requestID;
        this.requestDate = requestDate;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.eventCost = eventCost;
        this.requestType = eventType;
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

    public ReimbursementType getRequestType(){
        return requestType;
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

    public ReimbursementType getAlreadyApprovedType(){
        return alreadyApprovedType;
    }

    public void setAlreadyApprovedType(){
        this.alreadyApprovedType = alreadyApprovedType;
    }

    @Override
    public String toString(){
        return "ReimbursementForm{" +
                "request_id=" + requestID +
                ", request_date='" + requestDate + '\'' +
                ", event_date='" + eventDate + '\'' +
                ", event_time=" + eventTime +
                ", event_location=" + eventLocation +
                ", event_description=" + eventDescription +
                ", event_cost=" + eventCost +
                ", gformat_id=" + gradeFormatID +
                ", request_type=" + requestType +
                ", request_type=" + workJustification +
                ", work_related_justification=" + missedWorktime +
                ", expected_missed_worktime=" + alreadyApproved +
                ", approvals_already_provided_file=" + alreadyApprovedType +
                ", approvals_already_provided_event_type=" + alreadyApprovedType +
                '}';
    }
}
