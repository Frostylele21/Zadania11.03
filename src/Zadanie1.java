import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zadanie1
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Stopnie Fahrenheit'a");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500,300);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel cel = new JLabel("Stopnie Celsjusza");
        cel.setBounds(10,10, 100, 40);
        window.add(cel);

        JLabel fahr = new JLabel("");
        fahr.setBounds(10, 55, 350, 40);
        window.add(fahr);

        JTextField text = new JTextField();
        text.setBounds(120, 22, 100, 20);
        window.add(text);

        JButton button = new JButton("Przelicz");
        button.setBounds(140, 80, 150, 40);
        window.add(button);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String wyn = text.getText();

                double fah = 1.8 * Double.parseDouble(wyn) + 32.0;

                fahr.setText(wyn+ " Stopni Celsjusza to " +fah+ "stopni Fahrenheit'a.");
            }
        });
        window.setVisible(true);
    }
}
