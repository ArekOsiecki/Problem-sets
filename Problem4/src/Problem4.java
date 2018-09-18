import javax.swing.*;

public class Problem4 {
    public static void main(String[] args) {
        String numAsString;
        int number, totNum=0, gTotal=0;

        numAsString = JOptionPane.showInputDialog("Please enter a desired number(q to quit)");


        while (!numAsString.equals("q")){
            number = Integer.parseInt(numAsString);
            totNum++;
            gTotal = gTotal + number;

            numAsString = JOptionPane.showInputDialog("Please enter a desired number(q to quit)");
        }

            JOptionPane.showMessageDialog(null,"Grand total for all the numberes entered is "+gTotal+"\nNumber of entries is "+totNum);


    }
}
