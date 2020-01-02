package cn.crud.controller;

import cn.crud.pojo.ResponseObject;
import cn.crud.pojo.UserInfo;
import cn.crud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {
    @Autowired
    private UserInfoService service;

    /**
     * 查询所有
     * @return
     */
    @GetMapping
    public List<UserInfo> findAll(){
        return service.findall();
    }
    /*
    新增用户
     */
    @PostMapping
    public ResponseObject create(@RequestBody UserInfo userInfo){
        service.save(userInfo);
        return new ResponseObject("新增成功","200",userInfo);
    }
    /**
     * 修改用户
     */
    @PutMapping
    public ResponseObject modif(@RequestBody UserInfo userInfo){
        service.save(userInfo);
        return new ResponseObject("修改成功","200",userInfo);
    }
    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable Integer id){
        service.delete(id);
        return new ResponseObject("删除成功","200",null);

    }
}
