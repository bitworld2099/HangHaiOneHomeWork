package com;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    //注入web应用上下文对象
    @Autowired
    private WebApplicationContext wac;
    //定义一个mvc环境的伪造对象
    private MockMvc mockMvc;

    //被Before注解的方法会在每个test方法执行之前被调用
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void whenCreateSuccess2()throws Exception{
        //String content = "{\"username\":\"sssss\",\"email\":\"123456\"}";
        String content = "{\"username\":\"12\",\"email\":\"123456@163.com\"}";
        //创建请求
        String contentAsString = mockMvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                //.andExpect(jsonPath("$.length()").value("5"))
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }


    @Test
    public void whenCreateSuccess()throws Exception{
        //String content = "{\"username\":\"sssss\",\"email\":\"123456\"}";
        String content = "{\"id\":\"50\",\"username\":\"123456\",\"email\":\"123456@163.com\"}";
        //创建请求
        String contentAsString = mockMvc.perform(put("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
               // .andExpect(jsonPath("$.length()").value("5"))
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

}
