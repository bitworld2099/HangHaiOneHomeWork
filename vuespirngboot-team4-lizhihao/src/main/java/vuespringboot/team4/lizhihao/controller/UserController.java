package vuespringboot.team4.lizhihao.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vuespringboot.team4.lizhihao.dao.UserDao;
import vuespringboot.team4.lizhihao.entity.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    final
    UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("list")
    public ResponseEntity<List<User>> list() {
        return ResponseEntity.ok(userDao.findAll());
    }

    @PostMapping
    public ResponseEntity<JSONObject> addOne(@RequestBody JSONObject requestBody) {
        JSONObject responseBody = new JSONObject();
        User user = null;
        try{
            user = JSONUtil.toBean(requestBody, User.class);
        } catch (Exception e) {
            responseBody.put("msg", "参数有误！");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
        }
        try{
            user = userDao.save(user);
        } catch (Exception e) {
            responseBody.put("msg", "服务器出错，请稍后重试！");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
        }
        return ResponseEntity.ok(JSONUtil.parseObj(user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        userDao.deleteById(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody JSONObject requestBody) {
        JSONObject responseBody = new JSONObject();
        return this.addOne(requestBody);
    }

}
