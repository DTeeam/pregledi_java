import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Check_up_panel {

    private JComboBox worker_combo;
    private JButton add_to_checkup;
    private JScrollPane checkup_textfield;
    private JPanel panel;
    private static int id_p;

    public Check_up_panel() {
        String[] workers = dbconnect.returnworkers(id_p);
        System.out.println( "IDP = " + id_p );

        System.out.println( "NAME = " + workers[0] );

        for (String name: workers) {
            worker_combo.addItem(name);
        }

        worker_combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add_to_checkup.enable();
            }
        });

        add_to_checkup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(int idp) {
        id_p = idp;
        JFrame frame = new JFrame("Checkup neki al neki");
        frame.setContentPane(new Check_up_panel().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,600);
        frame.setVisible(true);
    }
}
