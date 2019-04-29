import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Payroll
{
    public static void main(String[]arg)
    {
        String username =
            JOptionPane.showInputDialog("Username:");
        String password =
            JOptionPane.showInputDialog("Password:");
      for(;;){
        if (
            username != null &&
            password != null &&
            (
                (username.equals("king") &&
                 password.equals("king123")) ||
                (username.equals("queen") &&
                 password.equals("queen123"))
            )
           )
        {
            JOptionPane.showMessageDialog
                (null, "You're in, Welcome back.");
        } else
            JOptionPane.showMessageDialog
                (null, "You're suspicious, Who is this?");
        break;
}


        int Hours = 20;
        double grosspay, payrate = 50.0;
        String userInput;

        userInput = JOptionPane.showInputDialog("Enter Amount of hours you work in a week.");

        userInput = JOptionPane.showInputDialog("Enter the how much Money you make an hour.");
         payrate = Double.parseDouble(userInput);


        grosspay = Hours * payrate;

        System.out.println(grosspay);
}}
