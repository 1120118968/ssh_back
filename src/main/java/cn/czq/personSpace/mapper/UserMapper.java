package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserMapper")
public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

    User getOneByUserName(@Param("username") String username);

	User login(String username,String password);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}