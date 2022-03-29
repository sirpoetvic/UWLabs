package BudgeterUWLab_Folder;
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
    intro();
    income(sc);
    monthlyExpenses(sc);
    getIncome(sc);
    getExpenses(sc);
    performNetIncome(sc);
  }
  
  public static void intro() {
    System.out.println("This program asks for your monthly income and expenses, then tells you your net monthly income.");
    System.out.println();
  }
  
  public static void income(Scanner sc) {
    System.out.println("How many categories of income?");
    int incomeCategories = sc.nextInt();
    
    for(int i = 0; i < incomeCategories; i++) {
      System.out.println("Next income amount? ");
      incomeTotal += sc.nextDouble();
    }
    incomeTotalDaily = averages(incomeTotal, DAYS_IN_MONTH);
  }

  public static void getIncome(Scanner sc) {
    System.out.println("Total income = $" + incomeTotal + " ($" + incomeTotalDaily + "/day)");
  }
  
  public static void monthlyExpenses(Scanner sc) {
    System.out.println("Enter 1) monthly or 2) daily expenses? ");
    int choice  = sc.nextInt();
    //monthly
    if(choice == 1) {
      System.out.print("How many categories of expense? ");
      int expenseCategories = sc.nextInt();
      for(int i = 0; i < expenseCategories; i++) {
        System.out.println("Next expense amount? ");
        expensesTotal += sc.nextDouble();
      }
      expensesTotalDaily = averages(expensesTotal, DAYS_IN_MONTH);
    }

    //daily
    if(choice == 2) {
      System.out.print("How many categories of expense? ");
      int expenseCategories = sc.nextInt();
      for(int i = 0; i < expenseCategories; i++) {
        System.out.println("Next expense amount?");
        expensesTotalDaily += sc.nextDouble();
      }
      expensesTotal = expensesTotalDaily * DAYS_IN_MONTH;
    }
  }

  public static void getExpenses(Scanner sc) {
    System.out.println("Total expenses = $" + expensesTotal + " ($" + expensesTotalDaily + "/day)");
  }
  
  public static double averages(double x, int y) {
    return x / (double) y;
  }

  public static void performNetIncome(Scanner sc) {
    netIncome = incomeTotal - expensesTotal;
    //Saver Response Category
    if(netIncome >=0) {
      System.out.println("You've saved $" + netIncome + " more than you spent this month.");
      if(netIncome > 250) {
        System.out.println("You're a big saver.");
      }
      else if(netIncome < 250) {
        System.out.println("You're a saver.");
      }
    }
    //Spender Response Category
    if(netIncome < 0) {
      System.out.println("You've spent $" + (netIncome * -1) + " more than you earned this month.");
      if(netIncome > -250) {
        System.out.println("You're a spender.");
      }
      else if(netIncome < -250) {
        System.out.println("You're a big spender.");
      }
    }
  }
}