package buildTenders;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Tenderers {
    private LinkedList<Team> tenderers = new LinkedList<>();

    public void addTeamToTender(Team team) {
        tenderers.add(team);
    }

    public Map<Skills, Integer> infoOfTeam (Team team){
        Map<Skills, Integer> infoOfTeam = new HashMap<>();
        infoOfTeam.put(Skills.PAINT, team.numberOfPaint());
        infoOfTeam.put(Skills.BUILD_FLOOR, team.numberOfBuildFloor());
        infoOfTeam.put(Skills.BUILD_WALL, team.numberOfBuildWall());
        infoOfTeam.put(Skills.BUILD_ROOF, team.numberOfBuildRoof());
        infoOfTeam.put(Skills.PLUMBER, team.numberOfPlumber());
        infoOfTeam.put(Skills.ELECTRICIAN, team.numberOfElectrian());
        return infoOfTeam;
    }




}
