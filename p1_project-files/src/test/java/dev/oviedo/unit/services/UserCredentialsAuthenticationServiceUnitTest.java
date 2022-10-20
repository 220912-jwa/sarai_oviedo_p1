package dev.oviedo.unit.services;

import dev.oviedo.daos.UserCredentialsDAO;
import dev.oviedo.services.UserCredentialsAuthenticationService;
import dev.oviedo.entities.UserCredentialsEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserCredentialsAuthenticationServiceUnitTest {

    private static UserCredentialsAuthenticationService authenticationService;

    private static UserCredentialsDAO userCredentialsDAO;

    @BeforeAll
    public static void setup(){
        userCredentialsDAO = new UserCredentialsDAO();
        authenticationService = new UserCredentialsAuthenticationService(userCredentialsDAO);
    }

    @ParameterizedTest
    @CsvFileSource(resources="/mockUsers.csv", numLinesToSkip = 1)
    public void loginTest(String userName, String userPass){
        UserCredentialsEntity u = authenticationService.userLogin(userName, userPass);
        assertEquals(userName, u.getUserName());
    }
}
