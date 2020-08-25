package buildTenders;

public class Main {
    public static void main(String[] args) {

        Workers vasya1 = new Workers(500, new Skills[]{Skills.PAINT, Skills.ELECTRICIAN});
        Workers vasya2 = new Workers(550, new Skills[]{Skills.BUILD_FLOOR, Skills.BUILD_ROOF});
        Workers vasya3 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya4 = new Workers(300, new Skills[]{Skills.BUILD_WALL});
        Workers vasya5 = new Workers(700, new Skills[]{Skills.MANAGE,Skills.PLUMBER});

        Team teamVasyay = new Team();

    }
}
