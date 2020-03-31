import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class League <T extends Player> {

    private String name;
    private ArrayList<Team<T>> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(Team<T> team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on the team.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the " + this.name);
            return true;
        }
    }

    public int numTeams() {
        return this.teams.size();
    }

    public void printTeams() {
        Collections.sort(teams);
        ListIterator<Team<T>> listIterator = teams.listIterator();
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
