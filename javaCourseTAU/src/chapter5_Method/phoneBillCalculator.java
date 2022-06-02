package chapter5_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class phoneBillCalculator {
    /*
     * PHONE BILL CALCULATOR:
     * - Calculate someone's final total phone bill.
     * - Allow the operator to put the plan fee and the number of overage minutes.
     * - Charge the user:
     * --> 0.25 for every minute they were over their plan.
     * --> 15% tax on the sub-total.
     * - Create sepaarte methods to calculate the tax, overage fees, and final
     * total.
     * - Print the itemized bill.
     */
    static Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        double plan = getPlan();
        double overage = getOverage();
        double tax = getTax(overage);
        double total = getTotal(plan, overage, tax);
        System.out.println("----------------------------------------");
        System.out.println("Plan              : " + "$" + df.format(plan));
        System.out.println("Overage Minutes   : " + "$" + df.format(overage));
        System.out.println("Tax Charges (15%) : " + "$" + df.format(tax));
        System.out.println("Total fees        : " + "$" + df.format(total));
        System.out.println("----------------------------------------");
    }

    public static double getPlan() {
        System.out.println("Enter the plan fee: ");
        double fee = scanner.nextDouble();
        return fee;
    }

    public static double getOverage() {
        System.out.println("Enter the number of overage minutes: ");
        double mins = scanner.nextDouble();
        double costPerMins = mins * 0.25;
        return costPerMins;
    }

    public static double getTax(double overage) {
        double tax = (overage / 100) * 15;
        return tax;
    }

    public static double getTotal(double plan, double overageMins, double tax) {
        double total = plan + overageMins + tax;
        return total;
    }
}
