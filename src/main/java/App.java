import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld newBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat newCatBean = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.equals(newBean));
        System.out.println(catBean.equals(newCatBean));

    }
}