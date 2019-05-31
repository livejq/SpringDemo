import com.livejq.annotation.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAssemble {
	@Test
	public void testDemo01() {
	String xmlPath = "bean6.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	UserAction userAction = (UserAction)applicationContext.getBean("userAction");
	System.out.println(userAction);
	userAction.save();
	}
}
