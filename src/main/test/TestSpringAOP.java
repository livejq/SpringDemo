import com.livejq.spring_aop.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOP {
    @Test
    public void testProxyFactoryBean() {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        userDao.save();
        System.out.println("\n");
        userDao.update();
        System.out.println("\n");
        userDao.find();
        System.out.println("\n");
        userDao.delete();
    }
}
