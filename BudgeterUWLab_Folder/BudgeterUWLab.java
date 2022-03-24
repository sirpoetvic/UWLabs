import java.util.Scanner;
public class BudgeterUWLab {
  
  Scanner sc = new Scanner(System.in);
  public static int incomeTotal;
  public static int incomeTotalDaily;
  public static int expensesTotal;
  public static int expensesTotalDaily;
  public static final int DAYS_IN_MONTH = 31;
  
  public static void main(String[] args) {
    intro();
    income();

    
  
  }
  
  public static void intro() {
    System.out.println("This program asks for your monthly income and expenses, then tells you your net monthly income.");
    
  }
  
  public static void income() {
    System.out.println("How many categories of income?");
    int incomeCategories = sc.nextInt();
    
    for(int i = 0; i < incomeCategories; i++) {
    incomeTotal += nextDouble();
    }

  }

  public static String getIncome() {
    return "Total Income = $" + incomeTotal;
  }
  
  public static void monthlyExpenses() {
    System.out.println("Enter 1) monthly or 2) daily expenses? ");
    
    
    
    
  }

  public static String getMontlyExpenses() {
    return "Total expenses = $" + expensesTotal + "($ "+ ")";
  }
  
  public static double dailyExpenses() {
    
    
  }
  
  public static double averages() {
    
    
  }
  
  public static double netIncome() {
    
    
  } 
  

}