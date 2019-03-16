public class Exemplu6 {
    
    public static void main (String[] args ) {
    
    Card c= new DebitCard (); // se apeleaza metoda instantei nu a formei
    c.sold=1000;
    
    c.retragere (1110);
    
    System.out.println (c.sold); //1000
        
    }
}