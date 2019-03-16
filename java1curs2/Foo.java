public class Foo{

void modificaSuma(double suma){
  suma=1000;
}

void modificaCont(Cont cont){

    cont.titular="Bill";
}

public static void main (String [] args){
 Foo f=new Foo();
 double suma= 500;
 f.modificaSuma(suma);
 System.out.println(suma);//500 atribuire prin valoare
 
 Cont c1=new Cont ("John", 1000);
 f.modificaCont(c1);
 System.out.println(c1.titular); //Bill - > atribuire prin referinta
}
}