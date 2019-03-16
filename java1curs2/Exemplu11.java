public class Exemplu11 {

  public static void main (String [] args){
      
    int i=1, n=10;
    
    do{ // la do-while acoladele nu pot lipsi (spre deosebire de if, while...)
       System.out.println (i);
       i++;
    } while (i<n);
  }
}