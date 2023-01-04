
import com.config.ConfigFactory;
import com.config.FrameworkConfig;
import org.junit.Test;


public class DemoTest {

    @Test
    public void Login(){
        System.out.println(ConfigFactory.getConfig().browser());
    }
}
