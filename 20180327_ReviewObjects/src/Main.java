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
        Book history = new Book("Rise and Fall of the Roman Empire", "",800);


        int n = 5;
        Book[] library = new Book[n];
        library[0] = scifi;
        library[1] = french;
        library[2] = history;
        library[3] = new Book("Programming in Java","Liang", 1595);
        library[4] = new Book("Color of War", "Sanderson, Brandon", 475);

        printBooks(library,n);
    }

    private static void printBooks(Book[] library, int n) {
        System.out.println("---------------------");
        int pageTotal = 0;
        for(int i=0;i<n;i++){
            pageTotal += library[i].getPages();
            System.out.println(library[i]);
        }
        System.out.printf("Average size: %1.0f pages",(double)pageTotal/n);
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
