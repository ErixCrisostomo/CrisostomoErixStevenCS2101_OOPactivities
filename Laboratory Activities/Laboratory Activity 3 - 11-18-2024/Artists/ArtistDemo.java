public class ArtistDemo {
    public static void main(String[] args) {

        Artist artist = new Artist("Bruno Major", "British", 36, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Grent Perez", "Filipino-Australian", 22, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Leonardo Da Vinci", "Italian", 67, "Art", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("William Shakespeare", "English", 52, "Writing", WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", "American", 41, "Dance", DanceStyle.BALLET);
        dancer.displayInfo();
    }
}