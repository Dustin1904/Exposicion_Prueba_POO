import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class form2 {
    JPanel PantallaP;
    private JTextField grupoNumero5TextField;
    private JEditorPane editorPaneBienvenida;

    public form2() {
        String styledText = "<html><body><h1 style='color:blue;'>¡INTEGRANTES</h1>"
                + "<p style='color:red;'>Este es un JEditorPane con texto enriquecido.</p>"
                + "<p style='font-size:14px;'>Puedes agregar más texto y estilos aquí.</p></body></html>";
                editorPaneBienvenida.setContentType("text/html");
                editorPaneBienvenida.setText(styledText);
        editorPaneBienvenida.addComponentListener(new ComponentAdapter() {
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
