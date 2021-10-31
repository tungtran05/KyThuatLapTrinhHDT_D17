/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loptriangle;

/**
 *
 * @author Xuan Toog
 */
public class Triangle {
    
    private Point a, b, c;

    public Triangle(String str) {
        String arr[] = str.split(" ");
        a = new Point(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]));
        b = new Point(Double.parseDouble(arr[2]), Double.parseDouble(arr[3]));
        c = new Point(Double.parseDouble(arr[4]), Double.parseDouble(arr[5]));
    }

    boolean valid() {
        double x = dodai(a, b); double y = dodai(a, c); double z = dodai(b, c);
        if(x+y>z&&x+z>y&&y+z>x)
            return true;
        return false;
    }

    String getPerimeter() {
        return String.format("%.3f", dodai(a, b) + dodai(a, c) + dodai(b, c));
    }
    
    double dodai(Point a, Point b) {
        return Math.sqrt((a.getX()-b.getX()) * (a.getX()-b.getX()) + (a.getY()-b.getY())* (a.getY()-b.getY()));
    }
    
    
}
