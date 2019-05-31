import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStatic {

	@Test
	public void testDemo01() {
	String xmlPath = "bean2.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	System.out.println(applicationContext.getBean("bean2"));
	}
}
