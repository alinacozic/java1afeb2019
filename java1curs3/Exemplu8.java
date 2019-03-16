public class Exemplu8 {

     public static void main (String [] args){
        
       int [] [] a1 = new int [3][];// un vector cu 3 dimensiuni cu 3 obiecte null
       a1[1]=new int [4];
        
       int []b1= new int [4];
        a1[0]=b1;
        a1[1]=b1;
        a1[2]=b1;
        
        b1[3]=10;
        
        System.out.println(a1.length);
        System.out.println(a1 [0]); //[I@1c63114
        System.out.println(a1 [1]); //[I@1c63114
        
         System.out.println(a1[1][3]);  //10
         System.out.println(a1[0][3]); //10
        
      }
      
}