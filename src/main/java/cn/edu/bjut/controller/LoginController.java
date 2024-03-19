package cn.edu.bjut.controller;

import cn.edu.bjut.entity.Result;
import cn.edu.bjut.entity.Student;
import cn.edu.bjut.service.StudentService;
import cn.edu.bjut.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private JWTUtils jwtUtils;
    @Autowired
    private StudentService studentService;


}
