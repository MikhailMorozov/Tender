package buildTenders;

import java.util.LinkedList;

public class Team {

    private LinkedList<Workers> team = new LinkedList<>();


    public void addWorkerToTeam (Workers workers) {
        team.add(workers);
    }

    public int costOfWork() {
        int costOfWork = 0;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++){
            Workers workers = team.get(i);
            costOfWork = costOfWork + workers.getSalary();
        }
        return costOfWork;
    }




}
