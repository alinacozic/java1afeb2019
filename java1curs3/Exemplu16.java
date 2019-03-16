public class Exemplu16 {

  public static void main (String [] args){ 
      // Var args
      //m1(); la a 2 printare ar da exceptie ou tof bounds exception
      m1(1);
      m1(2,3,4,5,6,7,8);
    }
      
      static void m1(int... x){ // nu putem avea 2 parametri de varArgs; daca avem mai multi parametri varArgs trebuie sa fie ultimul
        System.out.println(x.length);
        System.out.println(x[0]);
        }
       static void m2(int y,int... x){ // nu putem avea 2 parametri de varArgs; daca avem mai multi parametri varArgs trebuie sa fie ultimul
        System.out.println(x.length);
        System.out.println(x[0]);
        } 
       int [] x={1,2,3};
       //m3(x);
       static void m3 (int [] ...x){
       System.out.println(x.length);
        System.out.println(x[0]);
        }
       
       
  }

