public class Cont {

String titular;
double sold;

Cont (String titular, double sold){
  this.titular=titular;
  this.sold=sold;
  System.out.println("C");
}

// Blocuri anonime; putem scrie cate blocuri dorim
// se ruleaza de fiecare data cand cream o instanta
// se executa in ordinea in care sunt declarate, dupa care se executa constructorul
// in exemplul asta se va afisa A B C (in ordinea asta) X cate instante avem
{
System.out.println("A");
}


{
System.out.println("B");
}

void depune (double suma) {
  this.sold+=suma;
}

boolean retrage (double suma){
    if (this.sold>=suma){
       this.sold-=suma;
       return true;
    } 
     return false; // puteam si eu else, dar mai bine il evitam in situatia data
    }

void transfera (Cont c, double suma){
  c.retrage (suma);
  this.depune (suma);
}
}