package lab1;

import java.util.Scanner;

class Data {
    private double avg, maxx;
    private int cnt;

    Data() {
        this.avg = 0;
        this.cnt = 0;
        this.maxx = -1e9;
    }

    public void adds(double val) {
        avg += val;
        cnt += 1;
        maxx = Math.max(maxx, val);
    }

    public double avg_data() {
        if (cnt == 0) {
            return 0;
        } else {
            return avg / cnt;
        }
    }

    public double maxx_data() {
        if (cnt == 0) {
            return 0;
        } else {
            return maxx;
        }
    }
}

class Analyzer {
    public static void main(String[] args) {
        Data q = new Data();
        Scanner scan = new Scanner(System.in);

        String ok;

        while (true) {
            System.out.print("Enter number(Q to quit): ");
            ok = scan.next();
            if (ok.equalsIgnoreCase("q")) {
                System.out.println("Average:" + q.avg_data());
                System.out.println("Maximum:" + q.maxx_data());
                break;
            }
            try {
                double okok = Double.parseDouble(ok);
                q.adds(okok);
            } catch (NumberFormatException e) {
                System.out.println("Error!");
            }
        }
        scan.close();
    }
}