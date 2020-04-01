public class Main {

    public static void main(String[] args) {
	League <Team<FootballPlayer>> nfl = new League<>("NFL");
    Team<FootballPlayer> packers = new Team<>("Packers");
    Team<BaseballPlayer> brewers = new Team<>("Brewers");
    Team<SoccerPlayer> galaxy = new Team<>("Galaxy");
    Team<FootballPlayer> vikings = new Team<>("Vikings");
    Team<FootballPlayer> bears = new Team<>("Bears");
    Team<FootballPlayer> lions = new Team<>("Lions");
    nfl.addTeam(packers);
    nfl.addTeam(vikings);
    nfl.addTeam(lions);
    nfl.addTeam(bears);
    packers.matchResult(vikings, 28, 21);
    packers.matchResult(bears, 31, 10);
    packers.matchResult(lions, 28, 24);
    vikings.matchResult(bears, 17, 10);
    vikings.matchResult(lions, 21, 10);
    bears.matchResult(lions, 40, 31);
    nfl.printTeams();
    }
}
