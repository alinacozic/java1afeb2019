public class Exemplu1{

  public static void main (String [] Args){
      
      Point.z=10;
      
      Point p1 = new Point();
      Point p2 = new Point ();
      p1.x=10;
      p2.x=20;
      
      p1.z=10; // --> Point.z=10
      p2.z=20;// --> Point.z=20
      
      System.out.println ("x=" + p1.x);
      System.out.println ("x=" + p2.x);
      System.out.println ("z=" + p1.z); //20
      System.out.println ("z=" + p2.z); //20
   }
}