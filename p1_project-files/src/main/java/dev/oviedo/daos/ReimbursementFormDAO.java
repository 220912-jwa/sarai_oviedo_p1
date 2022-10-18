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

        String sql = "SELECT staff.staff_fname,\n" +
                "staff.staff_lname,\n" +
                "tuition_reimbursement.request_date,\n" +
                "tuition_reimbursement.event_date,\n" +
                "tuition_reimbursement.event_time,\n" +
                "tuition_reimbursement.event_location,\n" +
                "tuition_reimbursement.event_description,\n" +
                "tuition_reimbursement.event_cost,\n" +
                "grading_format.gformat_name,\n" +
                "tuition_reimbursement.request_type,\n" +
                "tuition_reimbursement.justification,\n" +
                "tuition_reimbursement.expected_missed_worktime,\n" +
                "tuition_reimbursement.approvals_already_provided_file,\n" +
                "tuition_reimbursement.approvals_already_provided_event_type\n" +
                "FROM tuition_reimbursement\n" +
                "JOIN staff\n" +
                "ON tuition_reimbursement.staff_id = staff.staff_id\n" +
                "JOIN grading_format\n" +
                "ON tuition_reimbursement.gformat_id = grading_format.gformat_id\n" +
                "JOIN reimbursement_type\n" +
                "ON reimbursement_type.reimbursement_id = tuition_reimbursement.request_id\n" +
                "WHERE tuition_reimbursement.staff_id = ?;";

        //PreparedStatement
        try (Connection genCon = genCU.getConnection()) {

            PreparedStatement ps = genCon.prepareStatement(sql);
                ps.setInt(1, staffID);

                ResultSet rs = ps.executeQuery();

                if (rs.next()){

                    ReimbursementFormEntity rF = new ReimbursementFormEntity(
                            rs.getString("staff_fname"),
                            rs.getString("staff_lname"),
                            rs.getDate("event_date"),
                            rs.getString("event_time"),
                            rs.getString("event_location"),
                            rs.getString("event_description"),
                            rs.getDouble("event_cost"),
                            rs.getString("gformat_name"),
                            rs.getString("request_type"),
                            rs.getString("justification"),
                            rs.getString("expected_missed_worktime"),
                            rs.getString("approvals_already_provided_file"),
                            rs.getString("approvals_already_provided_event_type"));

                    return rF;
                }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

}
