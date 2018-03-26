import javax.swing.*;
import java.awt.*;

/**
 * Entry Point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Calculator
{
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
