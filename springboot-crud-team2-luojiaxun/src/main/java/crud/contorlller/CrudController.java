package crud.contorlller;

import crud.pojo.UserInfo;
import crud.service.UserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CrudController {

    //注入业务层
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    @PostMapping
    public void saveUser(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        System.out.println("热部署成功");
        userInfoService.saveUser(userInfo);
    }

    @PutMapping
    public void updateUser(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        userInfoService.updateUser(userInfo);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody  UserInfo userInfo){
        System.out.println(userInfo);
        userInfoService.deleteUser(userInfo.getId());
    }

}
