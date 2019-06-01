import com.livejq.jdbctemplate.User;
import com.livejq.jdbctemplate.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {
    @Test
    public void testCreateTable() {
        String xmlPath = "jdbcTemplateBeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table tb_user(" +
                "id int primary key auto_increment," +
                "username varchar(50)," +
                "password varchar(32))");
    }

    @Test
    public void testAddUser() {
        String xmlPath = "jdbcTemplateBeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("livejq");
        user.setPassword("456");
        int flag = userDao.addUser(user);
        System.out.println("flag 返回值为 " + flag);
        if(flag == 0) {
            System.out.println("添加用户成功！");
        }else {
            System.out.println("未能添加用户~");
        }
    }

    @Test
    public void testUpdateUser() {
        String xmlPath = "jdbcTemplateBeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(2);
        user.setUsername("livejq");
        user.setPassword("789");
        int flag = userDao.updateUser(user);
        System.out.println("flag 返回值为 " + flag);
        if(flag == 1) {
            System.out.println("更新用户成功！");
        }else {
            System.out.println("未能更新用户~");
        }
    }

    @Test
    public void testDeleteUser() {
        String xmlPath = "jdbcTemplateBeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        int flag = userDao.deleteUserById(2);
        System.out.println("flag 返回值为 " + flag);
        if(flag == 1) {
            System.out.println("删除用户成功！");
        }else {
            System.out.println("未能删除用户~");
        }
    }

}
