package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("player")
@Scope("prototype")
@PropertySource("classpath:properties")
public class Player {
    private String name;



    private Team team;

    @Value("${player.age}")
    private int age;

    public Player() {
        System.out.println("Constructor in Player Class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void myAnthem(){
        team.anthem();
    }

    @Autowired
    public void setTeam(Team team) {
        this.team = team;
    }
}
