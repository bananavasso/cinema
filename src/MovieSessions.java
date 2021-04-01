import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class MovieSessions extends JInternalFrame {

    private AllMovies movies;
    private JComboBox comboBox;
    private JTable table;
    private DefaultTableModel model;

    public void fillComboBox(){
        try{
            for(int i=0; i<movies.arrayList.size(); i++){
                comboBox.addItem(movies.arrayList.get(i).getDates());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Create the frame.
     */
    public MovieSessions() {
        setClosable(true);
        setTitle("Display Movie Sessions");
        setBounds(100, 100, 693, 471);

        JLabel lblSelectDate = new JLabel("Select Date");

        comboBox = new JComboBox();


        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Title");
        model.addColumn("Time");

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try{

                    String selectedDate = (String) comboBox.getSelectedItem();

                    for(int i=0; i<movies.arrayList.size(); i++){
                        for(int j=0; j<movies.arrayList.get(i).getDates().size(); j++){
                            if(movies.arrayList.get(i).dates.get(j) == selectedDate){
                                model.insertRow(0, new Object[] {movies.arrayList.get(i).getTitle(), movies.arrayList.get(i).getTime()});

                            }
                        }
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblSelectDate)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(btnLoadData))
                                        .addComponent(table, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(13, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblSelectDate)
                                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLoadData))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(table, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        fillComboBox();
    }

}