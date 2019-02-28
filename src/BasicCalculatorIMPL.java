public class BasicCalculatorIMPL implements BasicCalculator {


    @Override
    public Long add(Integer... array) {
        Long sum = 0L;
        for(Integer number: array){
            sum = sum + number;
        }

        return sum;
    }

    @Override
    public Long add(Long a, Long b) {

        return a+b;
    }

    @Override
    public Double add(Double a, Double b) {
        return a+b;
    }

    @Override
    public Long multiply(Integer a, Integer b) {
        return Long.valueOf(a*b);
    }




}
