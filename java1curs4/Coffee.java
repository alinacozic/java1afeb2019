public enum Coffee {

    SMALL(10), MEDIUM(50), BIG;
    private int qty;
    
    Coffee () {} //aici default e private; nu poate fi de alt timp-> da eroare de compilare
    
    Coffee (int qty) {
    this.qty=qty;
    }
    
    public void drink () {
    this.qty--;
    }

}