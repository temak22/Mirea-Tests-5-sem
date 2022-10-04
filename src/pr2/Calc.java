package pr2;

public class Calc {

    public String add(int x, int y) {
        return String.valueOf(x+y);
    }

    public String add(double x, double y) {
        return String.valueOf(x+y);
    }

    public String subtract(int x, int y) {
        return String.valueOf(x-y);
    }

    public String subtract(double x, double y) {
        return String.valueOf(x-y);
    }

    public String divide(int x, int y) {
        if (y == 0)
            return "Делить на ноль нельзя!";
        return String.valueOf((double) x/y);
    }

    public String divide(double x, double y) {
        if (y == 0)
            return "Делить на ноль нельзя!";
        return String.valueOf(x/y);
    }

    public String multiply(int x, int y) {
        return String.valueOf(x*y);
    }

    public String multiply(double x, double y) {
        return String.valueOf(x*y);
    }
}
