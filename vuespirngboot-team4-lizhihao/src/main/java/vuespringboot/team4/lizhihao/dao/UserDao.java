package vuespringboot.team4.lizhihao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vuespringboot.team4.lizhihao.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
