package org.example.zendo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ZendoApplication.class)
@ActiveProfiles("test")
class ZendoApplicationTest {

    @Test
    void contextLoads() {
        System.out.println("Context loaded");
    }
}