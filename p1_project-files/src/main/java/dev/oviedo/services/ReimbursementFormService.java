package dev.oviedo.services;

import dev.oviedo.daos.ReimbursementFormDAO;
import dev.oviedo.entities.ReimbursementFormEntity;

import java.util.List;

public class ReimbursementFormService {

    private ReimbursementFormDAO reimbursementFormDAO;

    public ReimbursementFormService (ReimbursementFormDAO reimbursementFormDAO){
        this.reimbursementFormDAO = reimbursementFormDAO;
    }

    public static List<ReimbursementFormEntity> getRequestFormByStaffID(int staffID){
        return ReimbursementFormDAO.getRequestByStaffID(staffID);
    }

    public static List<ReimbursementFormEntity> getAllRequests(){
        return ReimbursementFormDAO.getAllRequests();
    }

}
