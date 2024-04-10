package week7.SimpleCalculator;

import javax.swing.*;

public class SCalculatorMenu extends JMenuBar {
    private static final long serialVersionUID = 1L;

    public JMenuItem exit = new JMenuItem("Exit");
    public JMenuItem aMenuAdd = new JMenu("+");
    public JMenuItem aMenuSub = new JMenu("-");
    public JMenuItem aMenuMul = new JMenu("*");
    public JMenuItem aMenuDiv = new JMenu("/");
    public JMenuItem about = new JMenuItem("About");

    public SCalculatorMenu() {
        super();
        this.init();
    }

    private void init() {
        JMenu jMenu = new JMenu("File");
        jMenu.add(exit);

        JMenu jMenuAction = new JMenu("Action");
        jMenuAction.add(aMenuAdd);
        jMenuAction.add(aMenuSub);
        jMenuAction.add(aMenuMul);
        jMenuAction.add(aMenuDiv);
        jMenuAction.addSeparator();

        JMenu jMenuHelp = new JMenu("Help");
        jMenuHelp.add(about);

        this.add (jMenu);
        this.add (jMenuAction);
        this.add (jMenuHelp);
    }
}
