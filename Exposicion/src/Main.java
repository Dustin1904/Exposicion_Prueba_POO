import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame("Programa Grupo 5");
        frame.setContentPane(new form1(frame).Programa);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);*/

        JFrame frame2 = new JFrame("Bienvenida");
        frame2.setContentPane(new  form2().PantallaP);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(500,500);
        frame2.setVisible(true);


    }
}