package com.lwj;

import com.luojinbiao.controller.UserController;
import com.luojinbiao.pojo.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTest {
   @Autowired
    private UserController userController;


    // 初始化
    @Before
    public void setUp() throws Exception {
        System.out.println("执行初始化");
    }
    //测试查询所有
    @Test
    public void testFindAll(){
        List<User> users=userController.findAll();
        for(User user: users){
            System.out.println(user.toString());
        }
    }
    //测试分页
    @Test
    public void testQueryPage(HttpServletRequest request) {
        Page<User> users= userController.queryPage(request);
        System.out.println(users.getTotalElements());//总元素
        System.out.println(users.getTotalPages());//总页数
        System.out.println(users.getNumberOfElements());//每一页的元素
    }
}
