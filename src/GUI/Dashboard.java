package GUI;
import java.awt.*;
import javax.swing.*;

public class Dashboard {
    private JFrame frame;
    private JLabel label;


    Dashboard(){
        frame = new JFrame("New DashBoard");
        frame.setLocationRelativeTo(null);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label = new JLabel("WELCOME TO THE NEW DASHBOARD");
        label.setBounds(200, 350, 900, 70);
        label.setFont(new Font("serif", Font.ITALIC, 50));





        frame.add(label);
        frame.setVisible(true);
    }
//    public static void main(String[]args){
////  new Dashboard();
    //}
}


