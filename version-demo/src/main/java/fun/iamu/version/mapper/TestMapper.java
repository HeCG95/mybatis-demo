package fun.iamu.version.mapper;

import fun.iamu.version.entity.User;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    User getUserById(@Param("id") int id);

}
