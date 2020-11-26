package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
        g.generateLoginForNomAndPrenom("Durand","Paul");
        loginService.loginExists("PDUR");
    }

    @Test
    public void deAccent(){

    }
}
