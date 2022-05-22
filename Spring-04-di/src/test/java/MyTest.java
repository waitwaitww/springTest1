import com.pojo.Student;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studetn = (Student) context.getBean("student");
        System.out.println(studetn.getName());
        System.out.println(studetn.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
