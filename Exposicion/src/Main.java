import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame("Programa Grupo 5");
        frame.setContentPane(new form1(frame).Programa);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);*/

        JFrame frame = new JFrame("Bienvenida");
        frame.setContentPane(new form3().PantallaP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}