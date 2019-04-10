import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderRun {

    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-provider.xml");
        ((ClassPathXmlApplicationContext) ac).start();
        System.in.read();
    }
}
