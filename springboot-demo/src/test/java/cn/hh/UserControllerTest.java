package cn.hh;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

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
    public void whenDeleteSuccess()throws Exception{
        //删除操作
        String contentAsString = mockMvc.perform(delete("/user/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void whenUpdateSuccess()throws Exception{
        //更新操作
        String content = "{\"id\":1,\"username\":\"lisa\",\"password\":\"123456\"}";
        String contentAsString = mockMvc.perform(put("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void whenCreateSuccess()throws Exception{
        String content = "{\"id\":1,\"username\":null,\"password\":\"123456\"}";
        //创建请求
        String contentAsString = mockMvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value("3"))
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void whenGetInfo()throws Exception{
        //查询详情
        String contentAsString = mockMvc.perform(get("/user/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

    @Test
    public void whenQuerySuccess3() throws Exception{
        //模拟查询用户信息，带多个参数

        String listJson = mockMvc.perform(get("/user3")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("username","tom1")
                .param("sex","男")
                .param("pageNo","1")
                .param("pageSize","10")
                .param("xxxx","yyyy"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }

    @Test
    public void whenQuerySuccess2() throws Exception{
        //模拟查询用户信息，带参数
        String listJson = mockMvc.perform(get("/user2")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("username","tom1")
                .param("email","tom1@126.com"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }

    @Test
    public void whenQuerySuccess() throws Exception{
        //模拟查询用户信息，不带参数
        String listJson = mockMvc.perform(get("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }
}
