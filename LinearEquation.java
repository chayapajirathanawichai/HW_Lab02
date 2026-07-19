/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab2;

import java.util.Scanner;

/**
 *
 * @author Pet
 */
public class LinearEquation {
    private double a,b,c,d,e,f;
    private double x,y;
    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;this.b=b;this.c=c;
        this.d=d;this.e=e;this.f=f;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getD(){
        return this.d;
    }
    public double getE(){
        return this.e;
    }
    public double getF(){
        return this.f;
    }
    public boolean isSolvable(){
        return (a*d-b*c)!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        LinearEquation l=new LinearEquation(a, b, c, d, e, f);
        if(l.isSolvable()){
            System.out.println("x is "+l.getX()+" and y is "+l.getY());
        }
        else{
            System.out.println("The equation has no solution");
        }
    }
}
