package PublicPrivateProtected;

public class Field {
    private Plant plant1 = new Plant();
    public Field() {

        //size is protected; Field is in the same package as Plant
        System.out.println(plant1.size);
    }
}
