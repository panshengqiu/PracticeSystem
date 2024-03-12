package cn.edu.bjut.springbootproject1.controller;


import cn.edu.bjut.springbootproject1.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class DeptController {
//    private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @RequestMapping("/depts")
    public Result list(){
        System.out.println("查询所有部门信息");
        return Result.success();
    }
}
