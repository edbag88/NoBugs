package org.example.taskStudent;

public class Student implements Printable {
    private String studentName;
    private int numberOfCard;
    private double averageScore;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    @Override
    public void print() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Number of Card: " + numberOfCard);
        System.out.println("Average Score: " + averageScore);
    }
}
