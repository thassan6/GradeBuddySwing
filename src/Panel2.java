import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel implements ActionListener {

    Course course;
    JLabel type, quantity, weight;
    JTextField assignmentNames[];
    JTextField assignmentQuantities[];
    JTextField assignmentWeights[];
    JButton next;


    public Panel2(){
        course = new Course();
        setLayout(null);
        setBounds(0, 0, 600, 800);

        type = new JLabel("Type");
        type.setBounds(50, 20, 100, 35);
        quantity = new JLabel("Quantity");
        quantity.setBounds(300, 20, 100, 35);
        weight = new JLabel("Weight");
        weight.setBounds(500, 20, 100, 35);

        next = new JButton("Next");
        //next.addActionListener(this);

        add(type);
        add(quantity);
        add(weight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "DEBUG: Click");
        setVisible(false);
    }
}
