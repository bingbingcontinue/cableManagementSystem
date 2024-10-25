import com.cms.pojo.Cable;
import com.cms.pojo.Drawings;
import com.cms.pojo.User;
import com.cms.service.CableService;
import com.cms.service.DrawingsService;
import com.cms.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cms.pojo.Books;
import com.cms.service.BookService;

import java.io.InputStream;

public class mtTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.qureyAllBook()) {
            System.out.println(books);
        }
    }


    @Test
    public void testfindComplexTestById() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CableService cableServiceImpl = (CableService) context.getBean("CableServiceImpl");
        Cable cable=cableServiceImpl.getCableTestComplex(20010003);
        System.out.println(cable);
    }

    @Test
    public void draw() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CableService cableServiceImpl = (CableService) context.getBean("CableServiceImpl");
        DrawingsService drawingsServiceImpl = (DrawingsService) context.getBean("DrawingsServiceImpl");
        Drawings drawings=drawingsServiceImpl.queryDrawingsById(3);
        System.out.println(drawings);
        Cable cable=cableServiceImpl.getCableDrawingsComplex(3);
        System.out.println(cable);
    }

    @Test
    public void userFind() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        User user = userServiceImpl.findByUsername("bf");
        System.out.println(user);
    }




}
