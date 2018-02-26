import com.ssm.dao.IUserDaos;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testspring(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDaos iUserDaos= (IUserDaos) applicationContext.getBean("iUserDaos");
        System.out.println(iUserDaos.getAllUsers().size());
    }








}
