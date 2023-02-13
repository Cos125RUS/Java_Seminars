
public class program {
    public static void main(String[] args) {
        int num = 20;
        char sym1 = 'h';
        char sym2 = 'i';

        System.out.println(makeString(num, sym1, sym2));
    }

    private static String makeString (int num, char sym1, char sym2){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < num/2; i++)
            res.append(sym1).append(sym2);
        return res.toString();
    }
}
