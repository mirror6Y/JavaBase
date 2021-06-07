package cn.mirror6.io.directory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 6:44 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private String name;

    private Integer age;
}
