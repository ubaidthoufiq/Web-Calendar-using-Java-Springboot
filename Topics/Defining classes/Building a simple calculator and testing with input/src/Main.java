import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // Create a Calculator object and use it to add x and y
        Calculator calculator = new Calculator();
        calculator.setX(x);
        calculator.setY(y);
        System.out.println(calculator.add());
    }
}

// Create your Calculator class below
class Calculator {
    private int x;
    private int y;

    public Calculator () {
        x = 0;
        y = 0;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add() {
        return x + y;
    }
}