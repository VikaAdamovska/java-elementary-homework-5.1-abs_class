import java.util.Scanner;

public class StringPrinterDemo {

    public static void main(String[] args) {
        /*абстрактные классы
        1) Создать абстрактный класс AbstractStringPrinter c методом abstrtact void print(String str);
        - создать реализации:
        UpperStringPrinter - печатать все символы upper case (в классе String метод toUpperCase)
        LowerStringPrinter - печатать все символы lower case (в классе String метод toLowerCase)
        Создать класс StringPrinterDemo с методом main:
        - вывести на консоль: "Please enter some string"
        - считать строку с консоли
        - вывести на консоль: "Please enter string printer type (U - upper, L - lower)"
        - считать тип
        - в зависимости от введенного типа воспользоваться конкретной реализацией AbstractStringPrinter*/
        System.out.println("Please, enter some string!");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println("Please enter string printer type (U - upper, L - lower)");
        String type = scanner.nextLine();
        System.out.println(type);

        if (type.equals("U")) {
            UpperStringPrinter upperStringPrinter = new UpperStringPrinter();
            upperStringPrinter.print(text);
        } else if (type.equals("L")) {
            LowerStringPrinter lowerStringPrinter = new LowerStringPrinter();
            lowerStringPrinter.print(text);
        } else {
            System.out.println("Wrong printer type");
        }
    }
}
