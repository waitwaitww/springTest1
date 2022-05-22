import com.service.userServiceImpl;
import com.service.userservice;

public class Mytest {
    public static void main(String[] args) {

        userservice userService = new userServiceImpl();

        userService.getUser();
    }

}
