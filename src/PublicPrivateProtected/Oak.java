package PublicPrivateProtected;

public class Oak extends Plant {

    public Oak() {
        //Won't work as the variable type is private
        //type = "tree";


        //This works as size is protected and oak is a subclass of plant
        this.size = "Large";
    }
}
