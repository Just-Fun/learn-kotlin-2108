package com.serzh.controller;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeRestControllerRestTemplateTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() {
        Java6Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/employees",
            String.class)).contains("[]");
    }
}

 /*   @Test
    fun whenCalled_thenShouldReturnJson() {
        val result = testRestTemplate.withBasicAuth("user", "pass")
            .getForEntity("/hello-dto", HelloDto::class.java)

        assertNotNull(result)
        assertEquals(HttpStatus.OK, result?.statusCode)
        assertEquals(result?.body, HelloDto("Hello from the dto"))*/
