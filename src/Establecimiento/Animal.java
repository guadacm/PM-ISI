
package Establecimiento;

import Conexion.Conexion;
import static Menu.Principal.panelDerecha;
import java.awt.event.MouseEvent;
import javax.swing.JTable;


public class Animal extends javax.swing.JPanel {
    int row;

    public Animal(String codigoE){        
        initComponents();
        volver.setEnabled(true);
        if(Menu.Principal.md == 1) agregar.setEnabled(false);
        
        Conexion.listarAnimal(codigoE);
        setEventoMouseClicked(tablaA);
    }

    private void setEventoMouseClicked(JTable tbl) {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tablaMouseClicked(e);
            }
        });
    }

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {
        row = tablaA.getSelectedRow();
        if (row != -1 && Menu.Principal.md != 1){
            borrar.setEnabled(true);
            modificar.setEnabled(true);
            RegistrarProduccion.setEnabled(true);
            VerProduccion.setEnabled(true);
           
        }else{
            borrar.setEnabled(false);
            modificar.setEnabled(false);
            RegistrarProduccion.setEnabled(false);
            VerProduccion.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        tablaEstab = new javax.swing.JScrollPane();
        tablaA = new javax.swing.JTable();
        RegistrarProduccion = new javax.swing.JButton();
        VerProduccion = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 499));

        borrar.setText("Borrar");
        borrar.setEnabled(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.setEnabled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestión de Animales");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jTextField1.setText("...");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        tablaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raza", "Fecha de Nacimiento", "Peso (en Kilogramos)", "aCod (identificador)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEstab.setViewportView(tablaA);

        RegistrarProduccion.setText("Registrar Producción");
        RegistrarProduccion.setEnabled(false);
        RegistrarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProduccionActionPerformed(evt);
            }
        });

        VerProduccion.setText("Ver Producción");
        VerProduccion.setEnabled(false);
        VerProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProduccionActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.setEnabled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tablaEstab, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VerProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegistrarProduccion)
                                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(borrar)
                        .addGap(38, 38, 38)
                        .addComponent(modificar)
                        .addGap(42, 42, 42)
                        .addComponent(VerProduccion)
                        .addGap(37, 37, 37)
                        .addComponent(RegistrarProduccion)
                        .addGap(73, 73, 73)
                        .addComponent(volver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tablaEstab, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        AltaAnimal nueva = new AltaAnimal();
        nueva.setVisible(true);
        nueva.setLocationRelativeTo(this);
        nueva.campo_ecod.setText(codigoE);     
    }//GEN-LAST:event_agregarActionPerformed

    private void RegistrarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProduccionActionPerformed
        codigoA = (String) tablaA.getValueAt(row,3);//codigo del animal del cual vamos a registrar su produccion
        RegistrarProduccion nueva = new RegistrarProduccion();
        nueva.setVisible(true);
        nueva.setLocationRelativeTo(this);
        nueva.prodAnimalX.setText(codigoA);    
    }//GEN-LAST:event_RegistrarProduccionActionPerformed

    private void VerProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProduccionActionPerformed
        String codAnimal = (String) tablaA.getValueAt(row,3);//codigo del animal
        Produccion panelProduccion = new Produccion(codAnimal,codigoE);
        panelProduccion.setSize(1000,599);
        panelProduccion.setLocation(5, 5);
        panelDerecha.removeAll();
        panelDerecha.add(panelProduccion);
        panelDerecha.revalidate();
        panelDerecha.repaint();
    }//GEN-LAST:event_VerProduccionActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Establecimiento.establecimiento panelEstablecimiento = new Establecimiento.establecimiento();
        panelEstablecimiento.setSize(1000,599);
        panelEstablecimiento.setLocation(5, 5);
        panelDerecha.removeAll();
        panelDerecha.add(panelEstablecimiento);
        panelDerecha.revalidate();
        panelDerecha.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistrarProduccion;
    private javax.swing.JButton VerProduccion;
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modificar;
    public static javax.swing.JTable tablaA;
    public static javax.swing.JScrollPane tablaEstab;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
    public String codigoE;
    public String codigoA;
}
