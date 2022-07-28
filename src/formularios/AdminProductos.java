package formularios;

import dao.DaoProducto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class AdminProductos extends javax.swing.JInternalFrame {

    private final String columnas[] = {"Código", "Nombre", "Referencia", "Temperatura", "Valor Base"};
    private final DefaultTableModel miTablita = new DefaultTableModel(columnas, 0);

    public AdminProductos() {
        initComponents();
        cargarDatoTabla();
    }

    private void cargarDatoTabla() {
        //**********************************************************
        //definicion de variables
        //**********************************************************
        List<Producto> arregloProductos;
        DaoProducto objDaoProducto;
        //**********************************************************
        //**********************************************************
        //creacion de objetos
        //**********************************************************
        objDaoProducto = new DaoProducto();
        //**********************************************************
        arregloProductos = objDaoProducto.consultar();

        arregloProductos.forEach(producto -> {
            Object[] fila = new Object[5];
            fila[0] = producto.getCodProducto();
            fila[1] = producto.getNombre();
            fila[2] = producto.getId();
            fila[3] = producto.getTemperatura();
            fila[4] = producto.getValorBase();
            miTablita.addRow(fila);
        });
        tablaProductosAdmin.setModel(miTablita);
        tablaProductosAdmin.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaProductosAdmin.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaProductosAdmin.getColumnModel().getColumn(2).setPreferredWidth(20);
        tablaProductosAdmin.getColumnModel().getColumn(3).setPreferredWidth(20);
        tablaProductosAdmin.getColumnModel().getColumn(4).setPreferredWidth(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabeceraAdminPro = new javax.swing.JPanel();
        lblCodigoAdminPro = new javax.swing.JLabel();
        txtCajaCodigoAdminPro = new javax.swing.JTextField();
        lblReferenciaAdminPro = new javax.swing.JLabel();
        txtCajaReferenciaAdminPro = new javax.swing.JTextField();
        txtValorBaseAdminPro = new javax.swing.JLabel();
        txtCajaValorBaseAdminPro = new javax.swing.JTextField();
        lblTemperaturaAdminPro = new javax.swing.JLabel();
        txtCajaTemperaturaAdminPro = new javax.swing.JTextField();
        lblNombreAdminPro = new javax.swing.JLabel();
        txtCajaNombreAdminPro = new javax.swing.JTextField();
        panelCuerpoAdminPro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductosAdmin = new javax.swing.JTable();
        btnActualizarAdminPro = new javax.swing.JButton();
        btnEliminarAdminPro = new javax.swing.JButton();

        setClosable(true);

        panelCabeceraAdminPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigoAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodigoAdminPro.setText("CODIGO: ");

        txtCajaCodigoAdminPro.setEditable(false);
        txtCajaCodigoAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblReferenciaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReferenciaAdminPro.setText("REFERENCIA: ");

        txtCajaReferenciaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtValorBaseAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValorBaseAdminPro.setText("VALOR BASE: ");

        txtCajaValorBaseAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblTemperaturaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTemperaturaAdminPro.setText("TEMPERATURA: ");

        txtCajaTemperaturaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblNombreAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreAdminPro.setText("NOMBRE: ");

        txtCajaNombreAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelCabeceraAdminProLayout = new javax.swing.GroupLayout(panelCabeceraAdminPro);
        panelCabeceraAdminPro.setLayout(panelCabeceraAdminProLayout);
        panelCabeceraAdminProLayout.setHorizontalGroup(
            panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorBaseAdminPro)
                    .addComponent(lblCodigoAdminPro)
                    .addComponent(lblNombreAdminPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCajaCodigoAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCajaValorBaseAdminPro))
                        .addGap(18, 18, 18)
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemperaturaAdminPro)
                            .addComponent(lblReferenciaAdminPro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCajaReferenciaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCajaTemperaturaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCajaNombreAdminPro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabeceraAdminProLayout.setVerticalGroup(
            panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAdminPro)
                    .addComponent(txtCajaCodigoAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferenciaAdminPro)
                    .addComponent(txtCajaReferenciaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorBaseAdminPro)
                    .addComponent(txtCajaValorBaseAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperaturaAdminPro)
                    .addComponent(txtCajaTemperaturaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreAdminPro)
                    .addComponent(txtCajaNombreAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelCuerpoAdminPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProductosAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProductosAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductosAdmin);

        btnActualizarAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnActualizarAdminPro.setText("ACTUALIZAR");
        btnActualizarAdminPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminProActionPerformed(evt);
            }
        });

        btnEliminarAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminarAdminPro.setText("ELIMINAR");
        btnEliminarAdminPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoAdminProLayout = new javax.swing.GroupLayout(panelCuerpoAdminPro);
        panelCuerpoAdminPro.setLayout(panelCuerpoAdminProLayout);
        panelCuerpoAdminProLayout.setHorizontalGroup(
            panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panelCuerpoAdminProLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnActualizarAdminPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarAdminPro)
                .addGap(42, 42, 42))
        );
        panelCuerpoAdminProLayout.setVerticalGroup(
            panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoAdminProLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarAdminPro)
                    .addComponent(btnEliminarAdminPro))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabeceraAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabeceraAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductosAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosAdminMouseClicked
        //********************************************************************
        //definicion de variables
        //********************************************************************
        Integer filaSeleccionada;
        Long codProducto;
        String nombreProducto, referenciaProducto;
        Double temperaturaProducto, valorBaseProducto;
        //********************************************************************
        filaSeleccionada = tablaProductosAdmin.getSelectedRow();

        codProducto = Long.parseLong(miTablita.getValueAt(filaSeleccionada, 0).toString());
        nombreProducto = miTablita.getValueAt(filaSeleccionada, 1).toString();
        referenciaProducto = miTablita.getValueAt(filaSeleccionada, 2).toString();
        temperaturaProducto = Double.parseDouble(miTablita.getValueAt(filaSeleccionada, 3).toString());
        valorBaseProducto = Double.parseDouble(miTablita.getValueAt(filaSeleccionada, 4).toString());

        txtCajaCodigoAdminPro.setText(codProducto.toString());
        txtCajaNombreAdminPro.setText(nombreProducto);
        txtCajaReferenciaAdminPro.setText(referenciaProducto);
        txtCajaTemperaturaAdminPro.setText(temperaturaProducto.toString());
        txtCajaValorBaseAdminPro.setText(valorBaseProducto.toString());
    }//GEN-LAST:event_tablaProductosAdminMouseClicked

    private void limpiarTabla(){
        for (int i = 0; i < tablaProductosAdmin.getRowCount(); i++) {
            miTablita.removeRow(i);
            i -= 1;
        }
    }
    
    private void limpiarCajas(){
        txtCajaCodigoAdminPro.setText("");
        txtCajaNombreAdminPro.setText("");
        txtCajaReferenciaAdminPro.setText("");
        txtCajaTemperaturaAdminPro.setText("");
        txtCajaValorBaseAdminPro.setText("");
    }
    
    private void btnEliminarAdminProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminProActionPerformed
        //*********************************************************
        //definicion de variables
        //*********************************************************
        Long codProducto;
        DaoProducto objDaoProducto;
        Producto objProducto;
        //*********************************************************
        //*********************************************************
        //capturar valores de las cajas de texto
        //*********************************************************
        codProducto = Long.parseLong(txtCajaCodigoAdminPro.getText());
        //*********************************************************
        //*********************************************************
        //creacion de objetos
        //*********************************************************
        objDaoProducto = new DaoProducto();
        objProducto = new Producto();
        //*********************************************************
        objProducto.setCodProducto(codProducto);

        if (objDaoProducto.borrar(objProducto)) {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "EXITO: Registro eliminado correctamente.");
            limpiarTabla();
            cargarDatoTabla();
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "ERROR: Registro NO eliminado correctamente.");
        }

    }//GEN-LAST:event_btnEliminarAdminProActionPerformed

    private void btnActualizarAdminProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminProActionPerformed
        //*************************************************************
        //definicion de variables
        //*************************************************************
        Long cajaCodProducto;
        String cajaNombre, cajaReferencia;
        Double cajaTemperatura, cajaValorBase;
        DaoProducto objDaoProducto;
        Producto objProducto;
        //*************************************************************
        //*************************************************************
        //capturar informacion 
        //*************************************************************
        cajaNombre = txtCajaNombreAdminPro.getText();
        cajaReferencia = txtCajaReferenciaAdminPro.getText();
        cajaTemperatura = Double.parseDouble(txtCajaTemperaturaAdminPro.getText());
        cajaValorBase = Double.parseDouble(txtCajaValorBaseAdminPro.getText());
        cajaCodProducto = Long.parseLong(txtCajaCodigoAdminPro.getText());
        //**************************************************************
        if (cajaNombre.isEmpty() || cajaReferencia.isEmpty() || cajaTemperatura == 0 || cajaValorBase == 0) {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "Todos los valores son obligatorios.");
        } else {
            //******************************************************************
            //creacion de objetos
            //******************************************************************
            objDaoProducto = new DaoProducto();
            objProducto = new Producto();
            //******************************************************************
            objProducto.setNombre(cajaNombre);
            objProducto.setId(cajaReferencia);
            objProducto.setTemperatura(cajaTemperatura);
            objProducto.setValorBase(cajaValorBase);
            objProducto.setCodProducto(cajaCodProducto);

            if (objDaoProducto.actualizar(objProducto)) {
                JOptionPane.showMessageDialog(panelCuerpoAdminPro, "EXITO: Registro actualizado correctamente.");
                limpiarCajas();
                limpiarTabla();
                cargarDatoTabla();
            } else {
                JOptionPane.showMessageDialog(panelCuerpoAdminPro, "ERROR: Registro NO FUE actualizado correctamente.");
            }
            
        }
    }//GEN-LAST:event_btnActualizarAdminProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAdminPro;
    private javax.swing.JButton btnEliminarAdminPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoAdminPro;
    private javax.swing.JLabel lblNombreAdminPro;
    private javax.swing.JLabel lblReferenciaAdminPro;
    private javax.swing.JLabel lblTemperaturaAdminPro;
    private javax.swing.JPanel panelCabeceraAdminPro;
    private javax.swing.JPanel panelCuerpoAdminPro;
    private javax.swing.JTable tablaProductosAdmin;
    private javax.swing.JTextField txtCajaCodigoAdminPro;
    private javax.swing.JTextField txtCajaNombreAdminPro;
    private javax.swing.JTextField txtCajaReferenciaAdminPro;
    private javax.swing.JTextField txtCajaTemperaturaAdminPro;
    private javax.swing.JTextField txtCajaValorBaseAdminPro;
    private javax.swing.JLabel txtValorBaseAdminPro;
    // End of variables declaration//GEN-END:variables
}
