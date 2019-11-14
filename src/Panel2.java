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
        next.addActionListener(this);

        add(next);
        add(type);
        add(quantity);
        add(weight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        course.grades = new double[course.numAssignmentTypes][];

        // iterate through numAssignmentTypes sets courseNames, Weights, Grades array of course object.
        for(int i = 0; i < course.numAssignmentTypes; i++){
                course.courseNames[i] = assignmentNames[i].getText();
                course.weights[i] = Integer.parseInt(assignmentWeights[i].getText());
                course.grades[i] = new double[Integer.parseInt(assignmentQuantities[i].getText())];
        }


        // DEBUG
//        JOptionPane.showMessageDialog(null, "DEBUG: Panel2 Next Click");
        JOptionPane.showMessageDialog(null, "DEBUG: course.numAssignmentTypes\n"+course.numAssignmentTypes);
        JOptionPane.showMessageDialog(null, "DEBUG: course.courseName\n"+course.courseName);
        JOptionPane.showMessageDialog(null, "DEBUG: course.goalGrade\n"+course.goalGrade);
        JOptionPane.showMessageDialog(null, "DEBUG: course.professor\n"+course.professor);
        JOptionPane.showMessageDialog(null, "DEBUG: course.yourName\n"+course.yourName);


    }
}
