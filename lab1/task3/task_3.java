package lab1.task3;

class Temperature {
    private double val;
    private char sc;

    Temperature() {
        this.val = 0;
        this.sc = 'C';
    }

    Temperature(double val) {
        this.val = val;
        this.sc = 'C';
    }

    Temperature(char sc) {
        this.sc = checker(sc);
        this.val = 0;
    }

    Temperature(double val, char sc) {
        this.val = val;
        this.sc = checker(sc);
    }

    private char checker(char s) {
        s = Character.toUpperCase(s);
        if (s != 'C' && s != 'F') {
            throw new IllegalArgumentException("must be C or F");
        }
        return s;
    }

    public double getCelsius() {
        if (sc == 'C') {
            return val;
        }
        return 5.0 * (val - 32.0) / 9.0;
    }

    public double getFahrenheit() {
        if (sc == 'F') {
            return val;
        }
        return 9.0 * (val / 5.0) + 32.0;
    }

    public char getSc() {
        return sc;
    }

    public void setValue(double val) {
        this.val = val;
    }

    public void setSc(char sc) {
        this.sc = checker(sc);
    }

    public void setTemperature(double val, char sc) {
        this.val = val;
        this.sc = checker(sc);
    }
}

public class task_3 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(32, 'F');

        System.out.println(t4.getCelsius());
        System.out.println(t2.getFahrenheit());
        System.out.println(t3.getSc());
    }
}