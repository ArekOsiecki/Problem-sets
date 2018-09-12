import javax.swing.*;

public class problem2 {
    public static void main(String[] args) {
        String name, initial, distanceS;
        double distance, income;

        name = JOptionPane.showInputDialog("What is the cyclist full name?");
        initial = JOptionPane.showInputDialog("What is cyclist initial?");
        distanceS = JOptionPane.showInputDialog("How many kilometers have the cyclist cycled?");
        distance = Float.parseFloat(distanceS);

        if(distance < 10 ){
            income = (distance*0.07);
        }
        else {
            income = 0.7 + (distance*0.1);
        }

        JOptionPane.showMessageDialog(null,"Cyclist "+name+" "+initial+
                "\nhave traveled "+distance+" km \nand earned "+income+" Euro");
    }
}
