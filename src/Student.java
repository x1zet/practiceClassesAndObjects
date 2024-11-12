public class Student {
    String name;
    int age;
    double grade;
    int studentID;

    public Student() {
    }

    public Student(String name, int age, double grade, int studentID) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentID = studentID;
    }

    public void displayInfo(){
        System.out.println("Имя студента: " + name + "\nВозраст: " + age
                + "\nОценка: " + grade + "\nУникальный идентификатор студента: " + studentID);
    }

    public void isPassed(){
        if (grade >= 3){
            System.out.println("Сдал");
        }else {
            System.out.println("Не сдал");
        }
    }

    public void increaseGrade(double points){
        if (grade + points > 5){
            System.out.println("Ошибка, оценка не может быть выше 5! Текущая оценка: " +  grade);
        } else if (grade + points <= 5){
            grade += points;
            System.out.println("Оценка повысилась, оценка равняется: " + grade);
        }
    }
}
