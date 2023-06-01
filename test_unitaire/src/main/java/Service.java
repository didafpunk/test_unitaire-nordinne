public class Service {

    private Calculator calculator;

    public Service() {
        this.calculator = new Calculator();
    }

    public int calculate(String operation, int a, int b) {
        switch (operation) {
            case "add":
                return calculator.add(a, b);
            case "subtract":
                return calculator.subtract(a, b);
            default:
                return 0;
        }
    }
}
