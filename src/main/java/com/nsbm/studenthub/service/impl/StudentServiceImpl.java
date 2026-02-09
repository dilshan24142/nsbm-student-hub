
package com.nsbm.studenthub.service.impl;

import com.nsbm.studenthub.entity.Student;
import com.nsbm.studenthub.repository.StudentRepository;
import com.nsbm.studenthub.service.StudentService;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Page<Student> getAll(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repo.findAll(pageable);
    }

    @Override
    public Student save(Student student) {
        return repo.save(student);
    }
}
