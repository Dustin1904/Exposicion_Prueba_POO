import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class form2{
    JTable Tabla;
    private JPanel panel1;

    public form2 (){
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
    }
}
