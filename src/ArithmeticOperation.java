
abstract class BinaryExpression extends ArithmeticExpression {
    protected ArithmeticExpression left;
    protected ArithmeticExpression right;

    public BinaryExpression(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }
}

abstract class ArithmeticExpression {
    public abstract int evaluate();
    public abstract String getStringRepresentation();
}


class NumberExpression extends ArithmeticExpression {
    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String getStringRepresentation() {
        return String.valueOf(value);
    }
}

class SumExpression extends BinaryExpression {
    public SumExpression(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String getStringRepresentation() {
        return left.getStringRepresentation() + " + " + right.getStringRepresentation();
    }
}

class ProductExpression extends BinaryExpression {
    public ProductExpression(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String getStringRepresentation() {
        return left.getStringRepresentation() + " * " + right.getStringRepresentation();
    }
}

class ModuloExpression extends BinaryExpression {
    public ModuloExpression(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() % right.evaluate();
    }

    @Override
    public String getStringRepresentation() {
        return left.getStringRepresentation() + " % " + right.getStringRepresentation();
    }
}

class ArithmeticOperator {
    public static int evaluate(ArithmeticExpression expression) {
        return expression.evaluate();
    }
}
