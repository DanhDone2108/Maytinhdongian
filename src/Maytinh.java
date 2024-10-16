
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maytinh extends JFrame implements ActionListener {
    private JButton buttonadd;
    private JButton buttonminus;
    private JButton buttondivision;
    private JButton Buttonmultiplication;

    private JTextField number1;
    private JTextField number2;
    private JTextField result;

    private Container cont;
    private JPanel panel1 ;
    private JPanel panel2 ;

    public Maytinh(String s)
    {
        super(s);

        cont = this.getContentPane();

        JLabel lbnum1 = new JLabel("Number 1: ");
        number1 = new JTextField();
        JLabel lbnum2 = new JLabel("Number 2: ");
        number2 = new JTextField();
        JLabel lbresult = new JLabel("Result: ");
        result = new JTextField();

        result.setEditable(false);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));

        panel1.add(lbnum1);
        panel1.add(number1);
        panel1.add(lbnum2);
        panel1.add(number2);

        panel1.add(lbresult);
        panel1.add(result);
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        buttonadd = new JButton("+");
        buttonminus = new JButton("-");
        buttondivision = new JButton("*");
        Buttonmultiplication = new JButton("/");

        panel2.add(buttonadd);
        panel2.add(buttonminus);
        panel2.add(buttondivision);
        panel2.add(Buttonmultiplication);

        cont.add(panel1);
        cont.add(panel2,"South");

        buttonadd.addActionListener(this);
        buttonminus.addActionListener(this);
        buttondivision.addActionListener(this);
        Buttonmultiplication.addActionListener(this);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Add()
    {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());

        double Result = num1 + num2;

        result.setText(Double.toString(Result));
    }

    public void minus()
    {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());

        double Result = num1 - num2;

        result.setText(Double.toString(Result));
    }

    public void division()
    {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());

        double Result = num1 * num2;

        result.setText(Double.toString(Result));
    }

    public void multiplication()
    {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());

        double Result = num1 / num2;

        result.setText(Double.toString(Result));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonadd) {
            Add();
        }
        else if (e.getSource() == buttonminus) {
            minus();
        }
        else if (e.getSource() == buttondivision) {
            division();
        }
        else if (e.getSource() == Buttonmultiplication) {
            multiplication();
        }
    }
    public static void main(String[] args) {
        Maytinh maytinh = new Maytinh("May Tinh Don Gian");
        maytinh.setLocationRelativeTo(null);
    }
}


