public class Foo {
    
    static final int q=10;
    
    final int z;
    
    Foo (int z){ // singurul care are sens cand se initializeaza in contructor
    
        this.z=10;
        
    }
    
    final int w;
    
    {
        w=2;
    }
    
    void m1(final int P){
    
     final int X;
     X=10;
     final int CONSTANTA_MEA=5; 
    }
}