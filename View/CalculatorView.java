package View;

import javax.swing.*;

public class CalculatorView extends JFrame{
    public JTextField calText;
    private JPanel calPanel;
    public JButton calCong;
    public JButton cal1;
    public JButton cal2;
    public JButton cal3;
    public JButton calTru;
    public JButton cal4;
    public JButton cal5;
    public JButton cal6;
    public JButton calNhan;
    public JButton cal7;
    public JButton cal8;
    public JButton cal9;
    public JButton calChia;
    public JButton calCham;
    public JButton cal0;
    public JButton calAC;
    public JButton calBang;

    public CalculatorView() {
        calText.setEditable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane( this.calPanel );
        this.setSize(300,300);
    }

    public void setText(String s)
    {
        calText.setText(s);
    }
}

