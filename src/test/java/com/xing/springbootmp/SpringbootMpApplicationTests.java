package com.xing.springbootmp;

import com.xing.springbootmp.domain.User;
import com.xing.springbootmp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMpApplicationTests {

    @Autowired
    private UserMapper userMapper;

    // 1、查询测试
    @Test
    void contextLoads() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    // 2、插入数据
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("小张");
        user.setAge(27);
        user.setEmail("888@qq.com");
        int result = userMapper.insert(user);
        System.out.println("\n"+ "行受影响：" + result);
        System.out.println("新增数据：" + user + "\n");
    }

    // 3、更新数据
    @Test
    void testUpdate() {
        User user = new User();
        user.setId(4L);
        user.setName("小张张");
        user.setAge(29);
        user.setEmail("999@163.com");
        int r = userMapper.updateById(user);
        System.out.println("\n"+ "行受影响：" + r);
        System.out.println("修改数据：" + user + "\n");
    }

    // 4、删除数据
    @Test
    void testDelete() {
        userMapper.deleteById(4);
    }
}
