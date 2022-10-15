package dev.oviedo.entities;

public class UserCredentialsEntity {
//connects with lvl1 login-db
    private int userID;
    private String userName;
    private String userPass;
    private String userRole;
    private String userFName;
    private String userLName;

    public UserCredentialsEntity() {
        //no args constructor
    }

    public UserCredentialsEntity(int userID, String userName, String userPass, String userRole, String userFName, String userLName){
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

    public String getUserName(){
        return userName;
    }

    public void setUserName(){
        this.userName = userName;
    }

    public String getUserPass(){
        return userPass;
    }

    public void setUserPass(){
        this.userPass = userPass;
    }

    public String getUserRole(){
        return userRole;
    }

    public void setUserROle(){
        this.userRole = userRole;
    }

    public String getUserFName(){
        return userFName;
    }

    public void setUserFName(){
        this.userFName = userFName;
    }

    public String getUserLName(){
        return userLName;
    }

    public void setUserLName(){
        this.userLName = userLName;
    }

}
