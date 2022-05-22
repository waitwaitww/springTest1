import com.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Hello holle = (Hello) context.getBean("holle");
        System.out.println(holle.toString());
        Object holle2 = context.getBean("holle2");
        System.out.println(holle2.toString());
    }
}
