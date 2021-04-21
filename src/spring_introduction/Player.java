package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("player")
public class Player {
    private String name;
    @Autowired
    private Team team;

    public Player() {
        System.out.println("Constructor in Player Class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void myAnthem(){
        team.anthem();
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
