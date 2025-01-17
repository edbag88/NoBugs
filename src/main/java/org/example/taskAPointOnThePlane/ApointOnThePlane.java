package org.example.taskAPointOnThePlane;

public class ApointOnThePlane implements Movable{
    private int x;
    private int y;

    @Override
    public void moveUp(){
        System.out.println("Двигаемся верх");
    }

    public void moveDown(){
        System.out.println("Двигаемся вниз");
    }
    public void moveRight(){
        System.out.println("Двигаемся вправо");
    }
    public void moveLeft(){
        System.out.println("Двигаемся влево");
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
