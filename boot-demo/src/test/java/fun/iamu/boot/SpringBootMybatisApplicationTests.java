package fun.iamu.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        //根据配置的数据库信息获取连接，执行语句
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from t_user");

        //打印结果
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String address = resultSet.getString(3);
            System.out.println("id:" + id + " name:" + name + " address:" + address);
        }
    }

}
