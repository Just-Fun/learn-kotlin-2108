package com.serzh.repository;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.serzh.entity.Employee;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.serzh.example.entity.Employee;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(SpringExtension::class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ActiveProfiles("test")
//@ContextConfiguration(classes = {MySqlTestConfiguration.class})
//@Transactional
//@Rollback
//@SpringBootTest
@RunWith(SpringRunner.class)
@DataJpaTest
//@ExtendWith(SpringExtension.class)
public class EmployeeRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void name() {

    }

    @Test
    public void test() {
        Employee employee = new Employee();
        employee.setName("Vas");

        entityManager.persist(employee);
        //		entityManager.flush()

        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());

        assertThat(optionalEmployee.get()).isEqualTo(employee);
    }

}