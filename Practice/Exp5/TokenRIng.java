import java.util.*;
import java.io.*;

class TokenRing{

  public static void main(String args[]){
  
  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of nodes : ");
    int n =sc.nextInt();
    
    for(int i=0;i<n;i++){
      
      System.out.print(" "+i);
    }
    System.out.println(" "+ 0 );
    
          int ch=0,token=0;
    do{
    

          System.out.print("Enter Sender : ");
          int s = sc.nextInt();
          
          System.out.print("Enter Receiver : ");
          int r = sc.nextInt();
          
          System.out.print("Enter Data : ");
          int d = sc.nextInt();
    
    System.out.println("Token passing ");
    for(int i=token;i<s;i++){
      System.out.print(" "+i+"->");
    }
    System.out.println(" " + s);
    
    for(int i=s;i!=r;i=(i+1)%n)
    {
        System.out.println("Data "+ d +"forwaded by : "+i); 
    }
    
    System.out.println("Data "+d+ " received to receiver : "+r);
    token=s;
    
    do{
        try{
        int flag=0;
            if(ch!=1 && ch!=0)
            {
              flag=1;
            }
            
            else
            {
              flag=0;
            }
        
        }catch(InputMismatchException e){
        
          System.out.println("Enter valid input");
        }
             
      }while(ch!=1 && ch!=0);
    }while(ch==1);
  
  
}

}
