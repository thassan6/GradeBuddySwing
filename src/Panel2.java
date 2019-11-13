import javax.swing.*;

public class Panel2 extends JPanel {

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


    }

}
