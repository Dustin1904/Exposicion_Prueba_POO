import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class form1 {
    JPanel Programa;
    private JButton visualizarNotasButton;
    private JButton explorarArchivosButton;
    private JTable table1;

    public form1() {

        visualizarNotasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1= new JFrame("Notas");
                frame1.setContentPane( new form2().Tabla);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.pack();
                frame1.setSize(400,600);
                frame1.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(visualizarNotasButton);
                frame.dispose();

            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
