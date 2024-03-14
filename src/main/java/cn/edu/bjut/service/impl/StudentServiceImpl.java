package cn.edu.bjut.service.impl;

import cn.edu.bjut.entity.Student;
import cn.edu.bjut.mapper.StudentMapper;
import cn.edu.bjut.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> list() {
        return null;
    }

    public void delete(Integer id) {
    }

    public void add(Student student) {

    }

    public Student login(Student student){
        return studentMapper.login(student);
    }

}
