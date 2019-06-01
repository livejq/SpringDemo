import com.livejq.aspectj_aop.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectJ {
    @Test
    public void testDeclareAop() {
        String xmlPath = "applicationContext2.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
