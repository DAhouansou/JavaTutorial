package PublicPrivateProtected;

public class Plant {
    public String name;

    public final static int ID = 14;

    // cant be accessed in ANY other classes
    private String type;

    protected String size;


    public Plant() {
        name = "Freddy";
        this.type = "plant";

        this.size = "Small";
    }
}
