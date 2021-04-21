package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person myPerson = context.getBean("myPerson",Person.class);
        System.out.println(myPerson.getFirstName());
        context.close();
    }
}
