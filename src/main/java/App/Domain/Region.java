package App.Domain;

import static java.lang.System.out;

public class Region {
    private String id;

    public String getRegion(){ return this.id; }

    public String setRegion(String state) {
        if (state == null) {
            return "Enter a valid US state";
        } else {
            this.id = state;
        }
        return this.id;
    }
}
