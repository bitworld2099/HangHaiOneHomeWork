package cn.crud.controller;

import cn.crud.biz.UserInfoBiz;
import cn.crud.pojo.News;
import cn.crud.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoBiz biz;

    @GetMapping
    public List<UserInfo> findall(){
        return biz.findAll();
    }

    //添加信息
    @PostMapping
    public News insert(@RequestBody UserInfo userInfo){
        String msg = biz.insert(userInfo);
        News news = new News();
        news.setCode("400");
        news.setMsg("添加失败！");
        if (msg.equals("OK")){
            news.setCode("200");
            news.setMsg("添加成功！");
        }
       return news;
    }

    //修改信息
    @PutMapping("/{id:\\d+}")
    public News update(@RequestBody UserInfo userInfo, @PathVariable @Validated Integer id){
        userInfo.setId(id);
        String msg = biz.update(userInfo);
        News news = new News();
        news.setCode("400");
        news.setMsg("修改失败！");
        if (msg.equals("OK")){
            news.setCode("200");
            news.setMsg("修改成功！");
        }
        return news;
    }

    //删除信息
    @DeleteMapping("/{id:\\d+}")
    public News delete(@PathVariable @Validated Integer id){
        String msg = biz.delete(id);
        //返回信息对象
        News news = new News();
        news.setCode("400");
        news.setMsg("删除失败！");
        //根据service层的返回信息进行判断，修改默认信息
        if (msg.equals("OK")){
            news.setCode("200");
            news.setMsg("删除成功！");
        }
        return news;
    }
}

