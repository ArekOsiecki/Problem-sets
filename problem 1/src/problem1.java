import javax.swing.*;

public class problem1 {
    public static void main(String[] args) {

        String name, cName, amount;
        int amountInt, price=2;

        name = JOptionPane.showInputDialog("Welcome to canteen, what is your name please?");
        cName = JOptionPane.showInputDialog("Confirm your course name");
        amount = JOptionPane.showInputDialog("How many snacks would you like?");
        amountInt = Integer.parseInt(amount);

        JOptionPane.showMessageDialog(null, name+" from "+cName+" course, would have to pay "+amountInt*price+" Euro for snacks");
    }
}
