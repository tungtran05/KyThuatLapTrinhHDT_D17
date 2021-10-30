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
class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double dodai(Point a, Point b) {
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    public String getPerimeter() {
        return String.format("%.3f", dodai(a, b) + dodai(a, c) + dodai(b, c));
    }

    public boolean valid() {
        double x = dodai(a, b), y = dodai(a, c), z = dodai(b, c);
        if(x+y>z && x+z>y && y+z>x) return true;
        return false;
    }
    
    
}
