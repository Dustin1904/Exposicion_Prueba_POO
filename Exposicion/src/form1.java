
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class form1 {
    JPanel Programa;
    private JButton explorarArchivosButton;
    private JEditorPane editorPane1;
    private JTable table1;

    public form1(JFrame ventanaAnterior) {
        String styledText = "<html><body><h1 style='color:blue;'>¡INTEGRANTES</h1>"
                + "<p style='color:red;'>Este es un JEditorPane con texto enriquecido.</p>"
                + "<p style='font-size:14px;'>Puedes agregar más texto y estilos aquí.</p></body></html>";
        editorPane1.setContentType("text/html");
        editorPane1.setText(styledText);

        explorarArchivosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        BufferedReader cc = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                        String line;
                        int numColumnas = 0;
                        while ((line = cc.readLine()) != null) {
                            String[] data = line.split(",");
                            numColumnas = data.length;
                        }
                        String[] columnNames = new String[numColumnas];
                        for(int i = 0; i < numColumnas; i++){
                            columnNames[i] = "Columna " + i;
                        }
                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

                        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                        while ((line = br.readLine()) != null) {
                            String[] data = line.split(",");
                            model.addRow(data);
                        }
                        JTable table = new JTable(model);
                        JScrollPane scrollPane = new JScrollPane(table);
                        JFrame frame = new JFrame();
                        frame.add(scrollPane);
                        frame.pack();
                        frame.setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                ventanaAnterior.dispose();
            }
        });
        editorPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}





