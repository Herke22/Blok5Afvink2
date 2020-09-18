import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class afvink22 extends JFrame implements ActionListener{

    private JTextField t1, t2;
    private JLabel l1, l2;
    private JButton b;
    private JPanel p;

    public static void main(String[] args){
        afvink22 frame = new afvink22();
        frame.setSize(700,700);
        frame.setTitle("H2O Herke");
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container f = getContentPane();
        f.setLayout(new FlowLayout());

        f.setBackground(Color.white);

        //panel aanmaken en plaatsen
        p = new JPanel();
        p.setPreferredSize(new Dimension(700,600));
        f.add(p);

        //labels toevoegen
        l1 = new JLabel("x cords");
        l2 = new JLabel("y cords");


        //textboxes toevoegen
        t1 = new JTextField("0");
        t2 = new JTextField("0");
        t1.setPreferredSize(new Dimension(50, 20));
        t2.setPreferredSize(new Dimension(50, 20));

        //button toevoegen
        b = new JButton("tekenen maar!");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        //reactie op button klik
        b.addActionListener(this);

    }

    @Override
    // wanneer de knop word ingedrukt gebeurd dit allemaal
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int bol1 = 20;
        int bol2 = 30;
        Graphics draw = p.getGraphics();
        draw.clearRect(0,0,700,700);
        draw.drawLine(x+bol2/2, y+bol2/2, x+60+bol1/2, y+40+bol1/2);
        draw.drawLine(x+bol2/2, y+bol2/2, x-20+bol1/2, y-40+bol1/2);
        draw.setColor(Color.red);
        draw.fillOval(x, y, bol2, bol2);
        draw.setColor(Color.blue);
        draw.fillOval(x+60, y+40, bol1, bol1);
        draw.fillOval(x-20, y-40, bol1, bol1);
        draw.setColor(Color.cyan);



    }
}

