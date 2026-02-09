
package com.nsbm.studenthub.service;

import com.nsbm.studenthub.entity.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
    Page<Student> getAll(int page, int size, String sortBy);
    Student save(Student student);
}
