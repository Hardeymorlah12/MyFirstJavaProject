package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SampleClass implements ActionListener {
    public JLabel label1, RedLabel, BlueLabel, BlackLabel;
    public JLabel label2;
    public JFrame frame;
    public JPanel panel;
    public JButton RedBtn, BlueBtn, BlackBtn, ClearButton;


    SampleClass(){
        frame = new JFrame("Sample");
        frame.setLayout(null);
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(700, 700);
        panel.setBackground(Color.GREEN);
       // panel.add(label1);

        label1 = new JLabel("This is a Paragraph...");
        label1.setBounds(50, 80, 300, 50);
        label1.setFont(new Font("serif", Font.BOLD, 30));

        RedLabel = new JLabel(" ");
        RedLabel.setBounds(50, 450, 400, 100);
        RedLabel.setFont(new Font("serif", Font.BOLD, 15));

        label2 = new JLabel("This is my second Paragraph");
        label2.setBounds(50, 150, 270, 50);
        label2.setFont(new Font("Helvetica", Font.ITALIC, 20));

//        ClearButton clear = new JButton("Clear");
//        ClearButton.setBounds(250,350, 100,50);
//        ClearButton.setFocusable(false);
//        ClearButton.setFont(new Font("seriff", Font.BOLD, 12));

        RedBtn = new JButton("Red Button");
        RedBtn.setBounds(40, 250, 150, 40);
        RedBtn.setFont(new Font("serif", Font.BOLD, 13));
        RedBtn.setForeground(Color.RED);
        RedBtn.setBackground(Color.WHITE);
        RedBtn.setFocusable(false);
        RedBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RedBtn.setText("Red Button Clicked");
            }
        });

        BlueBtn = new JButton("Blue Button");
        BlueBtn.setBounds(280, 250, 150, 40);
        BlueBtn.setFont(new Font("serif", Font.BOLD, 13));
        BlueBtn.setForeground(Color.BLUE);
        BlueBtn.setBackground(Color.WHITE);
        BlueBtn.setFocusable(false);
        BlueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BlueBtn.setText("Blue Button Clicked");
            }
        });

        BlackBtn = new JButton("Black Button");
        BlackBtn.setBounds(500, 250, 170, 40);
        BlackBtn.setFont(new Font("serif", Font.BOLD, 13));
        BlackBtn.setForeground(Color.BLACK);
        BlackBtn.setBackground(Color.WHITE);
        BlackBtn.setFocusable(false);
        BlackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BlackBtn.setText("Black Button Clicked");
            }
        });








        frame.add(RedLabel);
        frame.add(BlackBtn);
        frame.add(BlueBtn);
        frame.add(RedBtn);
        frame.add(label2);
        frame.add(label1);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new SampleClass();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
