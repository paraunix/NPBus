package by.psu.fit.cmsn.cross_pp.lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Student student1 = new Student(); //создание объекта с исп. конструктора по умолчанию
    Student student2 = new Student(); //создание объекта с исп. конструктора по умолчанию

    System.out.println("создание студента №"+(Student.getCounter()));
    System.out.print("введите фамилию: ");
    String second_name = scanner.next();
    System.out.print("введите имя: ");
    String first_name = scanner.next();
    System.out.print("введите отчество: ");
    String middle_name = scanner.next();
    System.out.print("введите дату рождения: ");
    String date = scanner.next();
    System.out.print("введите номер зачётной книги: ");
    int number = scanner.nextInt();
    System.out.print("введите наличие средне специального образования: ");
    boolean sse = scanner.nextBoolean();
    System.out.print("введите средний балл: ");
    double gpa = scanner.nextDouble();

        Student student3 = new Student(second_name, first_name, middle_name, date, number, sse, gpa); //создание объекта с исп. конструктора с параметрами

        System.out.print("\n");
        System.out.println("создание студента №"+(Student.getCounter()));
        System.out.print("введите фамилию: ");
        second_name = scanner.next();
        System.out.print("введите имя: ");
        first_name = scanner.next();
        System.out.print("введите отчество: ");
        middle_name = scanner.next();
        System.out.print("введите дату рождения: ");
        date = scanner.next();
        System.out.print("введите номер зачётной книги: ");
        number = scanner.nextInt();
        System.out.print("введите наличие средне специального образования: ");
        sse = scanner.nextBoolean();
        System.out.print("введите средний балл: ");
        gpa = scanner.nextDouble();
        System.out.print("введите номер курса: ");
        int course = scanner.nextInt();

        Student student4 = new Student(second_name, first_name, middle_name, date, number, sse, gpa, course); //создание объекта с исп. конструктора с параметрами

        student1.printStudent2();
        student2.printStudent2();
        student3.printStudent1();
        student4.printStudent2();
    student1.editStudent2();
    student1.printStudent2();
    demonstrate();
    }
    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        Student student5 = new Student(); //создание объекта с исп. конструктора по умолчанию

        System.out.print("\n");
        System.out.println("создание студента №"+(Student.getCounter()));
        System.out.print("введите фамилию: ");
        String second_name = scanner.next();
        System.out.print("введите имя: ");
        String first_name = scanner.next();
        System.out.print("введите отчество: ");
        String middle_name = scanner.next();
        System.out.print("введите дату рождения: ");
        String date = scanner.next();
        System.out.print("введите номер зачётной книги: ");
        int number = scanner.nextInt();
        System.out.print("введите наличие средне специального образования: ");
        boolean sse = scanner.nextBoolean();
        System.out.print("введите средний балл: ");
        double gpa = scanner.nextDouble();

        Student student6 = new Student(second_name, first_name, middle_name, date, number, sse, gpa); //создание объекта с исп. конструктора с параметрами

        System.out.print("\n");
        System.out.println("создание студента №"+(Student.getCounter()));
        System.out.print("введите фамилию: ");
        second_name = scanner.next();
        System.out.print("введите имя: ");
        first_name = scanner.next();
        System.out.print("введите отчество: ");
        middle_name = scanner.next();
        System.out.print("введите дату рождения: ");
        date = scanner.next();
        System.out.print("введите номер зачётной книги: ");
        number = scanner.nextInt();
        System.out.print("введите наличие средне специального образования: ");
        sse = scanner.nextBoolean();
        System.out.print("введите средний балл: ");
        gpa = scanner.nextDouble();
        System.out.print("введите номер курса: ");
        int course = scanner.nextInt();

        Student student7 = new Student(second_name, first_name, middle_name, date, number, sse, gpa, course); //создание объекта с исп. конструктора с параметрами

        System.out.print("\n");
        System.out.println("создание студента №"+(Student.getCounter()));
        System.out.print("введите фамилию: ");
        second_name = scanner.next();
        System.out.print("введите имя: ");
        first_name = scanner.next();
        System.out.print("введите отчество: ");
        middle_name = scanner.next();

        Student student8 = new Student (second_name, first_name, middle_name);

        student5.printStudent2();
        student6.printStudent1();
        student7.printStudent2();
        student8.printStudent2();
        student6.editStudent1();
        student6.printStudent1();

        //изменение student6 при помощи set'ов
        System.out.print("\n");
        System.out.println("Изменение студента №"+student6.getId());
        System.out.print("введите фамилию: ");
        second_name = scanner.next();
        student6.setSecond_name(second_name);
        System.out.print("введите имя: ");
        first_name = scanner.next();
        student6.setFirst_name(first_name);
        System.out.print("введите отчество: ");
        middle_name = scanner.next();
        student6.setMiddle_name(middle_name);
        System.out.print("введите дату рождения: ");
        date = scanner.next();
        student6.setDate(date);
        System.out.print("введите номер зачётной книги: ");
        number = scanner.nextInt();
        student6.setNumber(number);
        System.out.print("введите средний балл: ");
        gpa = scanner.nextDouble();
        student6.setGpa(gpa);
        System.out.print("введите номер курса: ");
        course = scanner.nextInt();
        student6.setCourse(course);

        //отображение student6 при помощи get'ов
        System.out.print("\n");
        System.out.println("Cтудент №"+student6.getId());
        System.out.println("Фамилия: "+student6.getSecond_name());
        System.out.println("Имя: "+student6.getFirst_name());
        System.out.println("Дата рождения: "+student6.getDate());
        System.out.println("Номер зачётной книги: "+student6.getNumber());
        System.out.println("Наличие средне специального: "+ student6.isSse());
        System.out.println("Средний балл: "+student6.getGpa());
        System.out.println("Курс: "+student6.getCourse());
    }
    }
