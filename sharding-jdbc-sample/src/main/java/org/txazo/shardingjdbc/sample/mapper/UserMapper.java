package org.txazo.shardingjdbc.sample.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.txazo.shardingjdbc.sample.bean.User;

@Mapper
public interface UserMapper {

    int addUser(User user);

    User getUser(Integer id);

}
