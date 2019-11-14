import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel3 extends JPanel implements ActionListener {

    JTextField grades[][];
    JButton next;

    public Panel3(){
        setLayout(null);
        setBounds(0, 0, 600, 800);

        next = new JButton("Next");
        next.addActionListener(this);

        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
