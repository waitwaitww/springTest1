import com.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        User user = new User();

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user1 = (User) context.getBean("user");
        user1.show();
        user1.setName("xiatian");
        user1.show();
        User user2 = (User) context.getBean("user");
        user2.show();
    }
}
