package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginService loginService;
    private LoginGenerator g;
    @Before
    public void initGenerator(){
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        g = new LoginGenerator(loginService);
    }

    @Test
    public void LoginGeneratorTestConstructor(){
        assertNotNull(g);
    }

    @Test
    public void generateLoginForNomAndPrenomTest(){
        //CT1
        g.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(loginService.loginExists("PDUR"));
        //CT2
        g.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(loginService.loginExists("JRAL2"));
        //CT3
        g.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(loginService.loginExists("JROL1"));
        //CT4
        g.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(loginService.loginExists("PDUR"));

        g.generateLoginForNomAndPrenom("Du","Paul");
        assertTrue(loginService.loginExists("PDU"));
    }
}
