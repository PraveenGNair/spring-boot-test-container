package com.samples.springboot.containers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.WebApplicationContext;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.containsInAnyOrder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PersonResourceTests {

    @Autowired
    WebApplicationContext wac;

    @Test
    void testFindAllReturnsName()
    {
        given()
                .webAppContextSetup(wac)
        .when()
                .get("/persons")
        .then()
                .status(HttpStatus.OK)
                .body(
                        "_embedded.persons.firstName", containsInAnyOrder("Little"),
                        "_embedded.persons.lastName", containsInAnyOrder("Red")
                );
        // @formatter:on
    }
}

