package buildTenders;

public class Main {
    public static void main(String[] args) {

        // рабочие для первой бргиды
        Workers vasya1 = new Workers(500, new Skills[]{Skills.PAINT, Skills.ELECTRICIAN});
        Workers vasya2 = new Workers(550, new Skills[]{Skills.BUILD_FLOOR, Skills.BUILD_ROOF});
        Workers vasya3 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya4 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya5 = new Workers(700, new Skills[]{Skills.MANAGE,Skills.PLUMBER,Skills.PAINT});

        // создается первая бригада, добавляются рабочие
        Team teamVasyay = new Team();
        teamVasyay.addWorkerToTeam(vasya1);
        teamVasyay.addWorkerToTeam(vasya2);
        teamVasyay.addWorkerToTeam(vasya3);
        teamVasyay.addWorkerToTeam(vasya4);
        teamVasyay.addWorkerToTeam(vasya5);

        // рабочие для второй бргиды
        Workers dzhamhut1 = new Workers(200, new Skills[]{Skills.PAINT});
        Workers dzhamhut2 = new Workers(350, new Skills[]{Skills.BUILD_FLOOR, Skills.BUILD_ROOF});
        Workers dzhamhut3 = new Workers(200, new Skills[]{Skills.BUILD_WALL});
        Workers dzhamhut4 = new Workers(200, new Skills[]{Skills.BUILD_WALL});
        Workers dzhamhut5 = new Workers(1000, new Skills[]{Skills.MANAGE,Skills.PLUMBER});

        // создается вторая бригада, добавляются рабочие
        Team teamDzhamhuts = new Team();
        teamDzhamhuts.addWorkerToTeam(dzhamhut1);
        teamDzhamhuts.addWorkerToTeam(dzhamhut2);
        teamDzhamhuts.addWorkerToTeam(dzhamhut3);
        teamDzhamhuts.addWorkerToTeam(dzhamhut4);
        teamDzhamhuts.addWorkerToTeam(dzhamhut5);

        // создаются тендер, добавляются участники тендера
        Tenderers buildTenders = new Tenderers();
        buildTenders.addTeamToTender(teamVasyay);
        buildTenders.addTeamToTender(teamDzhamhuts);











    }
}
