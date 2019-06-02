import com.livejq.spring_transaction.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {

    /**
     * 通过查看
     * Sprin官方文档，发现只有把整个Service设为事务控制时，才会进行AOP代理。
     * 如果我们通过一个没有事务的transferProxy方法去调用有事务的transfer方法，是通过this引用进行调用，
     * 没有开启事务，即使发生了RuntimeException也不会回滚。
     */
    @Test
    public void testSpringTransaction() {
        String xmlPath = "applicationContext4.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("accountServiceProxy");
        accountService.transfer("Jack", "Tom", 200);
        System.out.println("转账成功!");
    }

    @Test
    public void testSpringAopXml() {
        String xmlPath = "applicationContext5.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("Tom", "Jack", 100);
        System.out.println("转账成功!");
    }
}
