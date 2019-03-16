public class Bar {

    void m(){
    }
    
    static void m(int i){
    }
    
    void m (double d){
    }
    
    void m(String s, double d){
    }
    
    //void m(String s, double s){
    //} eroare de compilare
    
    void m(double s, String d){
    }
    
    void m(Foo foo){
    }
    
    void m(Bar bar){
    }
    // daca apelam m(null) da eroare de compilare; trebuie sa specificam obiectul ex m( (Foo) null)
}