public class SwitchStatement {
   public static void main(String[] args) {
        int num = 2; // Example number
        // Using switch statement to determine the day of the week
        String day;
        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid number, please enter a number between 1 and 7.";
        }
        // Output the result
        System.out.println("The day of the week is: " + day);
   }  
}
