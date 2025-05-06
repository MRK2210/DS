import java.rmi.*;
import java.util.Scanner;

public class Client{

  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    try{
        
    String serverurl="rmi://localhost/Server";
    
    ServerInf serverintf = (ServerInf) Naming.lookup(serverurl);
    
    System.out.println("Enter First Number : ");
    double num1=sc.nextDouble();
    
    System.out.println("Enter Second Number : ");
    double num2=sc.nextDouble();
    
    
    System.out.println("The addition is  : " + serverintf.add(num1,num2));
    
    }catch(Exception e){
    
        System.out.println("Error in Server is : "+e.getMessage());
    
    }
  }
}


