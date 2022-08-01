package org.example.sun.repository.impl;

import org.example.sun.entity.Student;
import org.example.sun.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> map;

    static {
        map = new HashMap<>();
        map.put(1L,new Student(1L,"小明",18));
        map.put(2L,new Student(2L,"小红",17));
        map.put(3L,new Student(3L,"小蓝",15));
        map.put(4L,new Student(4L,"小白",14));
    }

    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(long id) {
        return map.get(id);
    }
}
