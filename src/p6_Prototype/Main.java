package p6_Prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //register
        String[] strarr = {"strong message", "warning box", "slash box"};
        manager.register(strarr[0], upen);
        manager.register(strarr[1], mbox);
        manager.register(strarr[2], sbox);

        //create and use
        Product p1 = manager.create(strarr[0]);
        p1.use("Hello, World");

        Product p2 = manager.create(strarr[1]);
        p2.use("Hello, World");

        Product p3 = manager.create(strarr[2]);
        p3.use("Hello, World");
    }
}
