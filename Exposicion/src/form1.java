
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class form1 {
    JPanel Programa;
    private JButton explorarArchivosButton;
    private JLabel Label1;
    private JEditorPane a1EditorPane;
    private JEditorPane editorPane3;
    private JEditorPane a3EditorPane;
    private JEditorPane a4EditorPane;
    private JEditorPane editorPane6;
    private JEditorPane editorPane7;
    private JEditorPane editorPane8;
    private JEditorPane JFileChooserEditorPane;
    private JEditorPane JTableEditorPane;
    private JEditorPane editorPane11;
    private JEditorPane editorPane12;
    private JEditorPane editorPane13;
    private JEditorPane JSeparatorEditorPane;
    private JEditorPane JEditorPaneEditorPane;
    private JButton iniciarSesionButton;
    private JScrollBar scrollBar1;
    private JTable table1;

    public form1() {
        /*String styledText =
                "<html>" +
                    "<body>" +
                        "<div class='contenedorJ'>"+
                            "<h1> --> JFileChooser</h1>"+
                            "<h1> --> JTable</h1>"+
                            "<h1> --> JMenu JSplitPane</h1>"+
                            "<h1> --> J "+
                        "</div>"+
                    "</body>" +
                "</html>";
        editorPane1.setContentType("text/html");
        editorPane1.setText(styledText);*/
        String styledText =
                "<html>" +
                        "<head> " +
                            "<style>" +
                                "h1{" +
                                    "font-size: 20px;"+
                                    "text-align: center;"+
                                    "align-items: center;"+
                                    "justify-content: center;"+
                                    "padding: 20px 20px;"+
                                "}"+
                            "</style>"+
                        "</head>"+
                        "<body>" +
                            "<h1> 1 </h1>"+
                        "</body>" +
                "</html>";
        a1EditorPane.setContentType("text/html");
        a1EditorPane.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 2 </h1>"+
                        "</body>" +
                        "</html>";
        editorPane3.setContentType("text/html");
        editorPane3.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 3 </h1>"+
                        "</body>" +
                        "</html>";
        a3EditorPane.setContentType("text/html");
        a3EditorPane.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 4 </h1>"+
                        "</body>" +
                        "</html>";
        a4EditorPane.setContentType("text/html");
        a4EditorPane.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 5 </h1>"+
                        "</body>" +
                        "</html>";
        editorPane6.setContentType("text/html");
        editorPane6.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 6 </h1>"+
                        "</body>" +
                        "</html>";
        editorPane7.setContentType("text/html");
        editorPane7.setText(styledText);

        styledText =
                "<html>" +
                        "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1> 7 </h1>"+
                        "</body>" +
                        "</html>";
        editorPane8.setContentType("text/html");
        editorPane8.setText(styledText);

        styledText =
                "<head> " +
                "<style>" +
                "h1{" +
                "font-size: 20px;"+
                "text-align: center;"+
                "align-items: center;"+
                "justify-content: center;"+
                "padding: 20px 20px;"+
                "}"+
                "</style>"+
                "</head>"+
                "<body>" +
                "<h1 class='frame'> JFileChooser </h1>"+
                "</body>" +
                "</html>";
        JFileChooserEditorPane.setContentType("text/html");
        JFileChooserEditorPane.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JTable </h1>"+
                        "</body>" +
                        "</html>";
        JTableEditorPane.setContentType("text/html");
        JTableEditorPane.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JMenu </h1>"+
                        "</body>" +
                        "</html>";
        editorPane11.setContentType("text/html");
        editorPane11.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JSplitPane </h1>"+
                        "</body>" +
                        "</html>";
        editorPane12.setContentType("text/html");
        editorPane12.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JScrollBar </h1>"+
                        "</body>" +
                        "</html>";
        editorPane13.setContentType("text/html");
        editorPane13.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JSeparator </h1>"+
                        "</body>" +
                        "</html>";
        JSeparatorEditorPane.setContentType("text/html");
        JSeparatorEditorPane.setText(styledText);

        styledText =
                "<head> " +
                        "<style>" +
                        "h1{" +
                        "font-size: 20px;"+
                        "text-align: center;"+
                        "align-items: center;"+
                        "justify-content: center;"+
                        "padding: 20px 20px;"+
                        "}"+
                        "</style>"+
                        "</head>"+
                        "<body>" +
                        "<h1 class='frame'> JEditorPane </h1>"+
                        "</body>" +
                        "</html>";
        JEditorPaneEditorPane.setContentType("text/html");
        JEditorPaneEditorPane.setText(styledText);
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
                        System.out.println(ex);
                    }
                }
            }
        });

        ComponentAdapter listener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        };

        ComponentAdapter listener1 = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        };
        a1EditorPane.addComponentListener(listener1);
        JFileChooserEditorPane.addComponentListener(listener1);
        editorPane3.addComponentListener(listener1);
        JTableEditorPane.addComponentListener(listener1);
        a3EditorPane.addComponentListener(listener1);
        editorPane11.addComponentListener(listener1);
        a4EditorPane.addComponentListener(listener1);
        editorPane12.addComponentListener(listener1);
        editorPane6.addComponentListener(listener1);
        editorPane13.addComponentListener(listener1);
        editorPane7.addComponentListener(listener1);
        JSeparatorEditorPane.addComponentListener(listener1);
        editorPane8.addComponentListener(listener1);
        JEditorPaneEditorPane.addComponentListener(listener1);

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame("Login xd");
                frame3.setContentPane(new form2(frame3).log);
                frame3.getDefaultCloseOperation();
                frame3.pack();
                frame3.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
}





