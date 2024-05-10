package App.Domain;

import java.util.List;

public class Team {
    private String name;
    private String club;
    private List<PlayerName> playerNames;
    private List<PlayerNum> playerNums;
    private int standing;

    public List<PlayerName> getPlayerNames(){
        return playerNames;
    }

    public void setPlayerNames(List<PlayerName> playerNames){
        this.playerNames = playerNames;
    }

    public List<PlayerNum> getPlayerNums(){
        return playerNums;
    }

    public void setPlayerNums(List<PlayerNum> playerNums){
        this.playerNums = playerNums;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getClub() { return club; }

    public void setClub(String club) { this.club = club; }

    public int getStanding() { return standing; }

    public void setStanding(int standing) { this.standing = standing; }


}
