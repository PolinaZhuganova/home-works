import config.Config;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestExecutorService;
import java.io.IOException;

/**
 * Класс Main
 */
@ComponentScan
public class Main {

	public static void main(String[] args) throws IOException {

//		ClassPathXmlApplicationContext context =
//			new ClassPathXmlApplicationContext("/context.xml");


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Main.class);
		context.refresh();

		TestExecutorService t = context.getBean(TestExecutorService.class);
		t.startTest();


	}

}