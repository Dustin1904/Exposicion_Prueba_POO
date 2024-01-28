import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class form3 {
    private JEditorPane editorPane;
    JPanel PantallaP;
    private JButton button1;
    private JButton Next;

    public form3(JFrame xd) {

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
                                "font-family: 'Roboto', sans-serif;"+
                                "margin: 50px 50px;"+
                                "color: black;"+
                                "}" +
                                ".integrantes{" +
                                "display: flex;"+
                                "font-size: 50px;"+
                                "text-align: center;"+
                                "font-family: 'Roboto', sans-serif;"+
                                "color: black;"+
                                "text-shadow: 2px 2px 2px 10px rgba(232, 226, 221, 0.5);"+
                                "}"+
                                ".contenedor{" +
                                "display: flex;"+
                                "border: 5px solid;"+
                                "box-shadow: inset 0 0 100px rgba(0, 0, 0, 0.5);"+
                                "}"+
                                "</style>" +
                                "</head>" +
                                "<body>" +
                                "<h1 style='color:blue;'> INTEGRANTES </h1>"+
                                "<div class='contenedor'>"+
                                "<p class='integrantes'> * Dustin Marcatoma </p>"+
                                "<p class='integrantes'> * Brandom Santacruz </p>"+
                                "<p class='integrantes'> * Silvia Chaluisa </p>"+
                                "</div>"+
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
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Programa Grupo 5");
                frame2.setContentPane(new form1().Programa);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame2.setVisible(true);
                xd.dispose();
            }
        });
    }
}
