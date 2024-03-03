package fun.iamu.boot;

import fun.iamu.boot.entity.User;
import fun.iamu.boot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() throws SQLException {

        User hcg = new User();
        hcg.setId(111);
        hcg.setAccount(12345L);
        hcg.setUsername("hecg");
        hcg.setPassword("123");

        int insert = userMapper.insert(hcg);
        System.out.println("affect row num:" + insert);

        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

    }

}
