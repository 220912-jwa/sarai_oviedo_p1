package dev.oviedo.driver;

import dev.oviedo.controllers.*;
import dev.oviedo.daos.*;
import dev.oviedo.services.*;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import static io.javalin.apibuilder.ApiBuilder.*;

public class AppDriver {

    public static void main(String[] args){

        //DAOs:
        ReimbursementFormDAO rfDAO = new ReimbursementFormDAO();

        //Services:
        ReimbursementFormService rFService = new ReimbursementFormService(rfDAO);

        //Controllers:
        UserCredentialsAuthenticationController uAC = new UserCredentialsAuthenticationController(
                new UserCredentialsAuthenticationService(new UserCredentialsDAO()));

        ReimbursementFormController rFController = new ReimbursementFormController(rFService);

        //start Javalin:
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).start(8080);

        //End-points:
        app.routes(()-> {

            path("/authenticate", () -> {
                post(uAC.login);
            });

            /*path("/logout", () -> {

                delete(ctx -> {
                    ctx.req.getSession().invalidate();
                });

            });*/

            path("/all-requests", () ->{

                get(rFController::getAllRequests);

                path("/{staffID}", () ->{

                    get(rFController::getAllRequestsByStaffID);

                });

            });

            //createRequestPath

        });

        //session manager
        app.get("/getSession", ctx -> {
            if (ctx.sessionAttribute("loggedInUser") != null ){
                ctx.json(ctx.sessionAttribute("loggedInUser"));
            }
        });

    }
}
