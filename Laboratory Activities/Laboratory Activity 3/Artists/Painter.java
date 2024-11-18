enum Medium {
    OIL,
    ACRYLIC,
    WATERCOLOR,
    DIGITAL
}

public class Painter extends Artist {

    private Medium medium;

    public Painter(String name, String nationality, int age, String specialty, Medium medium) {
        super(name, nationality, age, specialty); 
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Painter Info ==");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}