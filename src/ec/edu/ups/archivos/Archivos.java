/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.archivos;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sun.java2d.pipe.hw.AccelDeviceEventNotifier;
import javax.swing.JList;

/**
 *
 * @author Byron PC
 */
public class Archivos extends javax.swing.JFrame {

    DefaultListModel carpetas;
    DefaultListModel archiv;
    DefaultListModel ocultos;

    /**
     * Creates new form Archivos
     */
    public Archivos() {
        this.setTitle("Busqueda de Archivos");
        initComponents();
        setIconImage(new ImageIcon(("src/ec/edu/ups/archivos/iconoooo.png")).getImage());
        setLocationRelativeTo(null);

        carpetas = new DefaultListModel<>();
        listacarpetas.setModel(carpetas);

        archiv = new DefaultListModel<>();
        listaarchivos.setModel(archiv);

        ocultos = new DefaultListModel<>();
        listaocultos.setModel(ocultos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listacarpetas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaarchivos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaocultos = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txturl = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuitemrenombrar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        itemeliminar = new javax.swing.JMenuItem();
        itemEliminarCarpeta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listacarpetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listacarpetasMouseClicked(evt);
            }
        });
        listacarpetas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listacarpetasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listacarpetas);

        listaarchivos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaarchivosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaarchivos);

        listaocultos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaocultosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaocultos);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de Modificacion:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Ruta Absoluta:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Tamaño:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda de Archivos");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Direccion URL:");

        txturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturlActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/buscarservicio.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/listarrrr.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnregresar)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnregresar))
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/logo-ups-home.png"))); // NOI18N

        menuitemrenombrar.setText("Archivos");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Nueva Carpeta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuitemrenombrar.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/listarfac.png"))); // NOI18N
        jMenuItem1.setText("Nuevo Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuitemrenombrar.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/actualizar.png"))); // NOI18N
        jMenuItem2.setText("Renombrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuitemrenombrar.add(jMenuItem2);

        itemeliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/archivos/deleteffac.png"))); // NOI18N
        itemeliminar.setText("Eliminar");
        itemeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemeliminarActionPerformed(evt);
            }
        });
        menuitemrenombrar.add(itemeliminar);

        itemEliminarCarpeta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemEliminarCarpeta.setText("Eliminar Carpeta");
        itemEliminarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarCarpetaActionPerformed(evt);
            }
        });
        menuitemrenombrar.add(itemEliminarCarpeta);

        jMenuBar1.add(menuitemrenombrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:

        vaciarTabla();
        File direccion;
        direccion = new File(txturl.getText().trim());
        File[] archivos = direccion.listFiles();

        //.trim elimina espacios tanto de derecha como izquierda
        if ("".equals(txturl.getText().trim())) {
            JOptionPane.showConfirmDialog(null, "Esta URL no existe");
        } else {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    if (archivo.isHidden()) {
                        //Ocultos
                        String lista = archivo.getName();
                        ocultos.addElement(lista);
                    } else {
                        //Carpetas
                        String lista = archivo.getName();
                        carpetas.addElement(lista);
                    }

                } else if (archivo.isFile()) {

                    if (archivo.isHidden()) {
                        //Oculto
                        String lista = archivo.getName();
                        ocultos.addElement(lista);
                    } else {
                        //Archivos
                        String lista = archivo.getName();
                        archiv.addElement(lista);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed
    public void actualizarDatos() {
        vaciarTabla();
        File direccion;
        direccion = new File(txturl.getText().trim());
        File[] archivos = direccion.listFiles();

        //.trim elimina espacios tanto de derecha como izquierda
        if ("".equals(txturl.getText().trim())) {
            JOptionPane.showConfirmDialog(null, "Esta URL no existe");
        } else {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    if (archivo.isHidden()) {
                        //Ocultos
                        String lista = archivo.getName();
                        ocultos.addElement(lista);
                    } else {
                        //Carpetas
                        String lista = archivo.getName();
                        carpetas.addElement(lista);
                    }

                } else if (archivo.isFile()) {

                    if (archivo.isHidden()) {
                        //Oculto
                        String lista = archivo.getName();
                        ocultos.addElement(lista);
                    } else {
                        //Archivos
                        String lista = archivo.getName();
                        archiv.addElement(lista);
                    }
                }
            }
        }
    }

    public void borrar(File archivoSeleccionado) {
        if (archivoSeleccionado.isDirectory()) {
            try {
                for (File listFile : archivoSeleccionado.listFiles()) {
                    if (listFile.isFile()) {
                        listFile.delete();
                    } else if (listFile.isDirectory()) {
                        borrar(listFile);
                        listFile.delete();
                        listFile.deleteOnExit();
                    }
                }
            } catch (NullPointerException error) {
                JOptionPane.showMessageDialog(this, "No se puede eliminar directamente esta carpeta \n " + error);
            }
        }

        archivoSeleccionado.delete();
        archivoSeleccionado.deleteOnExit();
    }

    public void vaciarTabla() {

        DefaultListModel listModel = (DefaultListModel) listacarpetas.getModel();
        listModel.removeAllElements();
        DefaultListModel listModel2 = (DefaultListModel) listaarchivos.getModel();
        listModel2.removeAllElements();
        DefaultListModel listModel3 = (DefaultListModel) listaocultos.getModel();
        listModel3.removeAllElements();
    }

    private void txturlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txturlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txturlActionPerformed

    public void mostrarinformacion(String elementoSeleccionado) {

        // System.out.println("Elemento: "+ elementoseleccionado);
        String rutasele = txturl.getText().trim() + "\\" + elementoSeleccionado;

        //System.out.println("Ruta elemento Seleccionado: "+ rutasele);
        //Conseguir la fecha de ultima actualizacion
        File archivoSelecc = new File(rutasele);
        long modificacion = archivoSelecc.lastModified();
        Date modiDate = new Date(modificacion);
        SimpleDateFormat fechamodificacion = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = fechamodificacion.format(modiDate);
        jLabel3.setText("Fecha modificacion: " + fecha);

        //Ruta Absoluta
        jLabel4.setText("Ruta Abosulta: " + rutasele);
        //Tamaño en bytes
        long tamaño = archivoSelecc.length();
        long tamañofinal = tamaño / 1024;
        jLabel5.setText("Tamaño: " + tamañofinal + " KB");

    }

    private void listacarpetasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listacarpetasValueChanged
        // TODO add your handling code here:
        String elementoSeleccionado = (String) listacarpetas.getSelectedValue();
        String rutaSeleccionada = txturl.getText().trim() + "\\" + elementoSeleccionado;
        mostrarinformacion(elementoSeleccionado);

        listaarchivos.clearSelection();
        listaocultos.clearSelection();

    }//GEN-LAST:event_listacarpetasValueChanged

    private void listaarchivosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaarchivosValueChanged
        // TODO add your handling code here:
        String elementoSeleccionado = (String) listaarchivos.getSelectedValue();
        String rutaSeleccionada = txturl.getText().trim() + "\\" + elementoSeleccionado;
        mostrarinformacion(elementoSeleccionado);

        listacarpetas.clearSelection();
        listaocultos.clearSelection();
    }//GEN-LAST:event_listaarchivosValueChanged

    private void listaocultosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaocultosValueChanged
        // TODO add your handling code here:
        String elementoSeleccionado = (String) listaocultos.getSelectedValue();
        String rutaSeleccionada = txturl.getText().trim() + "\\" + elementoSeleccionado;
        mostrarinformacion(elementoSeleccionado);

        listaarchivos.clearSelection();
        listacarpetas.clearSelection();
    }//GEN-LAST:event_listaocultosValueChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        String url = txturl.getText().trim() + "\\" + nombre;
        File nuevo = new File(url);
        String carpetaseleccionado = null;
        if (!listacarpetas.isSelectionEmpty()) {
            carpetaseleccionado = (String) listacarpetas.getSelectedValue();
            String url2 = txturl.getText().trim() + "\\" + carpetaseleccionado + "\\" + nombre;
            File nuevo2 = new File(url2);

            try {
                nuevo2.createNewFile();
                JOptionPane.showMessageDialog(this, "El archivo ha sido creado en la direccion: \n" + url);
            } catch (IOException error) {
                JOptionPane.showConfirmDialog(this, "El archivo no pudo ser creado: " + error.toString());

            }

        } else {
            if (!nuevo.exists()) {
                try {
                    nuevo.createNewFile();
                    JOptionPane.showMessageDialog(this, "El archivo ha sido creado en la direccion: \n" + url);
                } catch (IOException error) {
                    JOptionPane.showConfirmDialog(this, "El archivo no pudo ser creado: " + error.toString());

                }
            }

        }
        actualizarDatos();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String archivoSeleccionado = null;
        if (!listaarchivos.isSelectionEmpty()) {
            archivoSeleccionado = (String) listaarchivos.getSelectedValue();
        } else if (!listacarpetas.isSelectionEmpty()) {
            archivoSeleccionado = (String) listacarpetas.getSelectedValue();
        } else if (listaocultos.isSelectionEmpty()) {
            archivoSeleccionado = (String) listaocultos.getSelectedValue();
        }
        String urlArchivoSeleccinado = txturl.getText().trim() + "\\" + archivoSeleccionado;
        File archivonuevo = new File(urlArchivoSeleccinado);

        String nombrenuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre del archivo");
        String urlNuevoArchivo = txturl.getText().trim() + "\\" + nombrenuevo;

        File archivorenombrado = new File(urlNuevoArchivo);

        if (archivorenombrado.exists()) {
            JOptionPane.showMessageDialog(this, "Ya existe un archivo con ese nombre");
        } else {
            archivonuevo.renameTo(archivorenombrado);

        }
        actualizarDatos();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String nombreCarpeta = JOptionPane.showInputDialog("Ingrese el nombre de la carpeta");
        String url = txturl.getText().trim() + "\\" + nombreCarpeta;
        File nuevacarpeta = new File(url);
        if (!nuevacarpeta.exists()) {
            nuevacarpeta.mkdir();
            JOptionPane.showMessageDialog(this, "La carpeta ha sido creada");
        } else {
            JOptionPane.showMessageDialog(this, "La carpeta no pudo ser creada");
        }
        actualizarDatos();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itemeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemeliminarActionPerformed
        // TODO add your handling code here:
        String archivoSeleccionado = null;
        boolean isvalid = true;
        if (!listaarchivos.isSelectionEmpty()) {
            archivoSeleccionado = (String) listaarchivos.getSelectedValue();
        } else if (!listacarpetas.isSelectionEmpty()) {
            archivoSeleccionado = (String) listacarpetas.getSelectedValue();
        } else if (listaocultos.isSelectionEmpty()) {
            archivoSeleccionado = (String) listaocultos.getSelectedValue();
        } else {
            isvalid = false;
            JOptionPane.showMessageDialog(this, "No ha seleccionado un archivo para eliminar");
        }
        if (isvalid) {
            String urlArchivoSeleccinado = txturl.getText().trim() + "\\" + archivoSeleccionado;
            File archivonuevo = new File(urlArchivoSeleccinado);
            JOptionPane.showMessageDialog(this, "Se ha eliminado el documento: \n" + archivonuevo);

            archivonuevo.delete();

        }

        actualizarDatos();
    }//GEN-LAST:event_itemeliminarActionPerformed
    private void jListNicknamesMouseClicked(java.awt.event.MouseEvent evt) {
        String carpetaSeleccionada = (String) listacarpetas.getSelectedValue();

        String elementoSelec = (String) listacarpetas.getSelectedValue();
        String rutaSelec = txturl.getText().trim() + "\\" + carpetaSeleccionada;
        File archivoSelec1 = new File(rutaSelec);
        String rutaA = archivoSelec1.getAbsolutePath();

        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            txturl.setText(rutaA);
            System.out.println("index: " + index);

            actualizarDatos();
        }
    }
    private void listacarpetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listacarpetasMouseClicked
        // TODO add your handling code here:
        jListNicknamesMouseClicked(evt);
    }//GEN-LAST:event_listacarpetasMouseClicked

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:        
        String direccion = txturl.getText().trim();
        String regresar = null;
        for (int i = direccion.length() - 2; i > 2; i--) {
            if ((int) direccion.charAt(i) == 92) {
                regresar = direccion.substring(0, i);
                txturl.setText(regresar);
                btnbuscarActionPerformed(evt);
                break;
            }
        }
    }//GEN-LAST:event_btnregresarActionPerformed

    private void itemEliminarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarCarpetaActionPerformed
        // TODO add your handling code here:

        JOptionPane.showConfirmDialog(this, "Desea Elimar esta carpeta");
        String caroetaSeleccionada = (String) listacarpetas.getSelectedValue();

        String rutaSeleccionada = txturl.getText().trim() + "\\" + caroetaSeleccionada;

        File elementoSelecionado = new File(rutaSeleccionada);
        borrar(elementoSelecionado);
        JOptionPane.showMessageDialog(this, "Se ha eliminado la carpeta exitosamente");
        actualizarDatos();

    }//GEN-LAST:event_itemEliminarCarpetaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JMenuItem itemEliminarCarpeta;
    private javax.swing.JMenuItem itemeliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaarchivos;
    private javax.swing.JList<String> listacarpetas;
    private javax.swing.JList<String> listaocultos;
    private javax.swing.JMenu menuitemrenombrar;
    private javax.swing.JTextField txturl;
    // End of variables declaration//GEN-END:variables
}
