import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssemble {

	@Test
	public void testDemo01() {
	String xmlPath = "bean5.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	System.out.println(applicationContext.getBean("user1"));
	System.out.println(applicationContext.getBean("user2"));
	}
}
