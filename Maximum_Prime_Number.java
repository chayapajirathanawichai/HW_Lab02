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
public class Maximum_Prime_Number {
    //attribute
    private int num;
    private int max;
    private int c;
    //constructor
    public Maximum_Prime_Number(){
        this.max=-1;
        this.c=0;
    }
    public Maximum_Prime_Number(int num){
        this.c=0;this.max=-1;
        this.num=num;
    }
    /*public int setNumber(int number){
        this.num=number;
    }*/
    public int getNumber(){
        return this.num;
    }
    public int getMax(){
        return this.max;
    }
    public int getCount(){
        return this.c;
    }
    //method
    public boolean isPrime(){
        if(this.num<=1) return false;
        //check 2 to sqrt = i***2
        for(int i=2;i*i<=this.num;i++){
            if(this.num%i==0) return false;
        }
        return true;
    }
    public void Find_ans(int num){
        this.num=num;
        if(isPrime()){
            if(this.max==-1||this.num>this.max){
                this.max=this.num;
                this.c=1;
            }
            else if(this.num==this.max) this.c++;
        }
    }
    //main
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Maximum_Prime_Number mm=new Maximum_Prime_Number();
        System.out.print("Input: ");
        //int->string
        String line=sc.nextLine();
        String[] tokens=line.split("\\s+");//split text by space
        //string->int
        for(String token:tokens){
            int n=Integer.parseInt(token);
            //if(n==0) break;
            
            //1st time skip 0
            if(n!=0)
                mm.Find_ans(n);
        }
        
        /*while(true){
            int n=sc.nextInt();
            if(n==0) break;
            mm.Find_ans(n);
        }*/
        
        if(mm.getMax()==-1){
            System.out.println("-1");
        }
        else{
            System.out.println("Max Prime: "+mm.getMax()+" Count: "+mm.getCount());
        }
    }
}
