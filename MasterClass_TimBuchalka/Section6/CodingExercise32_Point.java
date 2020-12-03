/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6;

/**
 *
 * @author Chrissie
 */
public class CodingExercise32_Point {

    public static void main(String[] args) {

        CodingExercise32_Point first = new CodingExercise32_Point(6, 5);
        CodingExercise32_Point second = new CodingExercise32_Point(3, 1);

        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        
        CodingExercise32_Point emptyPoint = new CodingExercise32_Point();
        System.out.println("distance() = " + emptyPoint.distance());
    }

    private int x;
    private int y;

    public CodingExercise32_Point() {

    }

    public CodingExercise32_Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public double distance() {

        int x = 0;
        int y = 0;

        return distance(x, y);

    }

    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

    }

    public double distance(CodingExercise32_Point Point) {

        return distance(Point.getX(), Point.getY());

    }

}
