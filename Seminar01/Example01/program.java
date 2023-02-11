public class program {
    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.append(1);
    ml.append(12);

    ppend(1234);

        for (int i = 0; i < ml.count(); i++) {
            System.out.println(ml.getItemBy(i));
        }


    Node mll = new Node();
    mll.value = 12;
    mll.next.next.next.next.next.next.next.next
    }
}

class MyList{
int[] data = new int[0];

public void append(int item){
    int size = data.length;
    int [] temp = new int[size+1];
    for (int i = 0; i < size; i++){
        temp[i] = data [i];
    }
    temp[size] = item;
    data = temp;
}

public int count(){
    return data.length;
}

public int getItemBy(int index){
    return data[index];
}
}

class Node{
int value;
Node next;
}