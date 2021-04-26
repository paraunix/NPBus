package by.psu.fit.cmsn.cross_pp.lab2;

import java.util.Scanner;

class Student {
    private static int counter = 1; //счётчик созданных объектов класса
    private int id; //номер созданного объекта класса

    private String second_name; //фамилия студента
    private String first_name; //имя студента
    private String middle_name; //отчество студента
    private String date; //дата рождения дд-мм-гггг
    private int number; //номер зачётной книги студента
    private boolean sse; //наличие средне специального образования
    private double gpa; //средний балл
    private int course; //номер курса

    private static final String DEFAULT_SN = "NONE";
    private static final String DEFAULT_FN = "NONE";
    private static final String DEFAULT_MN = "NONE";
    private static final String DEFAULT_DATE = "01-01-1990";
    private static final int DEFAULT_NUMBER = 0;
    private static final boolean DEFAULT_SSE = false;
    private static final double DEFAULT_GPA = 0.0;

    {
        second_name = DEFAULT_SN;
        first_name = DEFAULT_FN;
        middle_name = DEFAULT_MN;
        date = DEFAULT_DATE;
        number = DEFAULT_NUMBER;
        sse = DEFAULT_SSE;
        gpa = DEFAULT_GPA;
    }

    public Student(){
        id = counter++;
    }

    public Student(String second_name, String first_name, String middle_name){
        this.second_name = second_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
        id = counter++;
    }

    public Student(String second_name, String first_name, String middle_name, String date, int number, boolean sse, double gpa){
      this.second_name = second_name;
      this.first_name = first_name;
      this.middle_name = middle_name;
      this.date = date;
      this.number = number;
      this.sse = sse;
      this.gpa = gpa;
      id = counter++;
    }

    public Student(String second_name, String first_name, String middle_name, String date, int number, boolean sse, double gpa, int course){
        this.second_name = second_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.date = date;
        this.number = number;
        this.sse = sse;
        this.gpa = gpa;
        this.course = course;
        id = counter++;
    }

    public void setSecond_name(String second_name){
      this.second_name = second_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setMiddle_name(String middle_name){
        this.middle_name = middle_name;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setSse(boolean sse){
        this.sse = sse;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() { return id; }

    public String getSecond_name() {
        return second_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public boolean isSse() {
        return sse;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCourse() {
        return course;
    }

    public void printStudent1() {
        System.out.print("\n");
        System.out.println("студент №" + getId());
        System.out.println("фамилия: " + getSecond_name());
        System.out.println("имя: " + getFirst_name());
        System.out.println("отчество: " + getMiddle_name());
        System.out.println("дата рождения: " + getDate());
        System.out.println("номер зачётной книги: " + getNumber());
        System.out.println("наличие средне специального образования: " + isSse());
        System.out.println("средний балл: " + getGpa());
    }

    public void printStudent2(){
        printStudent1();
        System.out.println("курс: " + getCourse());
        }
        
    public void editStudent1(){
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("редактирование студента №"+id);
        System.out.print("введите фамилию: ");
        setSecond_name(scanner.next());
        System.out.print("введите имя: ");
        setFirst_name(scanner.next());
        System.out.print("введите отчество: ");
        setMiddle_name(scanner.next());
        System.out.print("введите дату рождения (дд-мм-гггг): ");
        setDate(scanner.next());
        System.out.print("введите номер зачётной книги: ");
        setNumber(scanner.nextInt());
        System.out.print("введите наличие средне специального образования: ");
        setSse(scanner.nextBoolean());
        System.out.print("введите средний балл: ");
        setGpa(scanner.nextDouble());
        }
    public void editStudent2(){
        editStudent1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите курс: ");
        setCourse(scanner.nextInt());
    }
        }
