import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        //Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //getBean时对象已经被创建了
        //只有一份实例
        UserT user = (UserT) context.getBean("u5");

//        User user2 = (User) context.getBean("user");
//        System.out.println(user == user2); //ture
        user.show();
    }
}
