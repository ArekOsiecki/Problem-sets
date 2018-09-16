import javax.swing.*;

public class Problem6 {
    public static void main(String[] args) {

        String num1AsString, num2AsString, calculation;
        int input;
        double num1, num2;

            JOptionPane.showMessageDialog(null, "Welcome to calculator, to choose a calculation type corresponding letter(A,S,M,D)");

            input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Select an option", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        while(input == JOptionPane.YES_OPTION){
            num1AsString = JOptionPane.showInputDialog("Please enter first number");
            num1 = Double.parseDouble(num1AsString);
            calculation = JOptionPane.showInputDialog("What calculation you wish to conduct?");
            num2AsString = JOptionPane.showInputDialog("Please enter second number");
            num2 = Double.parseDouble(num2AsString);



            switch (calculation) {
                case "A":
                    JOptionPane.showMessageDialog(null, "Result of addition is :" + (num1 + num2));
                    break;
                case "S":
                    JOptionPane.showMessageDialog(null, "Result of subtraction is :" + (num1 - num2));
                    break;
                case "M":
                    JOptionPane.showMessageDialog(null, "Result of multiplication is :" + (num1 * num2));
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, "Result of division is :" + (num1 / num2));
                    break;
            }
            input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Select an option", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        }
            JOptionPane.showMessageDialog(null,"Thank you for using the calculator");
        }
    }

