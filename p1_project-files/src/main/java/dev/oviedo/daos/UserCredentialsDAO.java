package dev.oviedo.daos;

import dev.oviedo.entities.UserCredentialsEntity;
import dev.oviedo.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserCredentialsDAO {

    private ConnectionUtil genCU = ConnectionUtil.getConnectionUtil();

    public UserCredentialsEntity getUserByUsername(String userName){

        String sql = "SELECT user_name, user_pass, user_role, user_fname, user_lname FROM login WHERE user_name = ?;";

        try (Connection genCon = genCU.getConnection()){

            PreparedStatement genPS = genCon.prepareStatement(sql);
            genPS.setString(1, userName);
            ResultSet genRS = genPS.executeQuery();

            if (genRS.next()){
                return new UserCredentialsEntity(
                    genRS.getString("user_name"),
                    genRS.getString("user_pass"),
                    genRS.getInt("user_role"),
                    genRS.getString("user_fname"),
                    genRS.getString("user_lname")
                    );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
}
