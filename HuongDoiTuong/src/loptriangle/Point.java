/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loptriangle;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
class Point {
    private double x, y;

    public Point(Scanner sc) {
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
