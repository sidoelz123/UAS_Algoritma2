package queue;

public class Queue {
    private int ukuran;
    private long[] antrean;
    private int belakang;
    private int jumlah;
    private int depan;

    public Queue(int data){
        ukuran = data;
        antrean = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumlah = 0;
    }

    public void enqueue(long data){
        if (!isFull()){
            antrean[++belakang] = data;
            jumlah++;
        }
    }

    public long dequeue(){
        long temp = antrean[0];
        if (!isEmpty()){
            for (int i=0; i<jumlah; i++)
                antrean[i] = antrean[i+1];
            jumlah--;
            belakang--;

        }
        return temp;
    }

    public boolean isEmpty(){
        return (jumlah == 0);
    }

    public boolean isFull(){
        return (belakang == ukuran-1);
    }

    public long peek(){
        return antrean[depan];
    }

    public int ukuran(){
        return ukuran;
    }

    public void show(){
        for (int i=0; i<jumlah; i++)
            System.out.print(antrean[i]+" ");
        System.out.println("");
    }
    public void Title() {
        String myHeader;
        myHeader = "==============================" +
                "\nAlgoritma dan Struktur Data 2\n" +
                "==============================";

        String Name = "Ihza Maulana Zakiya";
        int NIM = 20090049;

        String modul;
        modul = "==============================" +
                "\nUAS no. Queue\n" +
                "==============================";
        System.out.println(myHeader);
        System.out.println("\nNama : " + Name + "\nNIM : " +NIM+ "\n");
        System.out.println(modul);
    }

}