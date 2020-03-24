public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> cards = new Team<>("Prescott Cardinals");
        cards.addPlayer(joe);
//        cards.addPlayer(pat);
//        cards.addPlayer(beckham);

        System.out.println(cards.numPlayers());

        Team <BaseballPlayer> baseballTeam = new Team <> ("Milwaukee Brewers");
        baseballTeam.addPlayer(pat);

        Team <SoccerPlayer> soccerTeam = new Team <> ("Some Soccer Team");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> ellsworth = new Team <> ("Ellsworth Wildcats");
        FootballPlayer bot = new FootballPlayer("Bot");
        ellsworth.addPlayer(bot);

        Team<FootballPlayer> richmond = new Team<> ("New Richmond");

        cards.matchResult(ellsworth, 14, 10);
        cards.matchResult(richmond, 31, 27);

        System.out.println(cards.ranking());
        System.out.println(ellsworth.ranking());
    }
}
