public class Calculator {

    public static final char ADD = '+';
    public static final char SUBTRACT = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVIDE = '/';

    public static int calculate(int numberFirst, int numberSecond, char choice) {
        switch (choice) {
            case ADD:
                return numberFirst + numberSecond;
            case SUBTRACT:
                return numberFirst - numberSecond;
            case MULTIPLICATION:
                return numberFirst * numberSecond;
            case DIVIDE:
                if (numberFirst != 0)
                    return numberFirst / numberSecond;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}