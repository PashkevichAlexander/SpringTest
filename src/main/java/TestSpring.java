import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = contex.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        contex.close();
    }
}
