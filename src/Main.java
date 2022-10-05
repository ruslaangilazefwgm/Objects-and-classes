public class Main {

    public static void main(String[] args) {
        Author kluchevskiy = new Author("Boris", "Kluchevskiy");
        Author Pushkin = new Author ("Alexandr", "Pushkin");
        Book history = new Book("History", kluchevskiy, 1896 );
        Book stihi = new Book("Stihi", Pushkin, 1830);
        stihi.setYear(1831);
        System.out.println(history.getName() + " " +history.getAuthor() + " " +history.getYear());



    }
}