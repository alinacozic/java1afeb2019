package p2;
//import p1.* ;// a doua modalitate de a apela obiectele altei clase . &* = wildcard, ne ajuta sa nu repetam importul a mai multor clase din acelasi packet
 // nu se importa si clasele din sub-pachete, trebuie sa adaugam un nou import de ex p1.p3.*
 // nu putem avea importuri cu 2 * gen: import p1.*.*
 
 // daca dorim sa importam mai multe clase cu acelasi nume, atunci e obligatoriu sa folosim diferentierea (atlfel va lua mereu pe cel din pachetul curent)
 // daca nu avem o clasa locala ci folosim din ale 2 pachete, atunci da eroare de compilare daca nu folosim indicatorul de diferentiere
import p1.A; // importurile se scriu mereu dupa package si inainte de declararea clasei

// importul staic= ne ajuta sa importam doar un membru static
import static p1.A.m;
import static p1.A.x;

public class B {

 //p1.A a = new p1.A(); // prima modalitate de a apela o clasa a altui pachet  = diferentiere.
 
 public void a() {
    
    A.m ();
    A.m ();
    A.m ();
    x=10;
    }

}
