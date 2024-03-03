package fun.iamu.version;

import fun.iamu.version.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootMybatisVersionTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testMyBatisVersionDiff() throws SQLException {

        testMapper.getUserById(111);

    }

}
