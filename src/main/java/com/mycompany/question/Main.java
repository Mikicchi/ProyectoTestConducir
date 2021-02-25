/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question;

import com.formdev.flatlaf.FlatDarkLaf;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.BorderLayout;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alumno Tarde
 */
public class Main extends javax.swing.JFrame {
    
    private String archivo;
    private ArrayList<Question> panelPregunta;
    private int preguntaAct;
    private List<Pregunta> preguntas;
    
    /**
     * Creates new form Main
     */
    public Main() {
        FlatDarkLaf.install();       
        initComponents();
        preguntaAct = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincial = new javax.swing.JPanel();
        abrirIniciar = new javax.swing.JButton();
        navBar = new javax.swing.JPanel();
        barraProgreso = new javax.swing.JProgressBar();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(424, 450));

        pPrincial.setPreferredSize(new java.awt.Dimension(400, 400));

        abrirIniciar.setText("Abrir...");
        abrirIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirIniciarActionPerformed(evt);
            }
        });

        navBar.setEnabled(true);
        navBar.setMaximumSize(new java.awt.Dimension(380, 67));
        navBar.setPreferredSize(new java.awt.Dimension(380, 67));
        navBar.setVisible(false);

        barraProgreso.setMaximumSize(new java.awt.Dimension(400, 4));
        barraProgreso.setPreferredSize(new java.awt.Dimension(400, 4));

        URL imageResource = Main.class.getClassLoader().getResource("left-arrow.png");
        anterior.setIcon(new ImageIcon(imageResource));
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        URL imageResource = Main.class.getClassLoader().getResource("right-arrow.png");
        siguiente.setIcon(new ImageIcon(imageResource));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        finalizar.setText("Finalizar");
        finalizar.setMaximumSize(new java.awt.Dimension(73, 38));
        finalizar.setMinimumSize(new java.awt.Dimension(73, 38));
        finalizar.setPreferredSize(new java.awt.Dimension(83, 38));
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarLayout.createSequentialGroup()
                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
            .addComponent(barraProgreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarLayout.createSequentialGroup()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout pPrincialLayout = new javax.swing.GroupLayout(pPrincial);
        pPrincial.setLayout(pPrincialLayout);
        pPrincialLayout.setHorizontalGroup(
            pPrincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincialLayout.createSequentialGroup()
                .addGroup(pPrincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincialLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(abrirIniciar))
                    .addGroup(pPrincialLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pPrincialLayout.setVerticalGroup(
            pPrincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincialLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(abrirIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincial, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincial, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirIniciarActionPerformed
        abrirIniciar();
    }//GEN-LAST:event_abrirIniciarActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if(preguntaAct > 0) {
            Question panel = panelPregunta.get(preguntaAct);
            panel.setVisible(false);
            preguntaAct--;
            panel = panelPregunta.get(preguntaAct);
            pPrincial.add(panel, BorderLayout.CENTER);
            panel.setVisible(true);
            this.repaint();
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if(preguntaAct < panelPregunta.size() - 1) {
            Question panel = panelPregunta.get(preguntaAct);
            panel.setVisible(false);
            preguntaAct++;
            panel = panelPregunta.get(preguntaAct);
            pPrincial.add(panel, BorderLayout.CENTER);
            panel.setVisible(true);
            this.repaint();
            
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        int puntuacion = 0;
        for (int i = 0; i < panelPregunta.size() ; i++) {
            String preguntaSeleccionada = panelPregunta.get(i).preguntaEscogida();
            String preguntaCorrecta = "<html>" + preguntas.get(i).getPreguntaCorrecta() + "</html>";
            if(preguntaSeleccionada.equals(preguntaCorrecta)) {
                puntuacion++;
            }
        }
        int confirmacion = JOptionPane.showConfirmDialog(this, "Aciertos = " + puntuacion + "/" + panelPregunta.size() + "\n¿Deseas cargar otro test?");
        if (confirmacion == JOptionPane.OK_OPTION) {
            reset();
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_finalizarActionPerformed
    
    private void reset() {
        navBar.setVisible(false);
        for (Question panel : panelPregunta) {
            pPrincial.remove(panel);
        }
        panelPregunta.clear();
        this.setSize(444, 470);
        pPrincial.repaint();
        abrirIniciar.setText("Abrir...");
        abrirIniciar.setVisible(true);
        preguntaAct = 0;
    }
    
    private void abrirIniciar() {
        if(abrirIniciar.getText().equals("Abrir...")) {   
            JFileChooser arch = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("json", "JSON");
            arch.setFileFilter(filtro);
            if(arch.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                archivo = arch.getSelectedFile().getAbsolutePath();
                abrirIniciar.setText("Iniciar Test");
            }
            
        } else {
            generarPreguntas();
        }
    }
    
    private void generarPreguntas() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            
            preguntas = Arrays.asList(mapper.readValue(new File(archivo), Pregunta[].class));
            Collections.shuffle(preguntas);
            
            panelPregunta = new ArrayList<>();
            
            int numPregunta = 1;
            for (Pregunta pregunta : preguntas) {
                pregunta.aleatorizar();
                Question panel = new Question(pregunta.getEnunciado(), pregunta.getPregunta1(), pregunta.getPregunta2(), pregunta.getPregunta3(), pregunta.getPregunta4(), numPregunta);
                panelPregunta.add(panel);
                numPregunta++;
            }
            mostrarPregunta();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void mostrarPregunta() {
        
        if(abrirIniciar.isVisible()){
            this.setSize(424, 450);
            pPrincial.setLayout(new BorderLayout());
            abrirIniciar.setVisible(false);
            Question panel = panelPregunta.get(preguntaAct);
            pPrincial.add(panel, BorderLayout.CENTER);
            panel.setVisible(true);
            panel.setSize(400, 305);
            navBar.setVisible(true);
            pPrincial.add(navBar, BorderLayout.SOUTH);
            pPrincial.repaint();
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirIniciar;
    private javax.swing.JButton anterior;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton finalizar;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel pPrincial;
    public javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

