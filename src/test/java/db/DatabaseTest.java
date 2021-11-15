package db;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals(new Database ().getUserData(), "hello");
    }

    @org.junit.jupiter.api.Test
    void getStaticData() {
        assertEquals(new Database ().getStaticData(), "hello2");
    }
}