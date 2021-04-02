import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //dao层,data access object,叫数据访问层
        //service层,叫服务层
        //用户实际调用的是业务层，不需要接触dao
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();

        //由于配置了bean.xml不需要再去new,而是获取ApplicationContext
        //快捷键 new CPX
        //拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么，直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
