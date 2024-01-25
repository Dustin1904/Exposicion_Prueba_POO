import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class form3 {
    private JEditorPane editorPane;
    JPanel PantallaP;
    private JButton button1;

    public form3() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String styledText =
                        "<html>" +
                                "<head> " +
                                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" " +
                                "rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/" +
                                "Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">"+
                                "<style>" +
                                "h1 {" +
                                "font-size:75px;" +
                                "text-align: center;" +
                                "padding: 100px 75px" +
                                "}" +
                                ".integrantes{" +
                                "font-size: 50px;"+
                                "text-align: center;"+
                                "}"+
                                "</style>" +
                                "</head>" +
                                "<body>" +
                                "<img class='logo' src='src/Escudo_de_la_Escuela_Politécnica_Nacional.png'>"+
                                "<h1 style='color:blue;'>¡INTEGRANTES</h1>"+
                                "<p class='integrantes'> * Dustin Marcatoma </p>"+
                                "<p class='integrantes'> * Brandom Santacruz </p>"+
                                "<p class='integrantes'> * Silvia Chaluisa </p>"+
                                "</body>" +
                                "</html>";
                editorPane.setContentType("text/html");
                editorPane.setText(styledText);
                editorPane.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentResized(ComponentEvent e) {
                        super.componentResized(e);
                    }
                });
            }
        });
    }
}
