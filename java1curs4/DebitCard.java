public class DebitCard extends Card{

    
   @Override 
    public void retragere (double suma) { //ar trebui sa fie cel putin la fel de permisiv ca in clasa pe care o mosteneste
     if (this.sold>=suma) {
        this.sold-=suma;
    }
}
    
}