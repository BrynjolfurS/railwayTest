package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


public class Player {
    private long ID;
    private String playerName;
    private String playerInfo;
    private int wins;
    private int losses;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(String playerInfo) {
        this.playerInfo = playerInfo;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public Player(String playerName, String playerInfo, int wins, int losses) {
        this.playerName = playerName;
        this.playerInfo = playerInfo;
        this.wins = wins;
        this.losses = losses;
    }
}
