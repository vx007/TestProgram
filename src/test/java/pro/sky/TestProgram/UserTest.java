package pro.sky.TestProgram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User out;

    @BeforeEach
    void setUp() {
        out = new User("login-test", "email@test.com");
    }

    @Test
    void createUserObjectWithParams() {
        assertNotNull(out.getLogin());
        assertNotNull(out.getEmail());
    }

    @Test
    void createUserObjectWithoutParams() {
        User out = new User();
        assertNull(out.getLogin());
        assertNull(out.getEmail());
    }

    @Test
    void checkCorrectEmail() {
        assertTrue(out.getEmail().contains("@"));
        assertTrue(out.getEmail().contains("."));
    }

    @Test
    void checkLoginAndEmailAreNotEquals() {
        assertNotEquals(out.getLogin(), out.getEmail());
    }
}