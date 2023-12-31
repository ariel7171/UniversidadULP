package universidadulp.vistas;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import static universidadulp.connection.DatabaseConnection.getInstance;
import universidadulp.entidades.TipoUsuario;
import universidadulp.entidades.Usuario;
import universidadulp.event.LoginListener;
import universidadulp.repositorio.TipoUsuarioRepositorio;
import universidadulp.repositorio.UsuarioRepositorio;

public class Main extends javax.swing.JFrame implements LoginListener {

    private TipoUsuarioRepositorio tr;
    private UsuarioRepositorio ur;

    private Usuario user;
    private TipoUsuario userType;
    private int idSystemUser;

    public Main() {

        ur = new UsuarioRepositorio();
        tr = new TipoUsuarioRepositorio();

        initComponents();
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/icon/logo1.png")).getImage());

    }

    private void centrarInternalFrame(JInternalFrame form) {

        Dimension desktopSize = jDesktopPane1.getSize();
        int x = (desktopSize.width - form.getWidth()) / 2;
        int y = (desktopSize.height - form.getHeight()) / 2;
        form.setLocation(x, y);

    }

    private void createLogin() {

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Login frmLogin = new Login();
        frmLogin.setLoginListener((LoginListener) this);
        centrarInternalFrame(frmLogin);
        frmLogin.setVisible(true);
        jDesktopPane1.add(frmLogin);
        jDesktopPane1.moveToFront(frmLogin);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuAlumno = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuMateria = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        menuInscripcion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuNotas = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();
        menuConsulta = new javax.swing.JMenuItem();
        menu5 = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenuItem();
        menu6 = new javax.swing.JMenu();
        menuAcerca = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GESTION ULP");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        menu1.setText("Alumno");

        menuAlumno.setText("Formulario Alumno");
        menuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoActionPerformed(evt);
            }
        });
        menu1.add(menuAlumno);

        menuBar.add(menu1);

        menu2.setText("Materia");

        menuMateria.setText("Formulario Materia");
        menuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaActionPerformed(evt);
            }
        });
        menu2.add(menuMateria);

        menuBar.add(menu2);

        menu3.setText("Administración");

        menuInscripcion.setText("Manejo Inscripciones");
        menuInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInscripcionActionPerformed(evt);
            }
        });
        menu3.add(menuInscripcion);
        menu3.add(jSeparator1);

        menuNotas.setText("Manipular Notas");
        menuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotasActionPerformed(evt);
            }
        });
        menu3.add(menuNotas);

        menuBar.add(menu3);

        menu4.setText("Consulta");

        menuConsulta.setText("Alumnos por Materia");
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });
        menu4.add(menuConsulta);

        menuBar.add(menu4);

        menu5.setText("Administrar");

        menuUsuario.setText("Formulario Usuarios");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menu5.add(menuUsuario);

        menuOpciones.setText("Opciones");
        menuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionesActionPerformed(evt);
            }
        });
        menu5.add(menuOpciones);

        menuBar.add(menu5);

        menu6.setText("Ayuda");

        menuAcerca.setText("Acerca de...");
        menuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaActionPerformed(evt);
            }
        });
        menu6.add(menuAcerca);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menu6.add(menuSalir);

        menuBar.add(menu6);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ABMAlumnos frmAlumnos = new ABMAlumnos();
        centrarInternalFrame(frmAlumnos);
        frmAlumnos.setVisible(true);
        addInternalFrameListener(frmAlumnos);
        jDesktopPane1.add(frmAlumnos);
        jDesktopPane1.moveToFront(frmAlumnos);

    }//GEN-LAST:event_menuAlumnoActionPerformed

    private void menuInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInscripcionActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ABMInscripcion frmInscripcion = new ABMInscripcion();
        centrarInternalFrame(frmInscripcion);
        frmInscripcion.setVisible(true);
        jDesktopPane1.add(frmInscripcion);
        jDesktopPane1.moveToFront(frmInscripcion);

    }//GEN-LAST:event_menuInscripcionActionPerformed

    private void menuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ABMMaterias frmMaterias = new ABMMaterias();
        centrarInternalFrame(frmMaterias);
        frmMaterias.setVisible(true);
        jDesktopPane1.add(frmMaterias);
        jDesktopPane1.moveToFront(frmMaterias);

    }//GEN-LAST:event_menuMateriaActionPerformed

    private void menuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotasActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CargaNotas frmNotas = new CargaNotas();
        centrarInternalFrame(frmNotas);
        frmNotas.setVisible(true);
        jDesktopPane1.add(frmNotas);
        jDesktopPane1.moveToFront(frmNotas);

    }//GEN-LAST:event_menuNotasActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AlumnoPorMateria frmAluxMat = new AlumnoPorMateria();
        centrarInternalFrame(frmAluxMat);
        frmAluxMat.setVisible(true);
        jDesktopPane1.add(frmAluxMat);
        jDesktopPane1.moveToFront(frmAluxMat);

    }//GEN-LAST:event_menuConsultaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        estadoMenus(false, false, false, false, false, false);
        createLogin();

    }//GEN-LAST:event_formWindowOpened

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ABMUsuarios frmUsuarios = new ABMUsuarios();
        centrarInternalFrame(frmUsuarios);
        frmUsuarios.setVisible(true);
        jDesktopPane1.add(frmUsuarios);
        jDesktopPane1.moveToFront(frmUsuarios);

    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        TiposUsuario frmTUsuario = new TiposUsuario();
        centrarInternalFrame(frmTUsuario);
        frmTUsuario.setVisible(true);
        jDesktopPane1.add(frmTUsuario);
        jDesktopPane1.moveToFront(frmTUsuario);

    }//GEN-LAST:event_menuOpcionesActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Esta Seguro que desea salir del Sistema?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

            System.exit(0);

        }

    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AcercaDe frmAcerca = new AcercaDe();
        centrarInternalFrame(frmAcerca);
        frmAcerca.setVisible(true);
        jDesktopPane1.add(frmAcerca);
        jDesktopPane1.moveToFront(frmAcerca);
        
    }//GEN-LAST:event_menuAcercaActionPerformed

    @Override
    public void onLoginSuccess(int idUser, String username) {

        setTitle(getTitle() + " - USUARIO: " + username);
        idSystemUser = idUser;

    }

    private void estadoMenus(boolean eMenu1, boolean eMenu2, boolean eMenu3, boolean eMenu4, boolean eMenu5, boolean eMenu6) {

        menu1.setEnabled(eMenu1);
        menu2.setEnabled(eMenu2);
        menu3.setEnabled(eMenu3);
        menu4.setEnabled(eMenu4);
        menu5.setEnabled(eMenu5);
        menu6.setEnabled(eMenu6);

    }

    @Override
    public void onMethodExecution() {

        try (Connection conn = getInstance();) {

            user = ur.buscarPorId(idSystemUser);

            userType = tr.buscarPorId(user.getTipoUsuario().getIdTipoUsuario());

        } catch (SQLException ex) {

            JOptionPane.showConfirmDialog(this, ex.getMessage(), "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
        }

        if (userType.isAdmin()) {

            estadoMenus(true, true, true, true, true, true);

        } else if (userType.isCrud()) {

            estadoMenus(true, true, true, false, false, true);

        } else if (userType.isQueries()) {

            estadoMenus(false, false, false, true, false, true);

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                UIManager.put("OptionPane.yesButtonText", "Si");

                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu4;
    private javax.swing.JMenu menu5;
    private javax.swing.JMenu menu6;
    private javax.swing.JMenuItem menuAcerca;
    private javax.swing.JMenuItem menuAlumno;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuConsulta;
    private javax.swing.JMenuItem menuInscripcion;
    private javax.swing.JMenuItem menuMateria;
    private javax.swing.JMenuItem menuNotas;
    private javax.swing.JMenuItem menuOpciones;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuUsuario;
    // End of variables declaration//GEN-END:variables

    private void addInternalFrameListener(JInternalFrame internalFrame) {

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {

                checkOpenInternalFrames();

            }

        });
    }

    private void checkOpenInternalFrames() {

        JInternalFrame[] frames = jDesktopPane1.getAllFrames();

        boolean hasOpenFrames = frames.length > 0;

        // Cambiamos el comportamiento de cierre en función de si hay JInternalFrames abiertos o no
        if (hasOpenFrames) {

            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        } else {

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    }

}
