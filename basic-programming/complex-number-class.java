//Problem link: https://www.naukri.com/code360/guided-paths/oops-in-java/content/279841/offering/3844016? 

import java.util.Scanner ;
class ComplexNumbers {
    // Write your code here
    int a,b;
    ComplexNumbers(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void plus(ComplexNumbers other){
       this.a+=other.a;
       this.b+=other.b;
    }
    public void multiply(ComplexNumbers other){
        int newReal = (this.a * other.a) - (this.b * other.b);
        int newImaginary = (this.a * other.b) + (this.b * other.a);
        this.a = newReal;
        this.b = newImaginary;
    }
    public void print(){
        System.out.println(this.a+" + i"+this.b);
    }
}
class Solution {
    public static void main(String args[]) {
        // Write your code here
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int a1=sc.nextInt();
         int b1=sc.nextInt();
         int n=sc.nextInt();
        ComplexNumbers c1=new ComplexNumbers(a, b);
        ComplexNumbers c2=new ComplexNumbers(a1, b1);
        switch(n){
            case 1:c1.plus(c2);
                   c1.print();
                   break;
            case 2: c1.multiply(c2);
                    c1.print();
                    break;
        }
    }
}