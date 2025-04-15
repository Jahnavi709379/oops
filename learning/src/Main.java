//TIP To <value2>Run</value2> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

                Book b1 = new Book();
                b1.setBookTitle("Personalitydevelopment");
                b1.setAuthorName("jahnavi");
                b1.getYearOfPublication();
                b1.setYearOfPublication(2023);

                Book b2 = new Book();
                b2.setBookTitle("relationships");
                b2.setAuthorName("jahnavi1");
                b2.setYearOfPublication(2025);

                Book b3 = new Book();
                b3.setBookTitle("Friendship");
                b3.setAuthorName("jahnavi2");
                b3.setYearOfPublication(2022);

                List<Book> books = new ArrayList<>();
                books.add(b1);
                books.add(b2);
                books.add(b3);

                b1.getBookTitle();
                b2.getBookTitle();
                for (int i = 0; i < books.size(); i++) {
                        Book currentbook = books.get(i);
                        System.out.println(currentbook.getBookTitle());
                        System.out.println(currentbook.getAuthorName());
                        System.out.println(currentbook.getYearOfPublication());

                        //Dog myDog = new Dog();
                        //myDog.bark();
                }
        }
}















