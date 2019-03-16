public class Baz {

    Baz () {
        this (10); // se apeleaza al 2 constructor; se poate folosi doar o singura data si doar ca o prima instructiune!!!
    }

     Baz (int x) {
         this (":", 10);
    }
    
     Baz (String x, int y) {
    }
}