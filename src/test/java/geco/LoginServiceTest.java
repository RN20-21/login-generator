package geco;


import com.sun.org.apache.xerces.internal.xs.StringList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    @Test
    public void LoginServiceConstructorTest() {
        String[] s = {"1","2","3"};
        assertNotNull(new LoginService(s));
    }

    @Test
    public void loginExistsTest(){
        LoginService logins = new LoginService (new String[]{"1","2","3"});
        assertTrue(logins.loginExists("1"));
    }

    @Test
    public void addLoginTest() {
        LoginService logins = new LoginService (new String[]{"1","2","3"});
        logins.addLogin("4");
        assertEquals(
                new ArrayList<String>(){{add("1"); add("2"); add("3"); add("4");}}
                , logins.findAllLogins( ));
    }

    @Test
    public void findAllLoginsStartingWithTest() {
        final LoginService logins = new LoginService (new String[]{"123","456","789"});
        assertEquals(new ArrayList<String>(){{add("123");}}, logins.findAllLoginsStartingWith("1"));
    }

    @Test
    public void findAllLoginsTest() {
        LoginService logins = new LoginService (new String[]{"1","2","3"});
        assertEquals(
                new ArrayList<String>(){{add("1"); add("2"); add("3");}}
                , logins.findAllLogins());
    }
}
