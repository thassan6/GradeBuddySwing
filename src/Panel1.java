import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel implements ActionListener {

    JTextField name, professorName, courseName, numAssignmentTypes, goalGrade;
    JButton next;
    Course course;

    public Panel1(){
        course = new Course();

        setLayout(null);
        setBounds(0, 0, 600, 800);

        // initialize components
        name = new JTextField("Name");
        name.setBounds(350, 150, 75, 30);
        professorName = new JTextField("Professor");
        professorName.setBounds(350, 190, 75, 30);
        courseName = new JTextField("Course Name");
        courseName.setBounds(350, 230, 75, 30);
        numAssignmentTypes = new JTextField("3");
        numAssignmentTypes.setBounds(350, 270, 75, 30);
        goalGrade = new JTextField("4.0");
        goalGrade.setBounds(350, 310, 75, 30);

        next = new JButton("Next");
        next.setBounds(350, 360, 75, 30);
        next.addActionListener(this);

        // add all components to panel
        add(name);
        add(professorName);
        add(courseName);
        add(numAssignmentTypes);
        add(goalGrade);
        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // save number of assignments for ease of use.
        int numAss = Integer.parseInt(numAssignmentTypes.getText());

        // save all course info in course object
        // initialize Course weights[] and courseNames[]
        course.numAssignmentTypes = numAss;
        course.courseName = courseName.getText();
        course.goalGrade = Double.parseDouble(goalGrade.getText());
        course.professor = professorName.getText();
        course.yourName = name.getText();
        Course.initializeWeightsArray(numAss);
        course.initializeCourseNames(numAss);

        Login frame = (Login) SwingUtilities.getWindowAncestor(this);

        // initialize all the arrays in panel2 and next button
        frame.panel2.assignmentNames = new JTextField[numAss];
        frame.panel2.assignmentQuantities = new JTextField[numAss];
        frame.panel2.assignmentWeights = new JTextField[numAss];


        // dynamically create all the TextFields for Panel2
        int ypos = 75;
        for(int i = 0; i < numAss; i++){
            JTextField temp1 = new JTextField();
            JTextField temp2 = new JTextField();
            JTextField temp3 = new JTextField();

            temp1.setBounds(50, ypos, 50, 30);
            temp2.setBounds(300, ypos, 50, 30);
            temp3.setBounds(500, ypos, 50, 30);

            frame.panel2.assignmentNames[i] = temp1;
            frame.panel2.assignmentQuantities[i] = temp2;
            frame.panel2.assignmentWeights[i] = temp3;

            frame.panel2.add(temp1);
            frame.panel2.add(temp2);
            frame.panel2.add(temp3);

            frame.panel2.revalidate();
            frame.panel2.repaint();

            ypos+=50;

            setVisible(false);
            frame.panel2.setVisible(true);
        }

        // set bounds of next button under everything
        frame.panel2.next.setBounds(350, ypos, 75, 30);
        frame.panel2.revalidate();

        //DEBUG
        JOptionPane.showMessageDialog(null, "DEBUG: course.numAssignmentTypes\n"+course.numAssignmentTypes);
        JOptionPane.showMessageDialog(null, "DEBUG: course.courseName\n"+course.courseName);
        JOptionPane.showMessageDialog(null, "DEBUG: course.goalGrade\n"+course.goalGrade);
        JOptionPane.showMessageDialog(null, "DEBUG: course.professor\n"+course.professor);
        JOptionPane.showMessageDialog(null, "DEBUG: course.yourName\n"+course.yourName);
    }
}
