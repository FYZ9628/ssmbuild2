import com.fyz.pojo.Books;
import com.fyz.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 测试数据用的
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService)context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
