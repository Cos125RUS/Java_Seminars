import java.util.ArrayList;

public class Task04 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int a = 2;
        int b = 201;
        int c = 2;
        int d = 1;
//        var s1 = System.currentTimeMillis();
//        System.out.println("res collection = " + collection(a, b, c, d, nums));
//        System.out.println("time collection = " + (System.currentTimeMillis() - s1));
        var s2 = System.currentTimeMillis();
        System.out.println("res recursion = " + recursion(a, b, c, d));
        System.out.println("time recursion = " + (System.currentTimeMillis() - s2));
//        var s3 = System.currentTimeMillis();
//        System.out.println("res array = " + array(a, b, c, d));
//        System.out.println("time array = " + (System.currentTimeMillis() - s3));
//        var s4 = System.currentTimeMillis();
//        System.out.println("res mat = " + mat(a, b, c, d));
//        System.out.println("time mat = " + (System.currentTimeMillis() - s4));
        var s5 = System.currentTimeMillis();
        System.out.println("res backArray = " + backArray(a, b, c, d));
        System.out.println("time backArray = " + (System.currentTimeMillis() - s5));
        var s6 = System.currentTimeMillis();
        System.out.println("res backCollection = " + backCollection(a, b, c, d, nums));
        System.out.println("time backCollection = " + (System.currentTimeMillis() - s6));
    }


    static int backCollection(int a,int b, int c, int d, ArrayList<Integer> nums) {
        nums.add(b);
        int count = 0;
        while (nums.size() > 0) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == a) {
                    count++;
                    nums.remove(i);
                } else if (nums.get(i) < a)
                    nums.remove(i);
                else {
                    nums.add(nums.get(i) - d);
                    if (nums.get(i) % c == 0)
                        nums.add(nums.get(i) / c);
                    nums.remove(i);
                }
            }
        }

        return count;
    }
    static int backArray(int a, int b, int c, int d){
        int count = 0;
        int[] arr = new int[100000];
        arr[0] = b;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    break;
                else if (arr[i] == a) {
                    arr[i]--;
                    count++;
                }
                else if (arr[i] > a){
                    flag = true;
                    if (arr[i]%c == 0){
                        for (int j = i; j < arr.length; j++){
                            if (arr[j] == 0){
                                arr[j] = arr[i]/c;
                                break;
                            }
                        }
                    }
                    arr[i] = arr[i]-d;
                }
            }
        }

        return count;
    }
    static int mat(int a, int b, int c, int d){
        int count = 0;
        if (b%d == 0) count++;
        while (b-d>a){
            if (b%c == 0){
                count++;
                int z = b/c;
                int i = 1;
                while (z%c==0) {
                    count++;
                    i*=2;
                    z /= c;
                }
                count+=i;
            }
            b -= d;
        }



        return count;
    }
    static int array(int a, int b, int c, int d) {
        int count = 0;
        int[] arr = new int[10000000];
        arr[0] = a;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    break;
                else if (arr[i] == b) {
                    arr[i]++;
                    count++;
                }
                else if (arr[i] < b){
                    flag = true;
                    for (int j = i; j < arr.length; j++){
                        if (arr[j] == 0){
                            arr[j] = arr[i]+d;
                            break;
                        }
                    }
                    arr[i] = arr[i]*c;
                }
            }
        }

        return count;
    }


    static int collection(int a, int b, int c, int d, ArrayList<Integer> nums) {
        nums.add(a);
        int count = 0;
        while (nums.size() > 0) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == b) {
                    count++;
                    nums.remove(i);
                } else if (nums.get(i) > b)
                    nums.remove(i);
                else {
                    nums.add(nums.get(i) * c);
                    nums.add(nums.get(i) + d);
                    nums.remove(i);
                }
            }
        }

        return count;
    }

    static int recursion(int a, int b, int c, int d) {
        if (a == b)
            return 1;
        else if (a > b)
            return 0;
        else
            return recursion(a * c, b, c, d) + recursion(a + d, b, c, d);
    }
}
