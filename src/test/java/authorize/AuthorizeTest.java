package authorize;

import db.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizeTest {

    @Test
    void auth() {
        assertTrue(new Authorize().auth(new Database()));
    }
}