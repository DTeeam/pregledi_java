import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_panel {
    private JButton button1;
    private JPanel panel1;
    private JLabel label1;
    private JTextField email_text;
    private JTextField password_text;


    public Login_panel() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mail = email_text.getText();
                String pass = password_text.getText();

                int idp = dbconnect.getCompanyId(mail, pass);

                if(idp == 0)
                    JOptionPane.showMessageDialog(null, "Login failed");
                else
                    JOptionPane.showMessageDialog(null, "Login successful");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login_panel().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,600);
        frame.setVisible(true);
    }
}
