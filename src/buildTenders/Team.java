package buildTenders;

import java.util.LinkedList;

public class Team {
    private LinkedList<Workers> team;

    public void addWorker(Workers workers) {
        team.add(workers);
    }

    public int costOfWork(LinkedList<Workers> team) {
        int costOfWork = 0;
        int sizeTeam = team.size();
        Workers workers;

        for (int i = 0; i < sizeTeam; i++){
            workers = team.get(i);
            costOfWork = costOfWork + workers.getSalary();
        }
        return costOfWork;
    }


}
