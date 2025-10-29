package controller;

import model.Usuario;
import view.UsuarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioController {
    private UsuarioView vista;

    public UsuarioController(UsuarioView vista) {
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarUsuario();
            }
        });
    }

    private void guardarUsuario() {
        String nombre = vista.txtNombre.getText();
        String correo = vista.txtCorreo.getText();

        if (nombre.isEmpty() || correo.isEmpty()) {
            vista.txtResultado.setText("⚠️ Por favor, complete todos los campos.");
            return;
        }

        Usuario usuario = new Usuario(nombre, correo);
        vista.txtResultado.setText("✅ Usuario guardado:\nNombre: " 
                + usuario.getNombre() + "\nCorreo: " + usuario.getCorreo());
    }
}
