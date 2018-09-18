import javax.swing.*;

public class Problem3 {
    public static void main(String[] args) {
        String name, incomeAsString;
        double income;
        final double TAX;

        name = JOptionPane.showInputDialog("What is the person's name?");
        incomeAsString = JOptionPane.showInputDialog("What is the gross income?");
        income = Float.parseFloat(incomeAsString);

        if(income < 20000){
            TAX = 0;
        }
        else if(income > 20001 && income < 36000){
            TAX = 0.2;
        }
        else{
            TAX = 0.41;
        }
        JOptionPane.showMessageDialog(null,"Gross income for "+name+"\nis "+income+"\nTax rate ="+TAX+"\nTax amount ="+(income*TAX)+"\nIncome after tax is "+(income-(income*TAX)));
    }
}
