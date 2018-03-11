public class Bookshelf {

    public static void main(String[] args) {

        Book book1, book2, book3;

        book1 = new Book("Programming is easy", "Dan Dandson", "MyBooks", "1/5/2012");
        book2 = new Book("Programming is nice", "Peter Peterson", "HisBooks", "2/6/2013");
        book3 = new Book("Programming is needed", "John Johnson", "TheirBooks", "3/7/2014");

        book1.setTitle("I just changed the title, awesome");

        System.out.println(book2.getAuthor() + ", getters are cool.\n");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
