
import java.util.Scanner;

public class Assignmnet1{

private static final Scanner SCANNER = new Scanner(System.in); 
    public static void main(String[] args) {



        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = " Welcome to Smart Banking";
        final String CREATE_NEW_ACCOUNT = "create new Account";
        final String DEPOSITS = "Deposits";
        final String WITHDRAWLS = "Withdrawls";
        final String TRANSFER = "Transfer";
        final String CHECK_ACCOUNT_BALANCE = "Check Account Balance";
        final String DELETE_ACCOUNT = "Delete Account";
        
        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] Account = new String[0];
        String[] DepositIds = new String[0];
        String[] WithdrawalIds = new String[0];
        String[] DepositterName = new String [0];
        String[] WithdrawalsNmae = new String [0];

        String screen = DASHBOARD;
  
        final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\t[1]. Add New Customer");
                    System.out.println("\t[2]. Remove Existing Customer");
                    System.out.println("\t[3]. Print Customer Details");
                    System.out.println("\t[4]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                    switch (option){
                        case 1: screen = CREATE_NEW_ACCOUNT; break;
                        case 2: screen = REMOVE_CUSTOMER; break;
                        case 3: screen = PRINT_DETAILS; break;
                        case 4: System.out.println(CLEAR); System.exit(0);
                        default: continue;
                    }
                    break;






    
    
    
    
    }
    
    
    
    
    
    
    
}
        
}






















    
