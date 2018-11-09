package com.serzh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serzh.entity.Employee;
import com.serzh.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employeeService.retrieveEmployees();
    }

    @GetMapping("/api/employees/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        Optional<Employee> employee = employeeService.getEmployee(employeeId);
        return employee.orElse(null);
//         .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PostMapping("/api/employees")
    public void saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
       log.info("Employee Saved Successfully");
    }

    @DeleteMapping("/api/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        log.info("Employee Deleted Successfully");
    }

    @PutMapping("/api/employees/{employeeId}")
    public void updateEmployee(@RequestBody Employee employee,
        @PathVariable(name = "employeeId") Long employeeId) {
        employeeService.getEmployee(employeeId)
            .ifPresent(employee1 -> employeeService.updateEmployee(employee));

    }

}

/*import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/article")
class ArticleController(private val repository: ArticleRepository,
						private val markdownConverter: MarkdownConverter) {

	@GetMapping("/")
	fun findAll() = repository.findAllByOrderByAddedAtDesc()

	@GetMapping("/{id}")
	fun findOne(@PathVariable id: Long, @RequestParam converter: String?) = when (converter) {
		"markdown" -> repository.findById(id).map { it.copy(
				headline = markdownConverter.invoke(it.headline),
				content = markdownConverter.invoke(it.content)) }
		null -> repository.findById(id)
		else -> throw IllegalArgumentException("Only markdown converter is supported")
	}
}

@RestController
@RequestMapping("/api/user")
class UserController(private val repository: UserRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAll()

	@GetMapping("/{login}")
	fun findOne(@PathVariable login: String) = repository.findById(login)
}*/
