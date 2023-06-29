import java.io.*;

import static java.util.stream.Collectors.joining;

class result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost*tip_percent/100;
        double tax = tax_percent*meal_cost/100;

        double total_cost = meal_cost+tip+tax;

        System.out.println( Math.round(total_cost));

    }

}

public class day2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
