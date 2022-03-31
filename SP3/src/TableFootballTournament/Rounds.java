package TableFootballTournament;

public abstract class Rounds implements Score {
    //FIELDS
    boolean hasWon;

    //CONSTRUCTOR
    public Rounds(){

    }

    //METHODS
    public void planRandomRound() {

    }

    public void diffScore() {

    }

    @Override
    public int getCurrentScore() {
        return 0;
    }

    @Override
    public int getFinalScore() {
        return 0;
    }

    @Override
    public int updateTeamScore() {
        return 0;
    }

    @Override
    public void teamWins() {

    }

    @Override
    public void teamLoses() {

    }
}
