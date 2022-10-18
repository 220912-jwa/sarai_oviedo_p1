package dev.oviedo.daos;

import dev.oviedo.entities.ReimbursementFormEntity;
import dev.oviedo.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReimbursementFormDAO {

    private ConnectionUtil genCU = ConnectionUtil.getConnectionUtil();

    public ReimbursementFormEntity getAllRequests(){

        //PostgreSQL Query
        //PreparedStatement

        return null;
    }

    public ReimbursementFormEntity getRequestByStaffID(int staffID){

        String sql = "SELECT * FROM tuition_reimbursement WHERE tuition_reimbursement.staff_id = ?;";

        //PreparedStatement
        try (Connection genCon = genCU.getConnection()) {

            PreparedStatement ps = genCon.prepareStatement(sql);


        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

}
