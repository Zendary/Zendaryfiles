package TableFootballTournament;

public interface Score {

    int getCurrentScore();

    int getFinalScore();

    int updateTeamScore();

    void teamWins();

    void teamLoses();

}
