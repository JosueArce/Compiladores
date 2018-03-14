/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.parte.pkg1;

import generated.Parser2;
import generated.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.text.Element;

/**
 *
 * @author Daniel
 */
public class Ventana extends javax.swing.JFrame {
    
    File archivo;
    public Ventana() {
        initComponents();
        
        archivo= new File("test.txt");
        
        btnRun.setOpaque(false);
        btnRun.setContentAreaFilled(false);
        btnRun.setBorderPainted(false);
        btnRun.setToolTipText("Compilar");
        
        btnLoad.setOpaque(false);
        btnLoad.setContentAreaFilled(false);
        btnLoad.setBorderPainted(false);
        btnLoad.setToolTipText("Cargar Archivo");
        
        btnAST.setOpaque(false);
        btnAST.setContentAreaFilled(false);
        btnAST.setBorderPainted(false);
        btnAST.setToolTipText("Generar AST");
        txtCodigo.setText("hola esto es un \n ejemplo");
        //txtCodigo.setMinimumSize(new Dimension(200, 200));
        
        //JScrollPane scroll = new JScrollPane(txtCodigo);
        TextLineNumber tln = new TextLineNumber(txtCodigo);
        scroll.setRowHeaderView(tln);
        
        /*
        JPanel gridCodigoYNumLinea = new JPanel();
        //gridCodigoYNumLinea.setMaximumSize(new Dimension(this.getWidth(), this.getHeight()/2));
        //gridCodigoYNumLinea.setMinimumSize(gridCodigoYNumLinea.getMaximumSize());
        gridCodigoYNumLinea.setLayout(new GridLayout(1,2));
        gridCodigoYNumLinea.add(scroll,BorderLayout.WEST);
        gridCodigoYNumLinea.add(txtCodigo,BorderLayout.EAST);
        
        //JPanel gridConsola = new JPanel();
        //gridConsola.setLayout(new GridLayout(1, 1));
        //gridConsola.add(txtConsola,BorderLayout.CENTER);
        
        JPanel gridBotones = new JPanel();
        gridBotones.setLayout(new GridLayout(1, 4));
        gridBotones.add(btnInterpretarInstrucciones);
        gridBotones.add(btnRun);
        gridBotones.add(btnLoad);
        gridBotones.add(btnAST);
        
        JPanel todos = new JPanel();
        todos.add(new JScrollPane(gridCodigoYNumLinea));
        //todos.add(gridConsola);
        todos.add(gridBotones);
        
        this.setLayout(new BorderLayout());
        this.add(todos,BorderLayout.CENTER);
        //this.add(gridConsola,BorderLayout.AFTER_LAST_LINE);
        //this.add(gridBotones,BorderLayout.AFTER_LAST_LINE);
        */
    }

    
    public static int getLineAtCaret(JTextArea component)
	{
		int caretPosition = component.getCaretPosition();
		Element root = component.getDocument().getDefaultRootElement();

		return root.getElementIndex( caretPosition ) + 1;
	}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        btnRun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnAST = new javax.swing.JButton();
        btnInterpretarInstrucciones = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        scroll = new javax.swing.JScrollPane(txtCodigo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Sintáctico");

        txtConsola.setEditable(false);
        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/Start.png"))); // NOI18N
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel1.setText("Consola:");

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/folder.png"))); // NOI18N
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/tree.png"))); // NOI18N
        btnAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASTActionPerformed(evt);
            }
        });

        btnInterpretarInstrucciones.setText("Interpretar Instrucciones");

        jScrollPane3.setViewportView(txtCodigo);

        scroll.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnInterpretarInstrucciones)
                        .addContainerGap(650, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAST, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInterpretarInstrucciones)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        txtConsola.setText("Running...\n");

        try
        {
            FileWriter pw = new FileWriter ("test.txt");
            txtCodigo.write(pw);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Scanner scanner = null;
        Parser2 parser = null;
        ANTLRInputStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = new ANTLRInputStream(new FileReader("test.txt"));//archivo.getAbsolutePath()));
            scanner = new Scanner(input);
            tokens = new CommonTokenStream(scanner);
            parser = new Parser2(tokens);
        }
        catch(Exception e){System.out.println("No hay archivo");}

        List<Token> lista = (List<Token>) scanner.getAllTokens();

        for (Token t : lista)

            txtConsola.append(t.getType() + ":" + t.getText() + "\n");
        scanner.reset();

        try{
            ParseTree tree = parser.program();
        }catch (RecognitionException e){
            txtConsola.append("Compilacion Fallida!");
        }
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        JFileChooser cargar = new JFileChooser();
        cargar.showOpenDialog(null);
        archivo = cargar.getSelectedFile();
        if(archivo.getName()!=null){
            
        }
        try
                {
                    String nombreArchivo = archivo.getName();
                    String path = archivo.getAbsolutePath();
                    txtConsola.setText("\nSe ha abierto el archivo "+nombreArchivo+" desde "+path);
                    FileReader reader = new FileReader( archivo.getAbsolutePath() );
                    BufferedReader br = new BufferedReader(reader);
                    txtCodigo.read( br, null );
                    br.close();
                    txtCodigo.requestFocus();
                }
                catch(Exception e2) { System.out.println(e2); }
        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASTActionPerformed
        txtConsola.append("\nCargando AST...");
        AST ast = new AST(this, rootPaneCheckingEnabled);
        ast.setVisible(true);
    }//GEN-LAST:event_btnASTActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAST;
    private javax.swing.JButton btnInterpretarInstrucciones;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
