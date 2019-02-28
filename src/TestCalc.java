public class TestCalc {

    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculatorIMPL();
        ExpertCalc expertCalculator = new ExpertCalculatorIMPL();

        Integer[] array = {1, 2, 3};
        System.out.println(basicCalculator.add(1, 2, 3));
        System.out.println(expertCalculator.pow(2, 3));
        System.out.println(expertCalculator.factorial(4));
    }


}
