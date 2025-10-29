import view.UsuarioView;
import controller.UsuarioController;

public class AppMain {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            UsuarioView vista = new UsuarioView();
            new UsuarioController(vista);
            vista.setVisible(true);
        });
    }
}
