package oops;

import java.util.Scanner;

class CalculateAreaMain {
    public static void main(String args[])
    {
        double l, b, h, r, s;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = get.nextDouble();
        h = get.nextDouble();
        area.findTriangle(b, h);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = get.nextDouble();
        b = get.nextDouble();
        area.findRectangle(l, b);
 
        System.out.print("\nEnter Side of a Square: ");
        s = get.nextDouble();
        area.findSquare(s);
 
        System.out.print("\nEnter Radius of Circle: ");
        r = get.nextDouble();
        area.findCircle(r);
    }
}   