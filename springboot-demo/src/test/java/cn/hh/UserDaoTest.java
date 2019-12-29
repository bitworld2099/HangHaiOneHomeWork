package cn.hh;

import cn.hh.dao.UserRepository;
import cn.hh.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserRepository userDao;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void test5(){
        //按照：username模糊查询，查姓张的用户
        List<User> list = userDao.findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                //构建二个查询条件
                Predicate condition1 = criteriaBuilder.like(root.get("username"), "张%");
                Predicate condition2 = criteriaBuilder.equal(root.get("password"), "123456");
                query.where(condition1,condition2);
                return null;
            }
        });
        list.stream().forEach(obj->{
            try {
                System.out.println(objectMapper.writeValueAsString(obj));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void test4(){
        List<User> list = userDao.findAll();
        list.stream().forEach(obj->{
            try {
                System.out.println(objectMapper.writeValueAsString(obj));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void test3(){
        //删除
        userDao.deleteById(2);
    }

    @Test
    public void test2(){
        //修改用户
        User user = new User();
        user.setId(1);
        user.setUsername("张三33333");
        user.setPassword("123456");
        //修改用户
        userDao.save(user);
    }

    @Test
    public void test1(){
        //实例化用户
        User user = new User();
        user.setUsername("李四");
        user.setPassword("123456");
        //添加用户
        userDao.save(user);
    }
}
