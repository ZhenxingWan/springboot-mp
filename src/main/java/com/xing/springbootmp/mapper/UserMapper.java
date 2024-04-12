package com.xing.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xing.springbootmp.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper  extends BaseMapper<User> {
    // extends BaseMapper 所有的CRUD操作都已编写完成
}
