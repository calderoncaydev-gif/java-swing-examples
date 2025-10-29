package view;

import javax.swing.*;
import java.awt.*;

public class UsuarioView extends JFrame {
    public JTextField txtNombre;
    public JTextField txtCorreo;
    public JButton btnGuardar;
    public JTextArea txtResultado;

    public UsuarioView() {
        // 🎯 Configuración básica
        setTitle("Registro de Usuario");
        setSize(380, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana
        setResizable(false);

        // 🎨 Colores y fuentes
        Color fondo = new Color(245, 245, 245);
        Color primario = new Color(33, 150, 243); // Azul moderno
        Font fuente = new Font("SansSerif", Font.PLAIN, 14);

        // 🧱 Panel principal
        JPanel panel = new JPanel();
        panel.setBackground(fondo);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // 🧩 Campo Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(fuente);
        txtNombre = new JTextField(20);
        txtNombre.setFont(fuente);
        txtNombre.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        // 🧩 Campo Correo
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(fuente);
        txtCorreo = new JTextField(20);
        txtCorreo.setFont(fuente);
        txtCorreo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        // 🔘 Botón Guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFont(fuente);
        btnGuardar.setBackground(primario);
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnGuardar.setPreferredSize(new Dimension(100, 35));
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGuardar.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));

        // 🪄 Área de resultados
        txtResultado = new JTextArea(5, 20);
        txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
        txtResultado.setEditable(false);
        txtResultado.setBackground(Color.WHITE);
        txtResultado.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        JScrollPane scroll = new JScrollPane(txtResultado);

        // 🔲 Espaciado visual
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(Box.createVerticalStrut(10));
        panel.add(lblCorreo);
        panel.add(txtCorreo);
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnGuardar);
        panel.add(Box.createVerticalStrut(15));
        panel.add(scroll);

        add(panel);
    }
}
