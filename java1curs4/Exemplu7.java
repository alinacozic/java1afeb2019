public class Exemplu7 {

    public static void main (String [] args) {
    
        Anotimp a1 = Anotimp.IARNA;
        
        switch (a1) {
         case VARA:
            System.out.println ("Vara");
            break;
        
        }
       
        String name =a1.name ();
        int o=a1.ordinal ();
        System.out.println (name + " "+o);
        
        
        for (Anotimp x:Anotimp.values()) 
            System.out.println (x);
    }

}