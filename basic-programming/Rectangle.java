//Problem link: https://www.naukri.com/code360/guided-paths/oops-in-java/content/279841/offering/3844020

import java.util.* ;

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

