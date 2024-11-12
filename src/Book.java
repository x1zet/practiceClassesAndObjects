public class Book {
    String title;
    String author;
    int year;
    double price;

    public Book() {
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Название: " + title + "\nАвтор: " + author
                + "\nГод издания: " + year + " год" + "\nЦена книги: " + price);
    }

    public void applyDiscount(double discount){
        price = price * (discount/100);
    }
}
