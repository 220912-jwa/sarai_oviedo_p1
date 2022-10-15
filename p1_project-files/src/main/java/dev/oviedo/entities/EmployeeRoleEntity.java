package dev.oviedo.entities;

public enum EmployeeRoleEntity {
    //connects w lvl0 employee-role-db
    //this entity displays information

    FINANCE_MANAGER (1),
    EMPLOYEE (2);

    private int roleID;

    private EmployeeRoleEntity(int roleID){
        this.roleID = roleID;
    }

}
