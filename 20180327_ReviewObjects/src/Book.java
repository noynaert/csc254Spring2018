public class Book {
    private String title;
    private String author;
    private int pages;
        //Data members or data fields are "encapsulated" by declaring them private.

    //constructor
    public Book(String title, String author, int pages){
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }
    public Book(){
        this("","",-1);
    }

    public void setTitle(String title){
        if(title.length() > 0)
            this.title = title;
        else
            this.title = "No Title";
    }
    public void setAuthor(String author){
        this.author = (author.length()>0) ? author : "Anonymous";
    }
    public void setPages(int pages){
        this.pages=(pages > 0) ? pages : 1;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
    public String getProperName(){
        String[] parts = author.split(", ");
        String properName = author;
        if(parts.length == 2)
             properName = parts[1] + " " + parts[0];
        return properName;
    }

    @Override
    public String toString() {
        String result;
        result = String.format("%s by %s (%d pages)", title, getProperName(),pages);
        return result;
    }
    public String getBiblio(){
        String result = String.format("%s, \"%s\" %d pages",author, title, pages);
        return result;
    }
}
