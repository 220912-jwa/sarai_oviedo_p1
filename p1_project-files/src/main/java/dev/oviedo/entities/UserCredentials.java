package dev.oviedo.entities;

import org.eclipse.jetty.server.Authentication;

public abstract class UserCredentials {
//connects with lvl1 login-db
    private int userID;
    private String userName;
    private String userPass;
    private String userRole;
    private String userFName;
    private String userLName;

    public UserCredentials() {
        //no args constructor
    }

    public UserCredentials (int userID, String userName, String userPass, String userRole, String userFName, String userLName){
        this.userID = userID;
        this.userName = userName;
        this.userPass = userPass;
        this.userRole = userRole;
        this.userFName = userFName;
        this.userLName = userLName;
    }

    public int getUserID(){
        return userID;
    }

    public void setUserID(){
        this.userID = userID;
    }

}
