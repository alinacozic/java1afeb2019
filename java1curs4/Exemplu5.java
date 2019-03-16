public class Exemplu5 {

public static void main (String [] args){
  Foo b= new Bar();
  b.x=10; // daca avem X in forma si instanta, se apeleaza cel din forma
  // b.y=20; putem sa accesam doar ce e definit de forma, nu de instanta
}

}