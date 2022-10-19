package dev.oviedo.controllers;

import dev.oviedo.entities.ReimbursementFormEntity;
import dev.oviedo.services.ReimbursementFormService;
import io.javalin.http.Context;
import java.io.IOException;
import java.util.List;

public class ReimbursementFormController {

    private ReimbursementFormService reimbursementFormService;

    public ReimbursementFormController(ReimbursementFormService reimbursementFormService){
        this.reimbursementFormService = reimbursementFormService;
    }

    //handler

    public void getAllRequestsByStaffID(Context ctx){
        int staffID = Integer.parseInt(ctx.pathParam("staffID"));
        List<ReimbursementFormEntity> requests = ReimbursementFormService.getRequestFormByStaffID(staffID);
        ctx.status(200);
        ctx.json(requests);
    }

    public void getAllRequests(Context ctx){
        List<ReimbursementFormEntity> requests = ReimbursementFormService.getAllRequests();
        ctx.status(200);
        ctx.json(requests);
    }

}
