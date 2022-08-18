package SQLdatabase;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class ChangePassword extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblEnterNewPassword;
    private JButton btnExit;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ChangePassword(String name) {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setTitle("Password change");
    	setFont(new Font("Arial", Font.PLAIN, 14));
        setBounds(450, 360, 590, 195);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 34));
        textField.setBounds(252, 17, 313, 47);
        contentPane.add(textField);
        textField.setColumns(10);
        
        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnExit.setBackground(SystemColor.menu);
        btnExit.setBounds(313, 88, 170, 59);
        contentPane.add(btnExit);
        btnExit.addActionListener (new ActionListener () {
          	 public void actionPerformed (ActionEvent e) {
          		dispose();
          	 }
          	});

        JButton btnSearch = new JButton("Enter");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pstr = textField.getText();
                try {
                    System.out.println("update password name " + name);
                    System.out.println("update password");

                    Connection con = (Connection) DriverManager.getConnection(
                    		"jdbc:postgresql://localhost/javaSQL", "sekyperezmoya", "123456");

                    PreparedStatement st = (PreparedStatement) con
                        .prepareStatement("Update po_table.log_table set pass=? where name=?");

                    st.setString(1, pstr);
                    st.setString(2, name);
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");

                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }

            }
        });
        btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnSearch.setBackground(new Color(240, 240, 240));
        btnSearch.setBounds(83, 88, 170, 59);
        contentPane.add(btnSearch);

        lblEnterNewPassword = new JLabel("Enter New Password");
        lblEnterNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblEnterNewPassword.setBounds(21, 17, 232, 47);
        contentPane.add(lblEnterNewPassword);
        

    }
}