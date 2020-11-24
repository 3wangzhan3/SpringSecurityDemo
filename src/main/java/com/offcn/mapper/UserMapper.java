package com.offcn.mapper;

import com.offcn.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    Users findOne(String username);

}
