package dev.oviedo.entities;

public class Staff {

    //connects w lvl0 staff-db

    private int staffID;
    private String staffFName;
    private String staffLName;
    private int availableReimbursement = 1000;

    public Staff(){ }

    public Staff(int staffID, String staffFName, String staffLName, int availableReimbursement){
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
                "staff_id=" + staffID +
                ", staff_fname='" + staffFName + '\'' +
                ", staff_lname='" + staffLName + '\'' +
                ", available_reimbursement='" + availableReimbursement + '\'' +
                '}';

    }
}
