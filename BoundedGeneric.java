class Calculator<T extends Number> {
    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedGeneric {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(intCalc.square(4));
        System.out.println(doubleCalc.square(2.5));
    }
}
