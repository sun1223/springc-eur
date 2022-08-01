package org.example.sun.repository;
import org.example.sun.entity.Student;
import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
}
