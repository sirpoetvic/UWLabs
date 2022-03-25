package BudgeterUWLab_Folder;
import java.util.Scanner;
public class BudgeterUWLab {
  
  static Scanner sc = new Scanner(System.in);
  public static int incomeTotal;
  public static double incomeTotalDaily;
  public static int expensesTotal;
  public static double expensesTotalDaily;
  public static final int DAYS_IN_MONTH = 31;
  
  public static void main(String[] args) {
    intro();
    income();
    monthlyExpenses();
    getIncome();
    getExpenses();  
  }
  
  public static void intro() {
    System.out.println("This program asks for your monthly income and expenses, then tells you your net monthly income.");
    System.out.println();
    
  }
  
  public static void income() {
    System.out.println("How many categories of income?");
    int incomeCategories = sc.nextInt();
    
    for(int i = 0; i < incomeCategories; i++) {
      System.out.println("Next income amount? ");
      incomeTotal += sc.nextDouble();
    }

  }

  public static void getIncome() {
    System.out.println("Total Income = $" + incomeTotal);
  }
  
  public static void monthlyExpenses() {
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
      expensesTotalDaily = averages(expensesTotal, expenseCategories);
    }

    //daily
    if(choice == 2) {
      System.out.print("How many categories of expense? ");
      int expenseCategories = sc.nextInt();
      for(int i = 0; i < expenseCategories; i++) {
        System.out.println("Next expense amount?");
        expensesTotal += sc.nextDouble();
      }
      expensesTotalDaily = averages(expensesTotal, expenseCategories);
    }
    
  }

  public static void getExpenses() {
    System.out.println("Total expenses = $" + expensesTotal + "($ " + expensesTotalDaily + ")");
  }
  
  public static double averages(double x, int y) {
    return x / (double) y;
  }
  
}