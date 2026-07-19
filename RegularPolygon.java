/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab2;

//to use private--> getter && setter
public class RegularPolygon {
    //attribute
    private int n; //num of side
    private double side,x,y;
    //constructor --> default
    public RegularPolygon(){
        this.n=3;
        this.side=1.0;
        this.x=0.0;
        this.y=0.0;
    }
    //***********
    public RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x=0.0;
        this.y=0.0;
    }
    
    public RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    //getter
    public int getN(){
        return this.n;
    }
    public double getSide(){
        return this.side;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    public double getPerimeter(){
        return this.n*this.side;
    }
    public double getArea(){
        return (n*Math.pow(side,2))/(4.0*Math.tan(Math.PI/(double)n));
    }
    
    //method
    //main
    public static void main(String[] args) {
        RegularPolygon rg1=new RegularPolygon();
        RegularPolygon rg2=new RegularPolygon(6,4);
        RegularPolygon rg3=new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println("rg1->Perimeter: "+rg1.getPerimeter()+", Area: "+rg1.getArea());
        System.out.println("rg2->Perimeter: "+rg2.getPerimeter()+", Area: "+rg2.getArea());
        System.out.println("rg3->Perimeter: "+rg3.getPerimeter()+", Area: "+rg3.getArea());
    }
}
