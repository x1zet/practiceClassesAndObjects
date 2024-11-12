public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book("Война и мир", "Лев Толстой", 9999, 1020);
//        book1.applyDiscount(45);
//        book1.displayInfo();

//        Student yura = new Student("Юра", 17,4,1);
//        yura.displayInfo();
//        yura.isPassed();
//        yura.increaseGrade(1);

        Rectangle rectangle = new Rectangle(20,22);

        System.out.println("Площадь: " + rectangle.getArea() +
                "\nПериметр: "+ rectangle.getPerimeter());
        rectangle.resize(2);
        System.out.println("Высота: " + rectangle.height +
                "\nШирина: " + rectangle.width);
    }
}