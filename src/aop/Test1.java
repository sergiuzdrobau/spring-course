package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("library", Library.class);
        library.getBook();
        library.returnBook();
        library.getMagazine();
        library.returnMagazine();

    }
}
