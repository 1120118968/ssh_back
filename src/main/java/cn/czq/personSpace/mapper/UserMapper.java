package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.User;

import java.util.List;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	User getOneByUserName(String username);

	User login(String username,String password);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}