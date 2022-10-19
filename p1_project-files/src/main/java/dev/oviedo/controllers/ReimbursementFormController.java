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

    public void getAllRequestsByStaffID(Context ctx){
        int staffID = Integer.parseInt(ctx.pathParam("staffID"));
        ReimbursementFormEntity requests = ReimbursementFormService.getRequestByStaffID(staffID);
        //implement a list
        ctx.status(200);
        ctx.json(requests);
    }

    public void getAllRequests(Context ctx){
        ReimbursementFormEntity requests = ReimbursementFormService.getAllRequests();
        //implement a list
        ctx.status(200);
        ctx.json(requests);
    }

}
