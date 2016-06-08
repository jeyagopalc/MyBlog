package test;
import static org.mockito.Mockito.*;


import org.junit.Test;

import com.mydomain.dao.UserDao;
import com.mydomain.model.User;
import com.mydomain.service.UserService;

import junit.framework.Assert;

public class UserServiceTest {

	@Test
	public void testGetUser() {
		//Test valid id
		UserDao mockUserDao = mock(UserDao.class);
		User u = new User();
		u.setName("Manish");
		when(mockUserDao.getUser("Manish")).thenReturn(u);
		
		UserService service = new UserService();
		service.setUserDao(mockUserDao);
		u = service.getUser("Manish");
		Assert.assertEquals("Manish", u.getName());	
		
	}

}
