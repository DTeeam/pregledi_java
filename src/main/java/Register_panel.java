import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.EventQueue;

public class Register_panel {
    private JTextField name_text;
    private JTextField email_text;
    private JPasswordField password_text;
    private JPasswordField confPassword_text;
    private JButton registerButton;
    private JPanel registerPanel;
    private JButton uploadLogoButton;

    public Register_panel() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = name_text.getText();
                String email = email_text.getText();
                String pass = password_text.getText();
                String confPass = confPassword_text.getText();



            }
        });
        uploadLogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc;

                fc = new JFileChooser();
                fc.showOpenDialog(fc);
                System.out.println(fc);

                fc.toString();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new Register_panel().registerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,600);
        frame.setVisible(true);
    }


}
