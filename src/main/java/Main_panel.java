import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_panel {
    private JButton button1;
    private JPanel panel1;
    private JLabel label1;


    public Main_panel() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a =  dbconnect.vrniime(1);

                label1.setText(a);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkup neki al neki");
        frame.setContentPane(new Main_panel().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,600);
        frame.setVisible(true);
    }
}
