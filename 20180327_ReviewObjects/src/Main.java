import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Book scifi = new Book();
        Book french = new Book();
        french.setTitle("Candide");
        french.setAuthor("Voltaire");

	    scifi.setAuthor("Sanderson, Brandon");
	    scifi.setTitle("The Way of Kings");
	    scifi.setPages(1023);

	    System.out.println(scifi.getTitle() +" by " + scifi.getAuthor() );
        System.out.println(scifi.getTitle() +" by " + scifi.getProperName() );
        System.out.println(french.getTitle() +" by " + french.getProperName() );
//////////////////////////////////////
        Book history = new Book("Rise and Fall of the Roman Empire", "",800);
        System.out.println(history.getTitle() +" by " + history.getProperName() );

        System.out.println(scifi);
        System.out.println(french);
        System.out.println(history);

        System.out.println(scifi.getBiblio());
        Book b = readBookFromKeyboard();
        System.out.println(b);

        //


    }
    public static Book readBookFromKeyboard(){
        Book result = null;
        String title;
        String author;
        int pages;
        Scanner input = new Scanner(System.in);
        System.out.print("Author? ");
        author = input.nextLine();
        System.out.print("Title? ");
        title = input.nextLine();
        System.out.print("Pages? ");
        pages = input.nextInt();

        input.close();

        result = new Book(title, author, pages);
        return result;
    }
}
