package cn.mirror6.source.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author mirror6
 * @since 2020-05-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private static final long serialVersionUID = 1L;

    private String account;

    private String password;

    private String salt;

    private String name;

    private Long gender;

    private String tel;

    private String email;

    public User(String account, String name) {
        this.account = account;
        this.name = name;
    }
}
