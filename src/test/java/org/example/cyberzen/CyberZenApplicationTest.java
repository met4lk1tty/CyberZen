package org.example.cyberzen;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = CyberZenApplication.class)
@ActiveProfiles("test")
class CyberZenApplicationTest {

    @Test
    void contextLoads() {
        System.out.println("Context loaded");
    }
}