package exambean;

import examproto.Book;

import java.io.IOException;

public class ApplicationContextMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ApplicationContext applicationContext = ApplicationContext.getInstance();
        Book book2 = (Book) applicationContext.getBeans("book1");
        book2.setTitle("즐거운 Python");
        book2.setPrice(21000);

        System.out.println(book2.getTitle());
        System.out.println(book2.getPrice());

        System.out.println("----------------");

        Book book3 = (Book) applicationContext.getBeans("book1");
        System.out.println(book3.getTitle());
        System.out.println(book3.getPrice());
        if(book2 == book3) {
            System.out.println("Same Instance!");
        } else {
            System.out.println("Different Instance!");
        }

    }
}
