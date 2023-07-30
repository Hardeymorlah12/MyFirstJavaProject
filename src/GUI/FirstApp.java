package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstApp implements ActionListener {
    public JButton button;
    public JPanel panel;
    public JFrame frame;
    public JTextField textField;
    public JLabel EmailLabel, passwordLabel;


    FirstApp(){
        frame = new JFrame("First App");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(700, 700);
        panel.setBackground(Color.ORANGE);

        textField = new JTextField();
        textField.setSize(180, 30);
        textField.setBounds(250,100,200,30);

        EmailLabel = new JLabel("EMAIL:");
//        EmailLabel.setLocation(10, 50);
        EmailLabel.setSize(600,50);
        EmailLabel.setBounds(175,90,950, 50);
        EmailLabel.setFont(new Font(("serif"), Font.BOLD, 20));

        button = new JButton("LOGIN");
        button.setBounds(250, 300, 250, 25);
        button.setBackground(Color.pink);
        button.setForeground(Color.WHITE);
        button.setFocusable(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Dashboard db = new Dashboard();
            }
        });






        frame.add(button);
        frame.add(EmailLabel);
        frame.add(textField);
        frame.add(panel);
        frame. setVisible(true);
    }
    public static void main (String[] args){
        new FirstApp();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
