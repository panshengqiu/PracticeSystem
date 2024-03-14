package cn.edu.bjut.mapper;


import cn.edu.bjut.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
//    @Select("select * from student where id = #{id}")
    public Student selectById(Integer id);

    @Select("select * from student where username = #{student.username} and password = #{student.password}")
    public Student login(Student student);
}
