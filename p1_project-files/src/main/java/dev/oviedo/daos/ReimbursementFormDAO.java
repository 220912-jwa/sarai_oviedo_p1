package dev.oviedo.daos;

import dev.oviedo.entities.GradingFormatEntity;
import dev.oviedo.entities.ReimbursementFormEntity;
import dev.oviedo.entities.ReimbursementTypeEntity;
import dev.oviedo.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ReimbursementFormDAO {

    private static ConnectionUtil genCU = ConnectionUtil.getConnectionUtil();

    public static ReimbursementFormEntity getAllRequests(){

        String sql = "SELECT staff.staff_id, \n" +
                "staff.staff_fname,\n" +
                "staff.staff_lname,\n" +
                "staff.available_reimbursement,\n" +
                "tuition_reimbursement.request_id,\n" +
                "tuition_reimbursement.request_date,\n" +
                "tuition_reimbursement.event_date,\n" +
                "tuition_reimbursement.event_time,\n" +
                "tuition_reimbursement.event_location,\n" +
                "tuition_reimbursement.event_description,\n" +
                "tuition_reimbursement.event_cost,\n" +
                "grading_format.gformat_id,\n" +
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
                "ON reimbursement_type.reimbursement_id = tuition_reimbursement.request_id;";

        try (Connection genCon = genCU.getConnection()) {

            PreparedStatement ps = genCon.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){

                ReimbursementFormEntity rF = new ReimbursementFormEntity(
                        rs.getInt("staff_id"),
                        rs.getString("staff_fname"),
                        rs.getString("staff_lname"),
                        rs.getInt("available_reimbursement"),
                        rs.getInt("request_id"),
                        rs.getDate("request_date"),
                        rs.getDate("event_date"),
                        rs.getString("event_time"),
                        rs.getString("event_location"),
                        rs.getString("event_description"),
                        rs.getDouble("event_cost"),
                        GradingFormatEntity.valueOf(rs.getString("gformat_id")),
                        ReimbursementTypeEntity.valueOf(rs.getString("request_type")),
                        rs.getString("justification"),
                        rs.getString("expected_missed_worktime"),
                        rs.getString("approvals_already_provided_file"),
                        ReimbursementTypeEntity.valueOf(rs.getString("approvals_already_provided_event_type")));

                return rF;
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public static ReimbursementFormEntity getRequestByStaffID(int staffID){

        String sql = "SELECT staff.staff_id, \n" +
                "staff.staff_fname,\n" +
                "staff.staff_lname,\n" +
                "staff.available_reimbursement,\n" +
                "tuition_reimbursement.request_id,\n" +
                "tuition_reimbursement.request_date,\n" +
                "tuition_reimbursement.event_date,\n" +
                "tuition_reimbursement.event_time,\n" +
                "tuition_reimbursement.event_location,\n" +
                "tuition_reimbursement.event_description,\n" +
                "tuition_reimbursement.event_cost,\n" +
                "grading_format.gformat_id,\n" +
                "tuition_reimbursement.request_type,\n" +
                "tuition_reimbursement.justification,\n" +
                "tuition_reimbursement.expected_missed_worktime,\n" +
                "tuition_reimbursement.approvals_already_provided_file,\t\n" +
                "tuition_reimbursement.approvals_already_provided_event_type\n" +
                "FROM tuition_reimbursement\n" +
                "JOIN staff\n" +
                "ON tuition_reimbursement.staff_id = staff.staff_id\n" +
                "JOIN grading_format\n" +
                "ON tuition_reimbursement.gformat_id = grading_format.gformat_id\n" +
                "JOIN reimbursement_type\n" +
                "ON reimbursement_type.reimbursement_id = tuition_reimbursement.request_id\n" +
                "WHERE tuition_reimbursement.staff_id = ?;";

        try (Connection genCon = genCU.getConnection()) {

            PreparedStatement ps = genCon.prepareStatement(sql);
                ps.setInt(1, staffID);

                ResultSet rs = ps.executeQuery();

                if (rs.next()){

                    ReimbursementFormEntity rF = new ReimbursementFormEntity(
                            rs.getInt("staff_id"),
                            rs.getString("staff_fname"),
                            rs.getString("staff_lname"),
                            rs.getInt("available_reimbursement"),
                            rs.getInt("request_id"),
                            rs.getDate("request_date"),
                            rs.getDate("event_date"),
                            rs.getString("event_time"),
                            rs.getString("event_location"),
                            rs.getString("event_description"),
                            rs.getDouble("event_cost"),
                            GradingFormatEntity.valueOf(rs.getString("gformat_id")),
                            ReimbursementTypeEntity.valueOf(rs.getString("request_type")),
                            rs.getString("justification"),
                            rs.getString("expected_missed_worktime"),
                            rs.getString("approvals_already_provided_file"),
                            ReimbursementTypeEntity.valueOf(rs.getString("approvals_already_provided_event_type")));

                    return rF;
                }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public ReimbursementFormEntity createNewRequest(ReimbursementFormEntity reimbursementForm){

        //sql
        //preparedStatement

        return null;
    }

}
