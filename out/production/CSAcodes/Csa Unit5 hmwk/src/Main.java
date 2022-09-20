public class Main {
    public static void main(String[] args) {
        bankAccount wealthy = new bankAccount(5000, "Edwin");
        bankAccount poor = new bankAccount("Yannick");
        System.out.println(wealthy.withdraw(7000));
        System.out.println(wealthy.withdraw(1000));
        System.out.println(wealthy.getInfo());
    }
}
