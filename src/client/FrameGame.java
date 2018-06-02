/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import dao.HighScoreDAO;
import dao.PemainDAO;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.DefaultListModel;
import transferObject.HighScore;
import transferObject.Pemain;

/**
 *
 * @author Ikhsan
 */
public class FrameGame extends javax.swing.JDialog {

    DefaultListModel<String> dlm;
    int randomInt, nyawa, skor, level, batasAtas, batasBawah;
    double probabilitas;

    PemainDAO pemainDAO;
    HighScoreDAO highScoreDAO;
    /**
     * Creates new form FrameGame
     */
    public FrameGame(java.awt.Frame parent, boolean modal, String namaPemainMasuk) {
        super(parent, modal);
        initComponents();

        dlm = new DefaultListModel<>();
        pemainDAO = new PemainDAO();
        highScoreDAO = new HighScoreDAO();
        jList1.setModel(dlm);
        jLabel_pemainMasuk.setText(namaPemainMasuk);

        reset();
    }

    public void reset() {
        dlm.clear();
        level = 1;
        nyawa = 4;
        skor = 0;
        jTextField_tebak.setText("");
        jLabel_skor.setText("" + skor);
        jLabel_nyawa.setText("" + nyawa);
        jLabel_level.setText("" + level);

        dlm.addElement("Mari mulai permainan");
        generateRandom(level);
    }

    public void hitungProbabilitas(int batasBawah, int batasAtas) {
        probabilitas = (double) 1 / ((batasAtas - batasBawah) + 1);
        probabilitas = probabilitas * 100;
        dlm.addElement("");
        dlm.addElement("Probabilitas benar: " + probabilitas + "%");
    }

    // Menampilkan form register
    public void frameGame() {
        setVisible(true);
        setLocationRelativeTo(getParent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_pemainMasuk = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_skor = new javax.swing.JLabel();
        jTextField_tebak = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_nyawa = new javax.swing.JLabel();
        jButton_kembali = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_level = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_pemainMasuk.setText("Pemain Masuk");

        jLabel2.setText("Nama:");

        jLabel3.setText("Skor:");

        jLabel_skor.setText("000");

        jTextField_tebak.setText("000");
        jTextField_tebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tebakActionPerformed(evt);
            }
        });
        jTextField_tebak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_tebakKeyPressed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setText("GUESS NUMBER GAME");

        jLabel4.setText("Nyawa:");

        jLabel_nyawa.setText("0");

        jButton_kembali.setText("Kembali");
        jButton_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_kembaliActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jLabel5.setText("Level: ");

        jLabel_level.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_tebak, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_reset))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_kembali)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_pemainMasuk)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_skor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_nyawa)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_level)))
                                .addGap(0, 37, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pemainMasuk)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_skor)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_nyawa)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_level))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_tebak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_kembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_kembaliActionPerformed

    private void jTextField_tebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tebakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tebakActionPerformed

    private void jTextField_tebakKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tebakKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (nyawa > 0) {
                try {
                    int input = Integer.parseInt(jTextField_tebak.getText());
                    if (input >= batasBawah && input <= batasAtas) {
                        if (input == randomInt) {
                            nextLevel();
                        } else if (input > randomInt) {
                            if (input <= batasAtas) {
                                batasAtas = input - 1;
                                dlm.clear();
                                dlm.addElement("Coba lebih kecil dari " + input);
                                dlm.addElement("Antara: " + batasBawah + " - " + batasAtas);
                                hitungProbabilitas(batasBawah, batasAtas);
                                nyawa--;
                                jLabel_nyawa.setText("nyawa: " + nyawa);
                            }
                        } else if (input < randomInt) {
                            if (input >= batasBawah) {
                                batasBawah = input + 1;
                                dlm.clear();
                                dlm.addElement("Coba lebih besar dari " + input);
                                dlm.addElement("Antara: " + batasBawah + " - " + batasAtas);
                                hitungProbabilitas(batasBawah, batasAtas);
                                nyawa--;
                                jLabel_nyawa.setText("nyawa: " + nyawa);
                            }
                        }
                    } else {
                        dlm.clear();
                        dlm.addElement("Masukkan dalam range: " + batasBawah + " - " + batasAtas);
                    }
                } catch (NumberFormatException e) {
                    dlm.addElement("Tebak dengan angka");
                }

            }
            if (nyawa == 0) {
                dlm.addElement("Nyawa habis, jawabannya adalah: " + randomInt);
                simpanSkor();
            };
            jTextField_tebak.setText("");
        }
    }//GEN-LAST:event_jTextField_tebakKeyPressed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton_resetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_kembali;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_level;
    private javax.swing.JLabel jLabel_nyawa;
    private javax.swing.JLabel jLabel_pemainMasuk;
    private javax.swing.JLabel jLabel_skor;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_tebak;
    // End of variables declaration//GEN-END:variables

    private void nextLevel() {
        dlm.clear();
        dlm.addElement("Selamat jawaban anda benar, angka randomnya adalah: " + randomInt);
        dlm.addElement("Anda mendapat skor berdasarkan nyawa yang tersisa");
        dlm.addElement("Anda mendapat 3 nyawa tambahan");
        level = level + 1;
        generateRandom(level);
        skor = skor + nyawa;
        nyawa = nyawa + 2;

        jLabel_skor.setText("" + skor);
        jLabel_nyawa.setText("" + nyawa);
        jLabel_level.setText("" + level);
    }

    private void simpanSkor() {
        HighScore highscore = highScoreDAO.makeHighScoreObj();
        String namaPemain = (String) jLabel_pemainMasuk.getText();
        Pemain pemainDipilih = pemainDAO.selectByNama(namaPemain);
//        highscore.setId(Integer.parseInt(jTextFieldTambahId.getText()));
        highscore.setPemain(pemainDipilih);
        highscore.setSkor(Integer.parseInt(jLabel_skor.getText()));        
        pemainDAO = new PemainDAO();

        if (highscore.getSkor()!=0) {
            highScoreDAO.insert(highscore);
            dispose();
        }
    }

    private void generateRandom(int level) {
        Random r = new Random();
        int min = 1;
        int max = 10 * level;
        batasAtas = max;
        batasBawah = min;

        randomInt = min + (int) (Math.random() * ((max - min) + 1));
        dlm.addElement("Tebak bilangan antara " + min + "- " + max);
        dlm.addElement("");
        hitungProbabilitas(batasBawah, batasAtas);
//        kunci jawaban
        System.out.println(randomInt);
    }
}
