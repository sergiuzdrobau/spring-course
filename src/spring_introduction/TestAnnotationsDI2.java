package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationsDI2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Player player = context.getBean("player", Player.class);
        player.setName("Salah");
        Player player1 = context.getBean("player", Player.class);
        player1.setName("Mane");
        System.out.println(player==player1);
        System.out.println(player.getAge());
        player.myAnthem();

    }
}
