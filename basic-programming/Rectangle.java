import java.util.* ;

import java.io.*; 

public class Rectangle { 

    // Write your code here.

    int length;

    int breadth;

    int getArea(){

        return length*breadth;

    }

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int l=sc.nextInt();

    int b=sc.nextInt();

    Rectangle obj=new Rectangle();

    obj.length=l;

    obj.breadth=b;

    System.out.println(obj.getArea());

    }

}

