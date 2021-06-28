package Stack;

public class mainStack {
    public static void main(String[] args) {
        Stack.Title();
        Stack tumpukan = new Stack(10);
        tumpukan.push(10);
        tumpukan.show();
        tumpukan.push(30);
        tumpukan.show();
        long bacaTop = tumpukan.peek();
        System.out.println("nilai top = "+bacaTop);
        System.out.println("\nNama saya adalah Ihza Maulana Zakiya\n");
        tumpukan.pop();
        tumpukan.show();

        tumpukan.push(40);
        tumpukan.show();
        tumpukan.push(50);
        tumpukan.show();
    }
}
