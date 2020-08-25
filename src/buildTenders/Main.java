package buildTenders;

public class Main {
    public static void main(String[] args) {

        Workers vasya1 = new Workers(500, new Skills[]{Skills.PAINT, Skills.ELECTRICIAN});
        Workers vasya2 = new Workers(550, new Skills[]{Skills.BUILD_FLOOR, Skills.BUILD_ROOF});
        Workers vasya3 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya4 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya5 = new Workers(700, new Skills[]{Skills.MANAGE,Skills.PLUMBER});

        Team teamVasyay = new Team();
        teamVasyay.addWorker(vasya1);
        teamVasyay.addWorker(vasya2);
        teamVasyay.addWorker(vasya3);
        teamVasyay.addWorker(vasya4);
        teamVasyay.addWorker(vasya5);

        Workers dzhamhut1 = new Workers(200, new Skills[]{Skills.PAINT});
        Workers dzhamhut2 = new Workers(350, new Skills[]{Skills.BUILD_FLOOR, Skills.BUILD_ROOF});
        Workers dzhamhut3 = new Workers(200, new Skills[]{Skills.BUILD_WALL});
        Workers dzhamhut4 = new Workers(200, new Skills[]{Skills.BUILD_WALL});
        Workers dzhamhut5 = new Workers(1000, new Skills[]{Skills.MANAGE,Skills.PLUMBER});

        Team teamDzhamhuts = new Team();
        teamDzhamhuts.addWorker(dzhamhut1);
        teamDzhamhuts.addWorker(dzhamhut2);
        teamDzhamhuts.addWorker(dzhamhut3);
        teamDzhamhuts.addWorker(dzhamhut4);
        teamDzhamhuts.addWorker(dzhamhut5);








    }
}
