
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

        String[] DepositIds = new String[0];
        String[] WithdrawalIds = new String[0];
        String[] DepositterName = new String [0];
        String[] WithdrawalsNmae = new String [0];

        String screen = DASHBOARD;

        mainLoop:
        do{
            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);
            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");
            switch(screen){
                case DASHBOARD: 
                    System.out.println("\t[1]. Create new Account");
                    System.out.println("\t[2]. Deposits");
                    System.out.println("\t[3]. Withdrawls");
                    System.out.println("\t[4]. Transfer");
                    System.out.println("\t[3]. Check Account Balance");
                    System.out.println("\t[3]. Delete Account");
                    System.out.println("\t[4]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();
                    switch (option){
                        case 1: screen = CREATE_NEW_ACCOUNT; break;
                        case 2: screen = DEPOSITS; break;
                        case 3: screen = WITHDRAWLS; break;
                        case 4: screen = TRANSFER;break;   
                        case 5: screen = CHECK_ACCOUNT_BALANCE;break;
                        case 6: screen =  DELETE_ACCOUNT;break;  
                        case 7: System.out.println(CLEAR); System.exit(0);
                        default: continue;
                    }
                    break;
                case ADD_CUSTOMER:
                    String id;
                    String name;
                    boolean valid;
                    // ID Validation
                    do {
                        valid = true;
                        System.out.print("\tEnter New Customer ID: ");  // C-ac
                        id = SCANNER.nextLine().toUpperCase().strip();
                        if (id.isBlank()){
                            System.out.printf(ERROR_MSG, "ID can't be empty");
                            valid = false;
                        }else if (!id.startsWith("C-") || id.length() < 3){
                            System.out.printf(ERROR_MSG, "Invalid ID format");
                            valid = false;
                        }else{
                            String number = id.substring(2);
                            for (int i = 0; i < number.length(); i++) {
                                if (!Character.isDigit(number.charAt(i))){
                                    System.out.printf(ERROR_MSG, "Invalid ID format");
                                    valid = false;
                                    break;
                                }
                            }
                            for (int i = 0; i < customerIds.length; i++) {
                                if (customerIds[i].equals(id)){
                                    System.out.printf(ERROR_MSG, "Customer ID already exists");
                                    valid = false;
                                    break;
                                }
                            }    
                        }
                    }while (!valid);
        























    }
}