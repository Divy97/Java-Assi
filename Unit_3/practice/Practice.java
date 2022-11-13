import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Practice extends JFrame implements ItemListener {
    public static void main(String[] args) {
        new Practice();
    }

    private JToggleButton button;

    Practice() {
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected())
            button.setText("OFF");
        else
            button.setText("ON");
    }
}
