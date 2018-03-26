import javax.swing.*;

/**
 * Frame for calculator
 * @author Ihor Savchenko
 * @version 1.0
 */
class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setTitle("Calculator");
        setLocationRelativeTo(null);
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
        pack();
    }
}
