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

    @PostMapping("/login")
    public Result login(@RequestBody Student student){
        Student stu = studentService.login(student);
        if(stu != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("username",stu.getUsername());
            claims.put("id", stu.getId());
            claims.put("name", stu.getName());
            String jwt = JWTUtils.getJWT();
            return Result.success(jwt);
        }
        return Result.error("用户名或密码错误");
    }
}
