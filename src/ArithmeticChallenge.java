package src;

/**
 * @author Hejociara do Vale
 *  */

public class ArithmeticChallenge {
    public static void main(String[] args) {
        double numeratorA  = Math.pow (6 * (3+2) ,2);
        double denominatorA = 3 *2;

        double numeratorB = (1-5)*(2-7);
        double denominatorB = 2;

        double superiorExpressionA = numeratorA / denominatorA;
        double superiorExpressionB = Math.pow(numeratorB / denominatorB, 2);

        double superiorExpression = Math.pow(superiorExpressionA - superiorExpressionB, 3 );
        double inferiorExpression = Math.pow(10,3);

        double result = superiorExpression / inferiorExpression;
        System.out.println("The result is: " + result);

    }
}
