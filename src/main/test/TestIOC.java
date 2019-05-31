import com.livejq.ioc.UserDao;
import com.livejq.ioc.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 第一个Spring 程序 实现控制反转
 */
public class TestIOC {

	@Test
	public void testDemo01() {
		String xmlPath = "bean1.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		userDao.save();
	}
	
	@Test
	public void testDemo02() {
		String xmlPath = "bean1.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.addUser();
	}
}
