
/*

******* OOPL ASSIGNMENT 03 ******    

 Name : Suraj B. Sakhare 
 College : P.E.S Modern Pune
 Class : SE-IT 
 Roll no: 25048 
 Assignment 3: Employee DataBase using Inheritance

 */
import java.util.*;

class Employee {
        String emp_name;
        String address;
        String mail_id;
        long mobile_no;
        int emp_id;
        Scanner sc = new Scanner(System.in);
        double  da ,basic, hra , pf , club , gross , net ;

        public void getSal()
        {
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Basic Amount Of salary of employee: ") ;
            int basic = sc.nextInt() ;
            this.basic = basic ;
        }
        public void calculateSal()
        {
            da = basic*0.97 ;
            hra = basic*0.1 ;
            pf = basic*0.12 ;
            club = basic*0.001 ;

            // Calculating gross salary and net salary
            gross = basic - pf ;
            net = gross - hra - club ;
        }
        public void displaySalary()
        {
            System.out.println("\nBasic Pay of the employee: " + basic) ;
            System.out.println("DA of the employee: " + da) ;
            System.out.println("HRA of the employee: " + hra) ;
            System.out.println("PF of the employee: " + pf) ;
            System.out.println("Staff club fund of the employee: " + club) ;
            System.out.println("Gross salary of the employee: " + gross) ;
            System.out.println("Net salary of the employee: "+ net) ;
        }
    }

class Programmer extends Employee // For Programmer
{
	public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------ Enter Programmer Details ------------------\n");
        
        // Get

        System.out.print("Enter Name: ");
        emp_name = sc.next();
        
        System.out.print("Enter ID: ");
        emp_id = sc.nextInt();
        
        System.out.print("Enter adress: ");
        address = sc.nextLine();
        
        System.out.print("Enter Mail-id: ");
        mail_id = sc.next();

        System.out.print("Enter Mobile number: ");
        mobile_no = sc.nextLong();
        
    }
	public void display() {
    	System.out.println("\n------------------ Programmer Details ------------------\n");
        System.out.println("Name of the employee is: " + emp_name);
        System.out.println("Id of the employee is: " + emp_id);
        System.out.println("Address of the employee is: " + address);
        System.out.println("Mail id of the employee is: " + mail_id);
        System.out.println("Mobile number of the employee is: " + mobile_no);
    }	
}
class assistantProjectManager extends Employee // For Assistant Project Manager
{
	public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------ Enter assistantProjectManager Details ------------------\n");
        
        // Get

        System.out.print("Enter Name: ");
        emp_name = sc.next();
        
        System.out.print("Enter ID: ");
        emp_id = sc.nextInt();
        
        System.out.print("Enter adress: ");
        address = sc.nextLine();
        
        System.out.print("Enter Mail-id: ");
        mail_id = sc.next();

        System.out.print("Enter Mobile number: ");
        mobile_no = sc.nextLong();
        

    }
	public void display() {
    	System.out.println("\n------------------ assistantProjectManager Details ------------------\n");
        System.out.println("Name of the employee is: " + emp_name);
        System.out.println("Id of the employee is: " + emp_id);
        System.out.println("Address of the employee is: " + address);
        System.out.println("Mail id of the employee is: " + mail_id);
        System.out.println("Mobile number of the employee is: " + mobile_no);
    }	
}
class teamLead extends Employee // For Team Lead
{
	public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------ Enter teamLead Details ------------------\n");
        
        // Get

        System.out.print("Enter Name: ");
        emp_name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        emp_id = sc.nextInt();
        
        System.out.print("Enter adress: ");
        address = sc.nextLine();
        
        System.out.print("Enter Mail-id: ");
        mail_id = sc.next();

        System.out.print("Enter Mobile number: ");
        mobile_no = sc.nextLong();
        

    }
	public void display() {
    	System.out.println("\n------------------ assistantProjectManager Details ------------------\n");
        System.out.println("Name of the employee is: " + emp_name);
        System.out.println("Id of the employee is: " + emp_id);
        System.out.println("Address of the employee is: " + address);
        System.out.println("Mail id of the employee is: " + mail_id);
        System.out.println("Mobile number of the employee is: " + mobile_no);
    }	}
class projectManager extends Employee // For Project Manager
{
	public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------ Enter projectManager Details ------------------\n");
        
        // Get

        System.out.print("Enter Name: ");
        emp_name = sc.next();
        
        System.out.print("Enter ID: ");
        emp_id = sc.nextInt();
        
        System.out.print("Enter Mail-id: ");
        mail_id = sc.next();
        
        System.out.print("Enter adress: ");
        address = sc.nextLine();

        System.out.print("Enter Mobile number: ");
        mobile_no = sc.nextLong();

    }
	public void display() {
    	System.out.println("\n------------------ projectManager Details ------------------\n");
        System.out.println("Name of the employee is: " + emp_name);
        System.out.println("Id of the employee is: " + emp_id);
        System.out.println("Address of the employee is: " + address);
        System.out.println("Mail id of the employee is: " + mail_id);
        System.out.println("Mobile number of the employee is: " + mobile_no);
    }	}
public class Main {
	 public static void menu()
	    {
	        System.out.println("\n---------------------------------------") ;
	        System.out.println("1.Programmer") ;
	        System.out.println("2.Team Leader") ;
	        System.out.println("3.Assistant Project Manager") ;
	        System.out.println("4.Project Manager") ;
	        System.out.println("5.Exit") ;
	        System.out.println("---------------------------------------") ;
	    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        while(true)
        {
            menu() ;
            System.out.print("Please enter your choice: ") ;
            int choice ;
            choice = sc.nextInt() ;
            if(choice==5) {break;}
            
            switch(choice) {
            case 1: Programmer obj = new Programmer();
            		obj.getData();
            		obj.getSal();
            		obj.calculateSal();
            		obj.display();
            		obj.displaySalary();
            		break;
            case 2: teamLead obj2 = new teamLead();
            		obj2.getData();
            		obj2.getSal();
            		obj2.calculateSal();
            		obj2.display();
            		obj2.displaySalary();
            		break;
            case 3: assistantProjectManager obj3 = new assistantProjectManager();
            		obj3.getData();
            		obj3.getSal();
            		obj3.calculateSal();
            		obj3.display();
            		obj3.displaySalary();
            		break;
            case 4: projectManager obj4=new projectManager();
                    obj4.getData();
                    obj4.getSal();
                    obj4.calculateSal();
                    obj4.display();
                    obj4.displaySalary();
                    break;
            		
            default:System.out.println("Invalid choice") ;
            }
            
        }
        System.out.println("Thank You") ;
    }

	
	}


