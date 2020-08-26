package buildTenders;

import java.util.LinkedList;

public class Team {

    private LinkedList<Workers> team = new LinkedList<>();


    public void addWorkerToTeam(Workers workers) {
        team.add(workers);
    }

    public int costOfWork() {
        int costOfWork = 0;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            costOfWork = costOfWork + workers.getSalary();
        }
        return costOfWork;
    }

    public int numberOfPaint() {
        int numberOfPaint = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.PAINT) {
                    numberOfPaint++;
                }
            }
        }
        return numberOfPaint;
    }

    public int numberOfBuildFloor() {
        int numberOfBuildFloor = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.BUILD_FLOOR) {
                    numberOfBuildFloor++;
                }
            }
        }
        return numberOfBuildFloor;
    }

    public int numberOfBuildWall() {
        int numberOfBuildWall = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.BUILD_WALL) {
                    numberOfBuildWall++;
                }
            }
        }
        return numberOfBuildWall;
    }

    public int numberOfBuildRoof() {
        int numberOfBuildRoof = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.BUILD_ROOF) {
                    numberOfBuildRoof++;
                }
            }
        }
        return numberOfBuildRoof;
    }

    public int numberOfPlumber() {
        int numberOfPlumber = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.PLUMBER) {
                    numberOfPlumber++;
                }
            }
        }
        return numberOfPlumber;
    }

    public int numberOfElectrian() {
        int numberOfElectrian = 0;
        Skills[] skillsWorker;
        int sizeTeam = team.size();

        for (int i = 0; i < sizeTeam; i++) {
            Workers workers = team.get(i);
            skillsWorker = workers.getSkills();
            for (int j = 0; j < skillsWorker.length; j++) {
                if (skillsWorker[j] == Skills.ELECTRICIAN) {
                    numberOfElectrian++;
                }
            }
        }
        return numberOfElectrian;
    }


}
