package Chapter7;

import javax.swing.*;
import java.util.Scanner;

/*7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company
        pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
        their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week
        receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
        that determines how many of the salespeople earned salaries in each of the following ranges (assume
        that each salesperson’s salary is truncated to an integer amount):
        a) $200–299
        b) $300–399
        c) $400–499
        d) $500–599
        e) $600–699
        f) $700–799
        g) $800–899
        h) $900–999
        i) $1,000 and over
        Summarize the results in tabular format.*/
public class SalesCommission {

    double basePay = 200.0;
    private int range;

    public double grossSales() {
        return Double.parseDouble(JOptionPane.showInputDialog("Enter Gross Sale for the week"));
    }

    public double calcSalesCommission() {
        return 0.09 * grossSales() + basePay;
    }

    public void findRange() {
      this.range = (int) (calcSalesCommission() / 100);
    }


    public int range() {
        return range;
    }



    public void ranges() {
        int[] ranges = new int[9];
        for ( int range : ranges )
            ranges[range] = 0; 
        do{
            findRange();
            if ( range > 10 )
                range = 10;
            ++ranges[range - 2];
        }
        while (range >= 0) ;

        System.out.println("Range\t\tNumber");
        for ( int range = 0 ; range < ranges.length - 1 ; range++ )
            System.out.printf("$%d-$%d\t%d\n", (200 + 100 * range), (299 + 100 * range), ranges[range]);
        System.out.printf("$1000 and over\t%d\n", ranges[ranges.length - 1]);
    }


    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.ranges();
    }

}
