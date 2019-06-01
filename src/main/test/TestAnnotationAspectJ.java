import com.livejq.aspectj_aop.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class TestAnnotationAspectJ {

    @Autowired
    private UserDao userDao;

    @Test
    public void testDemo01() {
        userDao.save();
    }
}
