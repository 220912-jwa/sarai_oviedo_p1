package dev.oviedo.entities;

public class StaffEntity {

    private int staffID;
    private String staffFName;
    private String staffLName;
    private int availableReimbursement = 1000;

    public StaffEntity(){ }

    public StaffEntity(int staffID, String staffFName, String staffLName, int availableReimbursement){
        this.staffID = staffID;
        this.staffFName = staffFName;
        this.staffLName = staffLName;
        this.availableReimbursement = availableReimbursement;
    }



    public int getStaffID(){
        return staffID;
    }

    public void setStaffID(){
        this.staffID = staffID;
    }

    public String getStaffFName(){
        return staffFName;
    }

    public void setStaffFName(){
        this.staffFName = staffFName;
    }

    public String getStaffLName(){
        return staffLName;
    }

    public void setStaffLName (){
        this.staffLName = staffLName;
    }

    public int getAvailableReimbursement(){
        return availableReimbursement;
    }

    public void setAvailableReimbursement(){
        this.availableReimbursement = availableReimbursement;
    }

    @Override
    public String toString(){

        return "Staff{" +
                "staffID=" + staffID +
                ", staffFName='" + staffFName + '\'' +
                ", staffLName='" + staffLName + '\'' +
                ", availableReimbursement='" + availableReimbursement + '\'' +
                '}';

    }
}
