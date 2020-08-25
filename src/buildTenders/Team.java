package buildTenders;

import java.util.LinkedList;

public class Team {
    private LinkedList<Workers> team;

    /*public Team(LinkedList<Workers> team) {
        this.team = team;
    }*/

    public void setTeam(LinkedList<Workers> team) {
        this.team = team;
    }

    public LinkedList<Workers> getTeam() {
        return team;
    }

    public void addWorker (Workers workers){
        team.add(workers);
    }
}
