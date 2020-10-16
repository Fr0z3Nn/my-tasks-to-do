package ru.svivanov.OCT_16_2020;

public class QuadraticEquation {
    private double A;
    private double B;
    private double C;
    private double x1;
    private double x2;
    private double extremumX;
    private boolean minimum;
    private boolean complex = false;


    public QuadraticEquation() {
        A = random(-100, 100);
        B = random(-100, 100);
        C = random(-100, 100);
    }

    public QuadraticEquation(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public void findExtremum() {
        extremumX = -B / (2 * A);
        double y = A * extremumX * extremumX + B * extremumX + C;
        minimum = 2 * A > 0;
        System.out.printf("extremum[x: %.2f;y: %.2f]\n",extremumX,y);
    }

    public void findIntervals() {
        if (minimum) {
            System.out.printf("The function increases by (%.2f,+∞) decreases by (-∞,%.2f)",extremumX,extremumX);
        } else {
            System.out.printf("The function increases by (-∞,%.2f) decreases by ( %.2f,+∞)",extremumX,extremumX);
        }
    }

    public void RootsOfTheEquation() {
        double discriminant = B * B - 4 * A * C;
        if (discriminant < 0) {
            System.out.println("Complex Roots");
            complex = true;
            return;
        }
        x1 = (-B + Math.sqrt(discriminant)) / (2 * A);
        x2 = (-B - Math.sqrt(discriminant)) / (2 * A);
        System.out.printf("x1: %.2f\nx2: %.2f\n", x1, x2);
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public boolean isComplex() {
        return complex;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}

class TestRoots {
    public static void main(String[] args) {
        QuadraticEquation[] equations = new QuadraticEquation[]{new QuadraticEquation(), new QuadraticEquation(), new QuadraticEquation()};
        double maxX = Double.MIN_NORMAL;
        double minX = Double.MAX_VALUE;
        for (QuadraticEquation equation : equations) {
            equation.RootsOfTheEquation();
            if (!equation.isComplex()) {
                if (equation.getX1() > maxX) maxX = equation.getX1();
                if (equation.getX2() > maxX) maxX = equation.getX2();
                if (equation.getX1() < minX) minX = equation.getX1();
                if (equation.getX2() < minX) minX = equation.getX2();
            }
        }
        System.out.printf("Minimum: %.2f Maximum: %.2f\n", minX, maxX);

        System.out.println("Random equation:");
        QuadraticEquation equation = new QuadraticEquation();
        System.out.println(equation.getA() + "*x^2 + " + equation.getB() + "*x + " + equation.getC());
        equation.RootsOfTheEquation();
        if (!equation.isComplex()) {
            equation.findExtremum();
            equation.findIntervals();
        }
    }
}
