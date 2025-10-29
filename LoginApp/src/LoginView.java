import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    public JTextField txtUsuario;
    public JPasswordField txtPassword;
    public JButton btnLogin;

    public LoginView() {
        setTitle("Iniciar Sesión");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar
        setResizable(false);

        // 🎨 Colores y fuentes
        Color colorFondo = new Color(245, 247, 250);
        Color colorPanel = new Color(255, 255, 255);
        Color colorBoton = new Color(33, 150, 243);
        Font fuente = new Font("SansSerif", Font.PLAIN, 15);

        // 🧱 Panel principal
        JPanel panelFondo = new JPanel(new GridBagLayout());
        panelFondo.setBackground(colorFondo);
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel panelLogin = new JPanel();
        panelLogin.setBackground(colorPanel);
        panelLogin.setPreferredSize(new Dimension(320, 250));
        panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));
        panelLogin.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(230, 230, 230), 1),
                BorderFactory.createEmptyBorder(25, 25, 25, 25)
        ));

        // 🔹 Título
        JLabel lblTitulo = new JLabel("Bienvenido");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblTitulo.setForeground(new Color(60, 60, 60));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelLogin.add(lblTitulo);
        panelLogin.add(Box.createVerticalStrut(20));

        // 🧩 Campo usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(fuente);
        txtUsuario = new JTextField();
        txtUsuario.setFont(fuente);
        txtUsuario.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

        // 🧩 Campo contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(fuente);
        txtPassword = new JPasswordField();
        txtPassword.setFont(fuente);
        txtPassword.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

        // 🔘 Botón
        btnLogin = new JButton("Ingresar");
        btnLogin.setFont(fuente);
        btnLogin.setBackground(colorBoton);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 🪄 Espaciado
        panelLogin.add(lblUsuario);
        panelLogin.add(txtUsuario);
        panelLogin.add(Box.createVerticalStrut(15));
        panelLogin.add(lblPassword);
        panelLogin.add(txtPassword);
        panelLogin.add(Box.createVerticalStrut(25));
        panelLogin.add(btnLogin);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelFondo.add(panelLogin, gbc);

        add(panelFondo);
    }
}
