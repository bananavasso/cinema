import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegisterStaff extends JInternalFrame {


    private JPanel contentPane;

    private JTextField tfName;
    private JTextField tfPassword;
    private JTextField tfAge;
    private JTextField tfEmail;
    private JTextField tfHome_address;
    private JTextArea tfQualifications;

    private Staff newEmployee;
    private AllStaff employees;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisterStaff frame = new RegisterStaff();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    /**
     * Create the frame.
     */
    public RegisterStaff() {
        setClosable(true);
        setTitle("Register New Employee");
        setBounds(500, 500, 680, 680);


        JLabel lblName = new JLabel("Name");

        tfName = new JTextField();
        tfName.setToolTipText("Enter your full name");
        tfName.setName("");
        tfName.setColumns(20);


        JLabel lblPassword = new JLabel("Password");

        tfPassword = new JTextField();
        tfPassword.setToolTipText("Enter your password");
        tfPassword.setColumns(20);

        JLabel lblAge = new JLabel("Age");

        tfAge = new JTextField();
        tfAge.setColumns(20);

        JLabel lblEmail = new JLabel("Email");

        tfEmail = new JTextField();
        tfEmail.setToolTipText("xxxx@gmail.com");
        tfEmail.setColumns(20);

        JLabel lblHome_address = new JLabel("Home_address");

        tfHome_address = new JTextField();
        tfHome_address.setToolTipText("");
        tfHome_address.setColumns(20);


        JLabel lblQualifications = new JLabel("Qualifications");

        JScrollPane scrollPane = new JScrollPane();

        JButton btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try{

                    newEmployee.setName(tfName.getText());
                    newEmployee.setPassword(tfPassword.getText());
                    newEmployee.setAge(tfAge.getText());
                    newEmployee.setEmail(tfEmail.getText());
                    newEmployee.setAddress(tfHome_address.getText());
                    newEmployee.setQualifications(tfQualifications.getText());

                    employees.add(newEmployee);

                    JOptionPane.showMessageDialog(null, "Registered Successfully");

                    tfName.setText("");
                    tfPassword.setText("");
                    tfAge.setText("");
                    tfEmail.setText("");
                    tfHome_address.setText("");
                    tfQualifications.setText("");

                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null, e1);

                }

            }
        });

        tfQualifications = new JTextArea();
        tfQualifications.setToolTipText("Theme of the movie");
        tfQualifications.setLineWrap(true);
        tfQualifications.setWrapStyleWord(true);
        scrollPane.setViewportView(tfQualifications);

        lblName.setBounds(1,3,4,5);
        add(lblName);
        tfName.setBounds(5,2,3,4);
        add(tfName);

    }
}
