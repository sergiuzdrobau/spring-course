package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationsDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("player", Player.class);
        player.myAnthem();

    }
}
