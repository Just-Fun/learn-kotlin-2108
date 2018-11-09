package com.serzh.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.serzh.entity.Employee;
import com.serzh.service.EmployeeService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeRestController.class)
public class EmployeeRestControllerMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService service;

    @Test
    public void contextLoads() {
        assertThat(service).isNotNull();
    }

    @Test
    public void getEmployeesTest() throws Exception {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(9L);
        employee.setName("Vasilii");
        employees.add(employee);

        when(service.retrieveEmployees()).thenReturn(employees);

        this.mockMvc.perform(get("/api/employees")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Vasilii")));
    }

}

/*@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(KotlinDemoApplication::class),
  webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinDemoApplicationTests {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_shouldReturnHello() {
        val result = testRestTemplate
          // ...
          .getForEntity("/hello", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "hello world")
    }
}*/