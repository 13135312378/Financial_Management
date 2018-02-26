import com.ssm.dao.IUserDaos;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybTest {


    @Test
    public void tests() throws Exception{

      //测试mybatis
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IUserDaos iUserDaos=sqlSession.getMapper(IUserDaos.class);
        System.out.println(iUserDaos.getAllUsers().size());
        sqlSession.commit();
        sqlSession.close();

    }










}
