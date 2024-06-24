import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Login:");
int Login = sc.nextInt ();
    int SenhaAdmin = 1234;
    int Login1 = 1 ;
    if (Login == Login1){
      System.out.println("Coloque sua senha:");
      int senha = sc.nextInt();
      if(senha == SenhaAdmin);
      System.out.println("Acesso Permitido");
    } else{
System.out.println("Acesso Negado");
    } 
    



      



    

    sc.close();
  }

  
}