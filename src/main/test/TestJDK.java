import com.livejq.jdk_proxy.MyBeanFactory;
import com.livejq.jdk_proxy.UserDao;
import org.junit.Test;

public class TestJDK {

    @Test
    public void testMyAspect() {
        UserDao userDao = MyBeanFactory.getBean();
        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();
    }
}