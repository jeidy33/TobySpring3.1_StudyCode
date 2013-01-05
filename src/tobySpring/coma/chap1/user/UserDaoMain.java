package tobySpring.coma.chap1.user;

import java.sql.SQLException;

import tobySpring.coma.chap1.user.dao.UserDao;
import tobySpring.coma.chap1.user.domain.User;

public class UserDaoMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao userDao = new UserDao();
		
		User user = new User();
		user.setId("coma333ryu");
		user.setName("coma");
		user.setPassword("1234");
		
		userDao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
		
		User user2 = userDao.get(user.getId());
		
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + "조회 성공");
	}

}
