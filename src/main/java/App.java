import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // Get the bean from the context
        Person person = (Person) context.getBean("personBean");

        // Call a method on the bean
        person.showName(); // Output: Name: John
    }
}
