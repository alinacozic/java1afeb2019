public class Pisica {
 
    String nume;
    String culoare;
    int greutate;
    
   Pisica(){
       System.out.println("A fost creata o instanta de pisica!");
     
   }  
   Pisica (String nume){
    this.nume=nume; //this - >instanta care se creaza
   }
   
   void spuneMiau(){
    
       System.out.println ("Miau! Numele meu este "+this.nume); //this - >instanta care se comporta
    }
}