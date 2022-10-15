package dev.oviedo.daos;

import dev.oviedo.entities.UserCredentialsEntity;
import dev.oviedo.utils.ConnectionUtil;

public class UserCredentialsDAO implements GenericDAO<UserCredentialsEntity> {

    private ConnectionUtil genCU = ConnectionUtil.getConnectionUtil();

    public UserCredentialsEntity getUserByUsername(){

        String sql = "";

        return null;


    }

    @Override
    public void update(UserCredentialsEntity tUpdated) {

    }
}
