package cn.edu.bjut.service;

import cn.edu.bjut.entity.Student;

import java.util.List;

/**
 * 部门管理
 */
public interface StudentService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Student> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param student
     */
    void add(Student student);
}
