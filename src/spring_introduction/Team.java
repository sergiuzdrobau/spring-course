package spring_introduction;


import org.springframework.stereotype.Component;

@Component("team")
public class Team {
    private String name;

    public Team() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void anthem(){
        System.out.println("You never walk alone");
    }

}
