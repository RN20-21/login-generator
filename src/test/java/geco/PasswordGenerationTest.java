package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PasswordGenerationTest {
    private PasswordGeneration pg;
    @Before
    public void constructor(){
        pg = new PasswordGeneration();
    }

    @Test
    public void PasswordGenerationConstructorTest(){
        assertNotNull(pg);
    }

    @Test
    public void getRandomPasswordTest(){
        assertEquals(8,pg.getRandomPassword().length());
    }
}
