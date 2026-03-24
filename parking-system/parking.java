import java.util.*;
public class parking
{
	public static void main(String[] args) {
	    ArrayList<Vehicle> lot = new ArrayList<>();
        int total = 10;
	    
	    System.out.println("welcome to parking system");
	    while(true){
	    System.out.println("enter to proceed action");
	    System.out.println("1.Park vehicle");
	    System.out.println("2.remove vehicle");
	    System.out.println("3.exit");
	    System.out.println("enter choice");
	    
	   Scanner sc=new Scanner(System.in);
	   int c=sc.nextInt();
	   sc.nextLine();
	    
	   if(c==1){
	   if(lot.size()<10){
	            System.out.println("enter your name");
                String name=sc.nextLine();
                System.out.println("enter your vehicle number");
                String plate=sc.nextLine();
                lot.add(new Vehicle(name, plate));
                System.out.println("Vehicle parked at slot " + lot.size());}
       else{
                System.out.println("the parking slot is full");
       }
	   }
	       
	  if(c==2){
	       if (lot.isEmpty()) 
                    System.out.println("Lot is empty.");
                
            else {
                System.out.print("Enter the slot number to remove (1-" + lot.size() + "): ");
                int n = sc.nextInt();
                if (n > 0 && n <= lot.size()) {
                lot.remove(n - 1); 
                System.out.println("Vehicle removed. Others have shifted forward.");
                } 
                else{
                System.out.println("Invalid slot!");
                }
                }
	  }
	   
	   if(c==3){
	       System.out.println("bye");
	       return;
 } } } }

class Vehicle {
    String name;
    String number;

    public Vehicle(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Owner: " + name + " | Plate: " + number;
    }
}

  