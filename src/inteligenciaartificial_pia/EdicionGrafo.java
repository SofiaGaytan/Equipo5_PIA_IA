/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author ASUS
 */
public class EdicionGrafo extends javax.swing.JFrame {

    public static Grafo auxiliar = new Grafo();
    public static ArrayList<String> visitados = new ArrayList<>();

    Grafo grafo = new Grafo();
    ArrayList<Nodo> seleccionados = new ArrayList<>();
    ArrayList<Nodo> borrados = new ArrayList<>();
    Map<String, Float> adyacentes = new TreeMap<>();
    Nodo seleccionado;
    
    boolean dibujar = false;
    boolean makeLine = false;
    boolean line = false;
    boolean borrar = false;
    boolean limpiar = false;
    
    public static boolean algoritmo_informado = true; //False para algoritmo no informado (Algoritmo de costo uniforme), True para algortimo informado (Algoritmo A*).
    
    int count = 0;

    /**
     * Creates new form EdicionGrafo
     */
    public EdicionGrafo() {
        initComponents();
        panel.setSize(500, 500);
        ver.setVisible(false);
        cancelar.setVisible(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g.create();
        for (Arista a : grafo.getAristas()) {
            g2.setColor(a.getColor());
            g2.drawString(String.valueOf(a.getTamaño()), a.xt, a.yt);
            g2.draw(a.getArista());
        }
        for (Nodo nodo : grafo.getNodos()) {
            g2.setColor(nodo.getColor());
            g2.fill(nodo.getNodo());
            g2.setColor(Color.white);
            if (nodo.getNum() < 10) {
                g2.drawString(String.valueOf(nodo.getNum()), nodo.getNodo().getBounds().x + 7, nodo.getNodo().getBounds().y + 15);
            } else {
                g2.drawString(String.valueOf(nodo.getNum()), nodo.getNodo().getBounds().x + 3, nodo.getNodo().getBounds().y + 15);
            }
        }

        g2.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dibujarN = new javax.swing.JToggleButton();
        eraserN = new javax.swing.JToggleButton();
        clear = new javax.swing.JButton();
        dibujarA = new javax.swing.JToggleButton();
        download = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        algoritmo = new javax.swing.JButton();
        resultadoText = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        resultadoPanel = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextPane();
        ver = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        dibujarN.setText("Dibujar nodo");
        dibujarN.setFocusable(false);
        dibujarN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dibujarN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dibujarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibujarNActionPerformed(evt);
            }
        });

        eraserN.setText("Borrar nodo");
        eraserN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserNActionPerformed(evt);
            }
        });

        clear.setText("Limpiar");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        dibujarA.setText("Dibujar arista");
        dibujarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibujarAActionPerformed(evt);
            }
        });

        download.setText("Descargar imagen");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        algoritmo.setText("Aplicar Algoritmo");
        algoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoritmoActionPerformed(evt);
            }
        });

        resultadoText.setText("Resultado");

        cancelar.setText("Salir");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultadoPanel.setViewportView(resultado);

        ver.setText("Ver solución");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultadoPanel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dibujarN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dibujarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eraserN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(download, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(algoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(resultadoText))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dibujarN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dibujarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eraserN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(download)
                        .addGap(33, 33, 33)
                        .addComponent(algoritmo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resultadoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(resultadoPanel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dibujarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibujarNActionPerformed
        if (makeLine) {
            makeLine = false;
            dibujarA.setSelected(false);
        } else if (borrar) {
            borrar = false;
            eraserN.setSelected(false);
        } else if (limpiar) {
            limpiar = false;
            clear.setSelected(false);
        }
        dibujar = !dibujar;
    }//GEN-LAST:event_dibujarNActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        if (dibujar) {
            dibujar = false;
            dibujarN.setSelected(false);
        } else if (makeLine) {
            makeLine = false;
            dibujarA.setSelected(false);
        } else if (borrar) {
            borrar = false;
            eraserN.setSelected(false);
        }
        grafo.setNodos(new ArrayList<Nodo>());
        grafo.setAristas(new ArrayList<Arista>());
        limpiar = !limpiar;
        repaint();
    }//GEN-LAST:event_clearActionPerformed

    private void dibujarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibujarAActionPerformed
        if (grafo.getNodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El grafo no tiene nodos.");
            dibujarA.setSelected(false);
        } else {
            if (dibujar) {
                dibujar = false;
                dibujarN.setSelected(false);
            } else if (borrar) {
                borrar = false;
                eraserN.setSelected(false);
            } else if (limpiar) {
                limpiar = false;
                clear.setSelected(false);
            }
            desSeleccionar();
            makeLine = !makeLine;
        }
    }//GEN-LAST:event_dibujarAActionPerformed

    private void eraserNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserNActionPerformed
        if (grafo.getNodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El grafo no tiene nodos.");
            eraserN.setSelected(false);
        } else {
            if (dibujar) {
                dibujar = false;
                dibujarN.setSelected(false);
            } else if (makeLine) {
                makeLine = false;
                dibujarA.setSelected(false);
            } else if (limpiar) {
                limpiar = false;
                clear.setSelected(false);
            }
            desSeleccionar();
            borrar = !borrar;
        }
    }//GEN-LAST:event_eraserNActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if (dibujar) {
            try {
                for (Nodo nodo : grafo.getNodos()) {
                    if (nodo.getNodo().contains(new Point(evt.getX() + 34, evt.getY() + 80))) {
                        throw new Error("Espacio ocupado");
                    }
                }
                int numero = 0;
                if (!grafo.getNodos().isEmpty()) {
                    if (!borrados.isEmpty()) {
                        numero = borrados.get(0).getNum();
                        borrados.remove(0);
                    } else {
                        int max = 0;
                        for (Nodo nodo : grafo.getNodos()) {
                            if (nodo.getNum() > max) {
                                max = nodo.getNum();
                            }
                        }
                        numero = max + 1;
                    }
                }
                grafo.getNodos().add(new Nodo(new Ellipse2D.Double(evt.getX() + 24, evt.getY() + 70, 20, 20), Color.black, numero));
            } catch (Error e) {
                JOptionPane.showMessageDialog(rootPane, e.getLocalizedMessage());
            }
        } else if (makeLine) {
            if (seleccionados.size() < 2) {
                Color color;
                for (Nodo nodo : grafo.getNodos()) {
                    color = nodo.getColor();
                    if (color == Color.black) {
                        color = Color.red;
                    } else {
                        color = Color.black;
                    }
                    if (nodo.getNodo().contains(new Point(evt.getX() + 34, evt.getY() + 80))) {
                        nodo.setColor(color);
                        seleccionados.add(nodo);
                    }
                }
            }
        } else if (borrar) {
            Color seleccionadoColor = Color.blue;
            for (Nodo nodo : grafo.getNodos()) {
                if (nodo.getNodo().contains(new Point(evt.getX() + 34, evt.getY() + 80))) {
                    nodo.setColor(seleccionadoColor);
                    repaint();
                    int decision = JOptionPane.showConfirmDialog(rootPane, "¿Quiere eliminar al nodo " + nodo.getNum() + "?");
                    if (decision == 0) {
                        seleccionado = nodo;
                        break;
                    } else {
                        desSeleccionar();
                    }
                }
            }
        }
        repaint();
        if (seleccionados.size() == 2) {
            for (Arista a : grafo.getAristas()) {
                if ((a.getNodos().get(0).equals(seleccionados.get(0)) && a.getNodos().get(1).equals(seleccionados.get(1))) || (a.getNodos().get(1).equals(seleccionados.get(0)) && a.getNodos().get(0).equals(seleccionados.get(1)))) {
                    line = true;
                }
            }
            if (line) {
                JOptionPane.showMessageDialog(rootPane, "Arista repetida");
                line = false;
            } else {
                String tam = "";
                while (tam.isEmpty()) {
                    tam = JOptionPane.showInputDialog("Tamaño de la Arista:");
                }
                if (tam != null) {
                    if (seleccionados.get(0) == seleccionados.get(1)) {
                        grafo.agregarArista2(seleccionados, tam);
                        repaint();
                    } else {
                        grafo.agregarArista(seleccionados, tam);
                        repaint();
                    }
                }
            }
            desSeleccionar();
        }
        if (seleccionado != null) {
            borrados.add(seleccionado);
            grafo.eliminarNodo(seleccionados, seleccionado);
            repaint();
            desSeleccionar();
        }
        obtenerAdyacentes();
    }//GEN-LAST:event_panelMouseClicked

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        auxiliar = grafo;
        Imagen i = new Imagen();
        i.setTitle("Imagen Descargada");
        i.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        i.setVisible(true);
    }//GEN-LAST:event_downloadActionPerformed

    private void algoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoritmoActionPerformed
       if (grafo.getNodos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Dibuje un grafo");
        } else {

            dibujarN.setEnabled(false);
            dibujarA.setEnabled(false);
            eraserN.setEnabled(false);
            clear.setEnabled(false);
            algoritmo.setVisible(false);

            dibujar = false;
            makeLine = false;
            line = false;
            borrar = false;
            limpiar = false;

            cancelar.setVisible(true);

            auxiliar = grafo;
            Solucion solucion = new Solucion();
            solucion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            solucion.setVisible(true);
        }
    }//GEN-LAST:event_algoritmoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dibujarN.setEnabled(true);
        dibujarA.setEnabled(true);
        eraserN.setEnabled(true);
        clear.setEnabled(true);
        algoritmo.setVisible(true);

        resultado.setText("");

        descolorear();

        ver.setVisible(false);
        cancelar.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        colorearNodos();
    }//GEN-LAST:event_verActionPerformed

    public void desSeleccionar() {
        seleccionados = new ArrayList<>();
        seleccionado = null;
        for (Nodo n : grafo.getNodos()) {
            n.setColor(Color.black);
        }
        repaint();
    }

    public void obtenerAdyacentes() {
        for (Nodo nodo : grafo.getNodos()) {
            nodo.setEdges(new ArrayList<>());
            for (Arista a : grafo.getAristas()) {
                if (a.getNodos().get(0).equals(nodo)) {
                    adyacentes.put(String.valueOf(a.getNodos().get(1).getNum()), a.getTamaño());
                    nodo.addEdge(a.getNodos().get(1), a.getTamaño());
                } else if (a.getNodos().get(1).equals(nodo)) {
                    adyacentes.put(String.valueOf(a.getNodos().get(0).getNum()), a.getTamaño());
                    nodo.addEdge(a.getNodos().get(0), a.getTamaño());
                }
            }
            nodo.setAdyacentes(adyacentes);
            adyacentes = new TreeMap<>();
        }
    }
    
    private void colorearNodos() {
        for (String visitado : visitados) {
            for (Nodo nodo : grafo.getNodos()) {
                if (String.valueOf(nodo.getNum()).equals(visitado)) {
                    nodo.setColor(Color.RED);
                }
            }
        }
        repaint();
    }

    private void descolorear() {
        for (Nodo nodo : grafo.getNodos()) {
            nodo.setColor(Color.black);
        }
        repaint();
    }
    
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
            java.util.logging.Logger.getLogger(EdicionGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton algoritmo;
    public static javax.swing.JButton cancelar;
    private javax.swing.JButton clear;
    private javax.swing.JToggleButton dibujarA;
    private javax.swing.JToggleButton dibujarN;
    private javax.swing.JButton download;
    private javax.swing.JToggleButton eraserN;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextPane resultado;
    private javax.swing.JScrollPane resultadoPanel;
    private javax.swing.JLabel resultadoText;
    public static javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
