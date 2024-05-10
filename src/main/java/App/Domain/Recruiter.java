package App.Domain;

public class Recruiter {
    private String name; // First & Last
    private String Affiliate; // UM, MSU, MTech, etc.
    private String rank; // DI, DII, DIII, NAIA,& JuCo

    public String getName() { return name; }
    public String getAffiliate() { return Affiliate; }
    public String getRank() { return rank; }

    public void setName(String name) { this.name = name; }
    public void setAffiliate(String affiliate) { Affiliate = affiliate; }
    public void setRank(String rank) { this.rank = rank; }
}
