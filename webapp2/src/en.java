// ID = 1101801088
// Name = Kong Panhabot
// Assignment = 1
import java.util.Scanner;

public class en {
    public static void main(String...s){
        String message, encryptedMessage = "";
        int key;
        char chart;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message: ");
        message = sc.nextLine();

        System.out.println("Enter key: ");
        key = sc.nextInt();

        for(int i = 0; i < message.length(); ++i){
            chart = message.charAt(i);

            if(chart >= 'a' && chart <= 'z'){
                chart = (char)(chart + key);

                if(chart > 'z'){
                    chart = (char)(chart - 'z' + 'a' - 1);
                }

                encryptedMessage += chart;
            }
            else if(chart >= 'A' && chart <= 'Z'){
                chart = (char)(chart + key);

                if(chart > 'Z'){
                    chart = (char)(chart - 'Z' + 'A' - 1);
                }

                encryptedMessage += chart;
            }
            else {
                encryptedMessage += chart;
            }
        }

        System.out.println("Encrypted Message = " + encryptedMessage);
    }
}
