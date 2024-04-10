package week7.SimpleCalculator;

import javax.swing.*;
import java.awt.*;

public class SCalculatorFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public JLabel flb = new JLabel("First number");
    public JLabel slb = new JLabel("Second number");
    public JLabel rlb = new JLabel("Result");

    public JTextField ftf = new JTextField();
    public JTextField stf = new JTextField();
    public JTextField rtf = new JTextField();

    public JButton add = new JButton("+");
    public JButton sub = new JButton("-");
    public JButton mul = new JButton("*");
    public JButton div = new JButton("/");

    public SCalculatorMenu sCalculatorMenu = new SCalculatorMenu();

    public SCalculatorFrame() {
        setTitle("Simple Calculator");
        setSize(400, 150);
        this.setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.init();

        setVisible(true);
    }

    private void init() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridLayout(3, 2));

        JPanel sountPanel = new JPanel(new FlowLayout());

        centerPanel.add(flb); centerPanel.add(ftf);
        centerPanel.add(slb); centerPanel.add(stf);
        centerPanel.add(rlb); centerPanel.add(rtf);

        sountPanel.add(add);
        sountPanel.add(sub);
        sountPanel.add(mul);
        sountPanel.add(div);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(sountPanel, BorderLayout.SOUTH);

        // Set properties
        this.rtf.setEnabled(false);
        this.rtf.setBackground(Color.YELLOW);
        this.rtf.setForeground(Color.GREEN);
        this.rtf.setFont(new Font("Arial", Font.BOLD, 20));
        this.rtf.setText("Hello World!");

        this.setContentPane(mainPanel);
        this.setJMenuBar(sCalculatorMenu);
    }

    public static void main(String[] args) {
        SCalculatorFrame sCalculatorFrame = new SCalculatorFrame();
    }
}
