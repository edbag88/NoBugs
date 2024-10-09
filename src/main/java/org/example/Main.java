package org.example;

import org.example.task1.BankAccount;
import org.example.taskAPointOnThePlane.ApointOnThePlane;
import org.example.taskBook.Book;
import org.example.taskCar.Car;
import org.example.taskClock.Clock;
import org.example.taskStudent.Student;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(500);
        account.print();

        Book book = new Book();
        book.setName("Приключения Геккельбери Финна");
        book.setAuthor("Марк Твен");
        book.setYearOfPublication(1860);
        book.display();

        Student student = new Student();
        student.setStudentName("Тестовый Студент Студентович");
        student.setNumberOfCard(54545564);
        student.setAverageScore(4.89);
        student.print();

        ApointOnThePlane pointOnThePlane = new ApointOnThePlane();
        pointOnThePlane.setX(10);
        pointOnThePlane.setY(10);
        pointOnThePlane.moveUp();
        pointOnThePlane.moveDown();
        pointOnThePlane.moveLeft();
        pointOnThePlane.moveRight();

        Clock clock = new Clock();
        clock.setHour(7);
        clock.setMinutes(30);
        clock.setSeconds(30);
        clock.readTime();
        clock.tick();

        Car car = new Car();
        car.setName("Toyota");
        car.setModel("Rav4");
        car.setTheYearOfManufacture(2020);
        car.start();
        car.drive();
        car.stop();











       /* Calibri calibri = new Calibri();
        Eagle eagle = new Eagle();
        eagle.name = "UsEagle";
        System.out.println(eagle.name);
        eagle.eat();
        eagle.fly();
        calibri.eat();
        calibri.fly();
        System.out.println("Hello world!");


        setAge(18);
        setName("John");
    }

    public static void setAge(int age) {
        System.out.println(age + " years old");
    }
    public static void setName(String name){
        System.out.println("My name is " + name);
}*/
    }
}