
public class Exemplu4{

   public static void main(String [] args){
             
      int a=10, b=20;
      
      //a=a++ +b;
      
      //a=a+b++;
      
      a=a+ ++b;
      
      System.out.println(a); //30 ; 30 ; 31
      System.out.println(b); //20 ; 21 ; 21
   }
}