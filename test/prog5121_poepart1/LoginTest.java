/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog5121_poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maanda Mahuwa
 */
public class LoginTest {
    
    public LoginTest() {
    }


    @Test
    public void testValidUsername() {
        Login login = new Login();
        login.setUsername("kyl_1");
        assertTrue(login.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Login login = new Login();
        login.setUsername("kyle!!!!!!!");
        assertFalse(login.checkUserName());
    }

    @Test
    public void testValidPassword() {
        Login login = new Login();
        login.setPassword("Ch&&sec@ke99!");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {
        Login login = new Login();
        login.setPassword("password");
        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testValidPhone() {
        Login login = new Login();
        login.setCellPhone("+27838968976");
        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidPhone() {
        Login login = new Login();
        login.setCellPhone("08966553");
        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccess() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        assertFalse(login.loginUser("wrong", "wrong"));
    }

    @Test
    public void testRegisterSuccess() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setCellPhone("+27838968976");

        assertEquals("User registered successfully.", login.registerUser());
    }

    @Test
    public void testRegisterUsernameFail() {
        Login login = new Login();
        login.setUsername("kyle!!!!!!!");
        login.setPassword("Ch&&sec@ke99!");
        login.setCellPhone("+27838968976");

        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", login.registerUser());
    }

    @Test
    public void testRegisterPasswordFail() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("password");
        login.setCellPhone("+27838968976");

        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", login.registerUser());
    }

    @Test
    public void testRegisterPhoneFail() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setCellPhone("08966553");

        assertEquals("Cell phone number incorrectly formatted or does not contain international code.", login.registerUser());
    }

    @Test
    public void testLoginStatusSuccess() {
        Login login = new Login();
        assertEquals("Welcome John, Smith it is great to see you again.",
                login.returnLoginStatus("John", "Smith", true));
    }

    @Test
    public void testLoginStatusFail() {
        Login login = new Login();
        assertEquals("Username or password incorrect, please try again.",
                login.returnLoginStatus("John", "Smith", false));
    }
}