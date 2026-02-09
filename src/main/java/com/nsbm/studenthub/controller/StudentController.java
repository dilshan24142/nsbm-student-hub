
package com.nsbm.studenthub.controller;

import com.nsbm.studenthub.entity.Student;
import com.nsbm.studenthub.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping
    public Object list(@RequestParam int page,
                       @RequestParam int size,
                       @RequestParam String sortBy) {
        return service.getAll(page, size, sortBy);
    }
}
