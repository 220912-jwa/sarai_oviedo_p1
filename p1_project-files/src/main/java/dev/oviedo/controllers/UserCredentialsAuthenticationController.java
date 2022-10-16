package dev.oviedo.controllers;

import dev.oviedo.entities.UserCredentialsEntity;
import dev.oviedo.services.UserCredentialsAuthenticationService;
import io.javalin.http.Handler;
public class UserCredentialsAuthenticationController {

    private UserCredentialsAuthenticationService userAuthenticationService;

    public UserCredentialsAuthenticationController(UserCredentialsAuthenticationService userAuthenticationService){
        this.userAuthenticationService = userAuthenticationService;
    }

    public Handler login = ctx -> {

        UserCredentialsEntity u = ctx.bodyAsClass(UserCredentialsEntity.class);
        UserCredentialsEntity authenticatedU = userAuthenticationService.userLogin(u.getUserName(), u.getUserPass());

        ctx.sessionAttribute("loggedInUser", authenticatedU);

        if (authenticatedU != null){
            ctx.status(200);
            ctx.json(authenticatedU);
        }
    };

}
