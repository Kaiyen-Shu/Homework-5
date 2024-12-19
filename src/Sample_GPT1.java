import java.awt.*;
import java.awt.event.*;

public class Sample_GPT1{
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        Label label = new Label();
        
        button.setBounds(50, 100, 80, 30);
        label.setBounds(50, 150, 200, 30);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
