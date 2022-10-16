package dev.oviedo.services;

import dev.oviedo.daos.UserCredentialsDAO;
import dev.oviedo.entities.UserCredentialsEntity;

public class UserCredentialsAuthenticationService {

    private UserCredentialsDAO userCredentialsDAO;

    public UserCredentialsAuthenticationService (UserCredentialsDAO userCredentialsDAO){
        this.userCredentialsDAO = userCredentialsDAO;
    }

    public UserCredentialsEntity userLogin(String userName, String userPass){

        UserCredentialsEntity u = userCredentialsDAO.getUserByUsername(userName);

        if (u.getUserPass().equals(userPass)) {
            return u;
        }

        return null;
    }

}
