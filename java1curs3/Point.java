public  class Point {

 int x,y;
 static int z;
 
 static { // blocurie statice se folosesc doar la prima folosire a clasei; nu am nevoie sa creez instanta
    System.out.println ("A");
 }
 
 {
    System.out.println ("B"); //se executa la fiecare instanta creata
 }
 
 void display () {
 
     System.out.println (this.x + " "+this.y);
      
 }
 
 
 static void staticDisplay (Point p){
 
     System.out.println (p.x + " "+p.y);
     // staticul face ca metoda sa nu mai apartina prototipului obiectului
     // o metoda statica e de fapt o implementare procedurala (cod greu de itretinut si neperformant)
 }
}