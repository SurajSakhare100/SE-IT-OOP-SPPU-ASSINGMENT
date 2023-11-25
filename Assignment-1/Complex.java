/*

******* OOPL ASSIGNMENT 01 ******    

 Name : Suraj B. Sakhare 
 College : P.E.S Modern Pune
 Class : SE -IT 
 Roll no: 25048 
 Assignment 1: Complex Number Operation

 */

import java.util.*;
public class Complex {
	double real ;
	double img;
	Complex(double real ,double img){
		this.real=real;
		this.img=img;
	}
	public void display() {
		System.out.println(this.real+" + "+this.img+" i");
	}
	public Complex add(Complex C1,Complex C2) {
		Complex add = new Complex(0, 0);
		add.real =C1.real+C2.real;
		add.img =C1.img+C2.img;
		return add;
	}
	public Complex sub(Complex C1,Complex C2) {
		Complex sub = new Complex(0, 0);
		sub.real =C1.real-C2.real;
		sub.img =C1.img-C2.img;
		return sub;
	}
	public Complex mul(Complex C1,Complex C2) {
		Complex mul = new Complex(0, 0);
		mul.real =(C1.real*C2.real) - (C1.img*C2.img);
		mul.img =(C1.real*C2.img) + (C1.img*C2.real);
		return mul;
	}
	public Complex div(Complex C1,Complex C2) {
		Complex div = new Complex(0, 0);
		div.real =((C1.real*C2.real)+(C1.img*C2.img))*1.0/((C2.real*C2.real)+(C2.img*C2.img));
		div.img =(((C1.img*C2.real)-(C1.real*C2.img))*1.0/((C2.real*C2.real)+(C2.img*C2.img)));
		return div;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice of operation\n");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
		
		while(true) {
            System.out.print("\nfirst complex num :");
			double real_num1=sc.nextDouble();
			double img_num1 =sc.nextDouble();
			System.out.print("Second complex num :");
			double real_num2=sc.nextDouble();
			double img_num2 =sc.nextDouble();
			Complex C1 =new Complex(real_num1,img_num1);
			Complex C2 =new Complex(real_num2,img_num2);
			System.out.print("\nfirst complex num :");
			C1.display();
			System.out.print("Second complex num :");
			C2.display();
            System.out.print("\nEnter your choice:");
            int choice = sc.nextInt() ;
            System.out.print("\n");
            if(choice == 5){ break ;}
            switch(choice) {
            case 1: System.out.print("Addition of complex num :");
            		Complex add =C1.add(C1,C2);
    			    add.display();
    			    break;
            case 2: System.out.print("Subtraction of complex num :");
            		Complex sub =C1.sub(C1,C2);
    			    sub.display();
    			    break;
            case 3: System.out.print("Multiplication of complex num :");
            		Complex mul =C1.mul(C1,C2);
    			    mul.display();
    			    break;
            case 4: System.out.print("Division of complex num :");
            		Complex div =C1.div(C1,C2);
			   	    div.display();
			   	    break;
            default : 
            		System.out.print("Invalid choice, try again\n");
            }
		}
		System.out.print("Thank You..");
		
	}

}
