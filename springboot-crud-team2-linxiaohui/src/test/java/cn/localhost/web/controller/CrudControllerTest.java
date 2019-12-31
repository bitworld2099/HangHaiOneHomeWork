package cn.localhost.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import  org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testQuery() throws Exception {
        String listJson = mockMvc.perform(MockMvcRequestBuilders.get("/user")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }

    @Test
    public void testDelete() throws Exception{
        String listJson = mockMvc.perform(MockMvcRequestBuilders.delete("/user/4")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }

    @Test
    public void testCreate() throws Exception {
        String context = mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .param("username","linyi")
                .param("email","linyi@163.com")
                .param("sex","男")
                .param("province","广州市")
                .param("hobby","跳舞")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(context);
    }

    @Test
    public void testUpdate() throws Exception {
        //更新操作
        String content = "{\"id\":4,\"username\":\"dadiao\",\"email\":\"linyi@163.com\",\"sex\":\"男\",\"province\":\"广州市\",\"hobby\":\"跳舞\"}";
       String str = mockMvc.perform(MockMvcRequestBuilders.put("/user")
        .content(content)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(str);
    }

}
