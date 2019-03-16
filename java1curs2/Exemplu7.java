public class Exemplu7 {

    public static void main (String [] args){
    
          int i=10;
          int j=20;
          int n=30;
         
          A: // eticheta =  nume pe care il dam unei iteratii/bucle
          while (i<n){
              B:
              while (j<n){
                  System.out.println(i);
                  if(j%2==0) break A; //zicem care bucla dorim sa o intrerupem, altfel face break la cea mai apropiata
                }
            }
        
    }

}