public class Exemplu12 {
 
    public static void main (String [] args){
        Pisica p1;
        p1 = new Pisica("Tom"); // new = operator; restul constructor; new- este cel care arata adresa unde se gaseste instanta
        
        //p1.nume= "Tom"; // punctul este operator de diferentiere; cu ajutorul lui se citeste de la dreapta la stanga; = operator de apartenenta
        p1.greutate=10;
        p1.culoare="alb";
        
        Pisica p2= new Pisica("Leo");
        
        //p2.nume= "Leo";
        p2.greutate=2;
        p2.culoare= "negru";
        
        System.out.println (p1.nume);
 
        System.out.println (p2.nume);
        
        p1.spuneMiau();       
        p2.spuneMiau();
    }
}