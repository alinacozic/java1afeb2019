public class Exemplu5 {


  public static void main (String [] args){
    
     int[] x1; 
     x1 = new int[5];
     
     x1[0]=5;
     
     System.out.println (x1.length);
     System.out.println (x1[0]);
     System.out.println (x1[1]); // printeaza 0 nu null pt ca sunt atribute 
     /* valorile implicite ale variabilelor declarate (zonelor de memorie variabile statice sau non-statice) declarate direct in clasa:
      * * int, short =0
      * * char= /u00000
      * * boolean=false
      * * obiect = null
      * * 
      */
  }    
    
}