public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000;
        long expected = 30;
        long actual = service.calculate( 5_000, true );
        System.out.println(expected + " == ? == " + actual);

        amount = 1_000_000;
        expected = 500;
        actual = service.calculate( 5_000, true );
        System.out.println(expected + " == ? == " + actual);
    }
}
