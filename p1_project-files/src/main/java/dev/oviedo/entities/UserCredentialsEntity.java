package dev.oviedo.entities;

public class UserCredentialsEntity {
//connects with lvl1 login-db
    private String userName;
    private String userPass;
    private int userRoleID;
    private String userFName;
    private String userLName;

    public UserCredentialsEntity() {
        //no args constructor
    }

    public UserCredentialsEntity(String userName, String userPass, int userRoleID, String userFName, String userLName){
        this.userName = userName;
        this.userPass = userPass;
        this.userRoleID = userRoleID;
        this.userFName = userFName;
        this.userLName = userLName;
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

    public int getUserRole(){
        return userRoleID;
    }

    public void setUserROle(){
        this.userRoleID = userRoleID;
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

    @Override
    public String toString() {
        return "UserCredentialsEntity{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userRoleID=" + userRoleID +
                ", userFName='" + userFName + '\'' +
                ", userLName='" + userLName + '\'' +
                '}';
    }
}
