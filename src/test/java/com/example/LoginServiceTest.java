import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService service = new LoginService();
        assertTrue(service.login("admin", "1234"));
    }

    @Test
    public void testInvalidLogin() {
        LoginService service = new LoginService();
        assertFalse(service.login("user", "wrong"));
    }
}
