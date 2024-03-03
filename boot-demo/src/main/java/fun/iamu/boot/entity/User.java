package fun.iamu.boot.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class User {

    private Integer id;
    private String username;
    private String password;
    private Long account;

}
