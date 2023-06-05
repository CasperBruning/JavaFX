import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Bankrekening rekening = new Bankrekening();

        System.out.print("Vul bedrag in: ");
        double bedrag = scanner.nextDouble();
        rekening.stort(bedrag);

        System.out.println("Gestort bedrag: " + bedrag + "\n" +
                            "Huidig bedrag: " + rekening.getSaldo());

        System.out.print("Vul bedrag in: ");
        bedrag = scanner.nextDouble();

        rekening.neemOp(bedrag);
        System.out.println("Opgenomen bedrag:" + bedrag + "\n" +
                            "Hudig bedrag: " + rekening.getSaldo());
    }
}
