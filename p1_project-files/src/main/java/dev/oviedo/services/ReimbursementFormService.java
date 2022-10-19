package dev.oviedo.services;

import dev.oviedo.daos.ReimbursementFormDAO;
import dev.oviedo.entities.ReimbursementFormEntity;

import java.util.List;

public class ReimbursementFormService {

    private ReimbursementFormDAO reimbursementFormDAO;

    public ReimbursementFormService (ReimbursementFormDAO reimbursementFormDAO){
        this.reimbursementFormDAO = reimbursementFormDAO;
    }

    public static ReimbursementFormEntity getRequestByStaffID(int staffID){
        return ReimbursementFormDAO.getRequestByStaffID(staffID);
    }

    public static ReimbursementFormEntity getAllRequests(){
        return ReimbursementFormDAO.getAllRequests();
    }

}
