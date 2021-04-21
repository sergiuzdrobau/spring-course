package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Saric");
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.setName("Saric 2");
        System.out.println(dog.getName());
        System.out.println(dog2.getName());
        context.close();
    }
}
