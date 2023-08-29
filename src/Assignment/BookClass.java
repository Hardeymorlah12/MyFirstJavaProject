package Assignment;
import java.util.*;
public class BookClass {
    int id, quantity;
    String name, author, publisher;

    public BookClass(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public static void main(String[] args) {
        BookClass book1 = new BookClass(1, "Head Fist Java", "Kathey Sierra", "Hardey", 20);
        BookClass book2 = new BookClass(2, "Good Days","Saheed", "Hardex Press", 34);
        BookClass book3 = new BookClass(3, "Pressure Times", "Smart", "Lion Press", 53);

        ArrayList<BookClass> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Iterator itr = books.iterator();
        while (itr.hasNext()){
            BookClass bk = (BookClass) itr.next();
            System.out.println("Book Id: " + bk.id + " " + "Book name: " + bk.name + " " + "Book Author: " + bk.author + " " + "BooK Publisher: " + bk.publisher + " " + "Book Quantity: " + bk.quantity);
        }
    }


    }


