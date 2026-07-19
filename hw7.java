/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab2;

//head class

import java.util.Scanner;

public class hw7 {
    //attribute
    private double x,y,wide,height;
    //constructor-->name same class
    public hw7(double x,double y,double wide,double height){
        this.x=x;this.y=y;
        this.height=height;this.wide=wide;
    }
    //method
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getWide(){
        return this.wide;
    }
    public double getHeight(){
        return this.height;
    }
    //area&length
    public double Area(){
        return wide*height;
    }
    public double Length(){
        return 2.0*(wide+height);
    }
    
    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter r1's center x-,y-coordinates, width, and height: ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double wide1=sc.nextDouble();
        double height1=sc.nextDouble();
        hw7 r1=new hw7(x1,y1,wide1,height1);
        System.out.print("Enter r2's center x-,y-coordinates, width, and height: ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double wide2=sc.nextDouble();
        double height2=sc.nextDouble();
        hw7 r2=new hw7(x2,y2,wide2,height2);
        double r1Left=r1.getX()-(r1.getWide()/2.0);
        double r1Right=r1.getX()+(r1.getWide()/2.0);
        double r1Top=r1.getY()+(r1.getHeight()/2.0);
        double r1Bottom=r1.getY()-(r1.getHeight()/2.0);
        
        double r2Left=r2.getX()-(r2.getWide()/2.0);
        double r2Right=r2.getX()+(r2.getWide()/2.0);
        double r2Top=r2.getY()+(r2.getHeight()/2.0);
        double r2Bottom=r2.getY()-(r2.getHeight()/2.0);
        
        if(r2Left>=r1Left&&r2Right<=r1Right&&r2Top<=r1Top&&r2Bottom>=r1Bottom){
            System.out.println("r2 is inside r1");
        }
        else if(r2Left<=r1Right&&r2Right>=r1Left&&r2Bottom<=r1Top&&r2Top>=r1Bottom){
            System.out.println("r2 overlaps r1");
        }
        else{
            System.out.println("r2 does not overlaps r1");
        }
    }
}
