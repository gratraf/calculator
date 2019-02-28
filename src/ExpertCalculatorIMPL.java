public class ExpertCalculatorIMPL extends BasicCalculatorIMPL implements ExpertCalc {


    @Override
    public Long pow(Integer x, Integer n) {
        Long result = 1L;
        for (int i = 0; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    @Override
    public Double root(Integer x, Integer n) {
        return null;
    }

    @Override
    public Long factorial(Integer n) {
        Long result1 = 1L;
        for (int i = 1; i <= n; i++) {
            result1 *= i;
        }
        return result1;
    }
}
