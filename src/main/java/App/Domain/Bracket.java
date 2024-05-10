package App.Domain;

public class Bracket {
    private int seedNum; //number of teams in bracket

    private String level; // Gold, Silver, Bronze

    public String getBracket(int standing){ return this.level; }

    public String setBracket(int standing){
        if (standing <= 10){
            this.level = "Gold";
        }
        else if (standing <= 20){
            this.level = "Silver";
        }
        else if (standing <= 30){
            this.level = "Bronze";
        }
        return this.level;
    }



}
