package aop;

import org.springframework.stereotype.Component;

@Component("library")
public class Library {
    public void getBook(){
        System.out.println("Get book from library");
    }

    public String returnBook(){
        System.out.println("Return book to library");
        return "fsg";
    }

    public void getMagazine(){
        System.out.println("Get magazine from library");
    }

    public void returnMagazine(){
        System.out.println("Return magazine to library");
    }
}
