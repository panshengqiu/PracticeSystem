package cn.edu.bjut.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * 部门实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id; //ID
    private String name; //学生名称
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
}
