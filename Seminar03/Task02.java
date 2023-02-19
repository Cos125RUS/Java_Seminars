public class Task02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 11;
        int c = 2;
        int d = 1;
        System.out.println(function(a,b,c,d));
    }

    static int function(int a, int b, int c, int d){
        if (a==b) return 1;
        else if (a > b) return 0;
        else {
            return function(a*c, b, c, d) + function(a+d, b, c, d);
        }
    }
}
