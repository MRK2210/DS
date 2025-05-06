import java.rmi.*;
public class Server{

  public static void main(String args[]){
  
    try{
    
      ServerImpl serverimpl =new ServerImpl();
      Naming.rebind("Server",serverimpl);
          
      System.out.println("server is running ");
    }catch(Exception e){
    
        System.out.println("Error in Server is : "+e.getMessage());
    
    
    }
  }

}

