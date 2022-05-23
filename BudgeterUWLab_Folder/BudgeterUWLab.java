//Victor Wong 
//April 4th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #4
//
//This program is intended to help with budgeting
//and takes in income and expenses
//in order to produce a response based on the inputs
package BudgeterUWLab_Folder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgeterUWLab {

  public static double incomeTotal;
  public static double incomeTotalDaily;
  public static double expensesTotal;
  public static double expensesTotalDaily;
  public static double netIncome;
  public static final int DAYS_IN_MONTH = 31;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.##");
    intro();
    income(sc);
    monthlyExpenses(sc);
    getIncome(sc, fmt);
    getExpenses(sc, fmt);
    performNetIncome(sc, fmt);
  }

  // Prints the intro message
  public static void intro() {
    System.out
        .println("This program asks for your monthly income and expenses, then tells you your net monthly income.");
    System.out.println();
  }

  // Income information intake, generates the average income for a day
  // Parameter sc: allows this method to intake information from the terminal
  public static void income(Scanner sc) {
    System.out.print("How many categories of income? ");
    int incomeCategories = sc.nextInt();

    for (int i = 0; i < incomeCategories; i++) {
      System.out.print("Next income amount? $");
      incomeTotal += sc.nextDouble();
    }
    System.out.println();
    incomeTotalDaily = averages(incomeTotal, DAYS_IN_MONTH);
  }

  // Prints income in a formatted string
  // Parameter sc: allows this method to intake information from the terminal
  // Parameter fmt: allows this method to format the decimals in such fashion of
  // 0.##.
  public static void getIncome(Scanner sc, DecimalFormat fmt) {
    System.out.println("Total income = $" + fmt.format(incomeTotal) + " ($" + fmt.format(incomeTotalDaily) + "/day)");
  }

  // Expenses information intake, generates the average expenses for a day
  public static void monthlyExpenses(Scanner sc) {
    System.out.print("Enter 1) monthly or 2) daily expenses? ");
    int choice = sc.nextInt();
    System.out.println();

    // monthly
    if (choice == 1) {
      System.out.print("How many categories of expense? ");
      int expenseCategories = sc.nextInt();
      for (int i = 0; i < expenseCategories; i++) {
        System.out.print("Next expense amount? $");
        expensesTotal += sc.nextDouble();
      }
      System.out.println();
      expensesTotalDaily = averages(expensesTotal, DAYS_IN_MONTH);
    }

    // daily
    if (choice == 2) {
      System.out.print("How many categories of expense? ");
      int expenseCategories = sc.nextInt();
      for (int i = 0; i < expenseCategories; i++) {
        System.out.print("Next expense amount? $");
        expensesTotalDaily += sc.nextDouble();
      }
      System.out.println();
      expensesTotal = expensesTotalDaily * DAYS_IN_MONTH;
    }
  }

  // Prints expenses in a formatted string
  // Parameter sc: allows this method to intake information from the terminal
  // Parameter fmt: allows this method to format the decimals in such fashion of
  // 0.##.
  public static void getExpenses(Scanner sc, DecimalFormat fmt) {
    System.out
        .println("Total expenses = $" + fmt.format(expensesTotal) + " ($" + fmt.format(expensesTotalDaily) + "/day)");
  }

  // Returns averages of x and y
  public static double averages(double x, int y) {
    return x / (double) y;
  }

  // Produces a message based on income and expenses, and how they balance out
  // Parameter sc: allows this method to intake information from the terminal
  // Parameter fmt: allows this method to format the decimals in such fashion of
  // 0.##.
  public static void performNetIncome(Scanner sc, DecimalFormat fmt) {
    netIncome = incomeTotal - expensesTotal;
    // Saver Response Category
    if (netIncome > 0) {
      System.out.println();
      System.out.println("You've saved $" + fmt.format(netIncome) + " more than you spent this month.");
      if (netIncome > 250) {
        System.out.println("You're a big saver.");
        System.out.println("Saving up for a vacation, are you?");
      } else if (netIncome <= 250) {
        System.out.println("You're a saver.");
        System.out.println("Good job!");
      }
    }

    // Spender Response Category
    if (netIncome <= 0) {
      System.out.println();
      System.out.println("You've spent $" + fmt.format(netIncome * -1) + " more than you earned this month.");
      if (netIncome > -250) {
        System.out.println("You're a spender.");
        System.out.print("Have you tried saving?");
      } else if (netIncome <= -250) {
        System.out.println("You're a big spender.");
        System.out.println("You should definitely make a better budget.");
      }
    }
  }
}