import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class League <T extends Team> {

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on the team.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the " + this.name);
            return true;
        }
    }


    public void printTeams() {
        Collections.sort(teams);
        ListIterator<T> listIterator = teams.listIterator();
        boolean quit = false;
        while (!quit) {
            if (!listIterator.hasNext()) {
                quit = true;
            } else {
                int nextRank = listIterator.nextIndex();
                Team nextTeam = listIterator.next();
                System.out.println(nextRank + ") " + nextTeam.getName() + " has a score of " + nextTeam.ranking());
            }
        }
    }
}
