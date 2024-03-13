package cn.edu.bjut.controller;


import cn.edu.bjut.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class StudentController {
//    private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @RequestMapping("/depts")
    public Result list(){
        System.out.println("��ѯ���в�����Ϣ");
        return Result.success();
    }
}
