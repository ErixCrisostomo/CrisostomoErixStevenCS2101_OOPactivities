enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA
}

public class Writer extends Artist {

    private WritingStyle style;

    public Writer(String name, String nationality, int age, String specialty, WritingStyle style) {
        super(name, nationality, age, specialty);
        this.style = style;
    }

    public WritingStyle getStyle() {
        return style;
    }

    public void setStyle(WritingStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("Writing Style: " + style);
    }
}