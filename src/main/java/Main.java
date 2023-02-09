public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 10_000;
    boolean registered = true;

    System.out.println(service.calculate(amount,registered));
  }
}

