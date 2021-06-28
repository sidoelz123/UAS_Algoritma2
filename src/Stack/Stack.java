package Stack;

public class Stack {
    public int ukuran;
    public long[] tumpukan;
    public int top;

    public Stack(int data){
        ukuran = data;
        tumpukan =  new long[ukuran];
        top = -1;
    }

    public void push(long data){
        tumpukan[++top] = data;
    }

    public long pop(){
        return tumpukan[top--];
    }

    public long peek(){
        return tumpukan[top];
    }

    public boolean isEmpty(){
        return (top == ukuran-1);
    }

    public boolean isFull(){
        return (top == ukuran-1);
    }

    public void show(){
        int i = top;
        while (i>=0){
            System.out.print(tumpukan[i]+" ");
            i--;
        }
        System.out.println("\n");
    }

    public static void Title() {
        String myHeader;
        myHeader = "==============================" +
                "\nAlgoritma dan Struktur Data 2\n" +
                "==============================";

        String Name = "Ihza Maulana Zakiya";
        int NIM = 20090049;

        String modul;
        modul = "==============================" +
                "\nUAS no.1 Stack\n" +
                "==============================";
        System.out.println(myHeader);
        System.out.println("\nNama : " + Name + "\nNIM : " +NIM+ "\n");
        System.out.println(modul);
    }

}