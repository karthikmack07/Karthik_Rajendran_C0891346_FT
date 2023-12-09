public class Main {
    public static void main(String[] args) {
        ArithmeticExpression expression = new SumExpression(
                        new NumberExpression(3),
                        new ProductExpression(
                                new NumberExpression(2),
                                new NumberExpression(5)
                        )
        );

        System.out.println(expression.getStringRepresentation());
        System.out.println(ArithmeticOperator.evaluate(expression));

        expression = new ModuloExpression(new NumberExpression(15), new NumberExpression(7));

        System.out.println(expression.getStringRepresentation());
        System.out.println(ArithmeticOperator.evaluate(expression));
    }
}
