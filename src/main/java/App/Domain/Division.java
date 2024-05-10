package App.Domain;

public class Division {
    private String type; //open, club, american
    private String rank; // u12, u14, u16, u18

    public String getType(){ return type; }
    public String getRank(){ return rank; }

    public void setType(String type){ this.type = type; }
    public void setRank(String rank){ this.rank = rank; }
}
