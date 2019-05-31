import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance {

	@Test
	public void testDemo01() {
		String xmlPath = "bean3.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("bean3"));
		System.out.println(applicationContext.getBean("bean3"));
	}
}
