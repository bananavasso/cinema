import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Image;
import java.util.ArrayList;


public class Login {

    private JFrame frmLoginCinema;
    private AllStaff employees;
    private ArrayList<Staff> list = new ArrayList<>();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frmLoginCinema.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private JTextField tfUsername;
    private JPasswordField passwordField;

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmLoginCinema = new JFrame();
        frmLoginCinema.setTitle("Login - Cinema Management System");
        frmLoginCinema.setResizable(false);
        frmLoginCinema.setBounds(150, 150, 560, 390);

        frmLoginCinema.setLocationRelativeTo(null);
        frmLoginCinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUsername = new JLabel("Username");

        JLabel lblPassword = new JLabel("Password");

        tfUsername = new JTextField();
        tfUsername.setColumns(10);

        JLabel lblCinemaManagementSystem = new JLabel("Cinema Management System");
        lblCinemaManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 24));

        passwordField = new JPasswordField();

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{

                 //   int count = 0;

                    String insertedName = tfUsername.getText();
                    String insertedPassword = passwordField.getText();

                   /* list = employees.ReturnsAnArrList();
                    for(int i=0; i<list.size(); i++){
                        if((list.get(i).getName() == insertedName) && (list.get(i).getPassword() == insertedPassword)){
                            count++;
                        }
                    }
                   */
                    int count = 1;
                    if(count == 1){
                        frmLoginCinema.dispose();
                        MainFrame mf = new MainFrame();
                        mf.setVisible(true);
                    }else if(count > 1){
                        JOptionPane.showMessageDialog(null, "Duplicate");
                    }else{
                        JOptionPane.showMessageDialog(null, "Wrong Credientials, Try Again!");
                    }

                }catch(Exception E){
                    JOptionPane.showMessageDialog(null, "ops ....");
                }
            }
        });


        JButton btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                try{
                    frmLoginCinema.dispose();
                    RegisterStaff rs = new RegisterStaff();
                    rs.setVisible(true);

                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        });


        JLabel label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/movie-icon.png")).getImage();
        label.setIcon(new ImageIcon(img));

        JLabel lblForStaff = new JLabel("for Staff!");
        lblForStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
        GroupLayout groupLayout = new GroupLayout(frmLoginCinema.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(52)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addPreferredGap(ComponentPlacement.RELATED, 388, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnLogin))
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                        .addComponent(btnRegister))

                                                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addComponent(lblPassword)
                                                                        .addGap(20)
                                                                        .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addComponent(lblUsername)
                                                                        .addGap(18)
                                                                        .addComponent(tfUsername, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)))))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                        .addComponent(lblCinemaManagementSystem)
                                                        .addComponent(lblForStaff))))
                                .addGap(87))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(45)
                                                .addComponent(lblCinemaManagementSystem)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(lblForStaff)))
                                .addGap(31)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblUsername)
                                        .addComponent(tfUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(16)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblPassword)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(btnLogin)
                                .addGap(18)
                                .addComponent(btnRegister)
                                .addGap(73))
        );
        frmLoginCinema.getContentPane().setLayout(groupLayout);
    }
}
