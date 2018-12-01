/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandupa
 */
public class BuyingGUI extends javax.swing.JFrame {

    String owner;
    String type;
    String county;
    int bedrooms;
    int bathrooms;
    double fixed_price;
    double mortgage_price;
    int years;
    double total;

    Housing h;
    ArrayList<Fixed> fList = new ArrayList();
    ArrayList<Mortgage> mList = new ArrayList();

    /**
     * Creates new form BuyingGUI
     */
    public BuyingGUI() {
        initComponents();
        mpriceLbl.setEnabled(false);
        mpriceTf.setEnabled(false);
        fpriceLbl.setEnabled(false);
        fpriceTf.setEnabled(false);
        yearsLbl.setEnabled(false);
        yearsTf.setEnabled(false);
        fviewBtn.setEnabled(false);
        addBtn.setEnabled(false);
        searchBtn.setEnabled(false);
        deleteBtn.setEnabled(false);

        readFromFixed();
        readFromMortgage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        ownerLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        countyLbl = new javax.swing.JLabel();
        bedroomLbl = new javax.swing.JLabel();
        bathroomLbl = new javax.swing.JLabel();
        mpriceLbl = new javax.swing.JLabel();
        yearsLbl = new javax.swing.JLabel();
        ownerTf = new javax.swing.JTextField();
        bedroomTf = new javax.swing.JTextField();
        bathroomTf = new javax.swing.JTextField();
        mpriceTf = new javax.swing.JTextField();
        yearsTf = new javax.swing.JTextField();
        countyCb = new javax.swing.JComboBox<>();
        fixedBtn = new javax.swing.JButton();
        mortgageBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        fviewBtn = new javax.swing.JButton();
        typeCb = new javax.swing.JComboBox<>();
        ownerLbl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fpriceLbl = new javax.swing.JLabel();
        fpriceTf = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(98, 0, 238));

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUYING");

        backBtn.setBackground(new java.awt.Color(187, 134, 252));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backBtn)
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        ownerLbl.setText("Owner:");

        typeLbl.setText("Type:");

        countyLbl.setText("County:");

        bedroomLbl.setText("Bedrooms:");

        bathroomLbl.setText("Bathrooms:");

        mpriceLbl.setText("Mortgage Price:");

        yearsLbl.setText("Years:");

        bathroomTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathroomTfActionPerformed(evt);
            }
        });

        countyCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow" }));

        fixedBtn.setBackground(new java.awt.Color(187, 134, 252));
        fixedBtn.setText("Fixed Price");
        fixedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedBtnActionPerformed(evt);
            }
        });

        mortgageBtn.setBackground(new java.awt.Color(187, 134, 252));
        mortgageBtn.setText("Mortgage");
        mortgageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mortgageBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(187, 134, 252));
        addBtn.setText("Add Record");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        fviewBtn.setBackground(new java.awt.Color(187, 134, 252));
        fviewBtn.setText("View Record");
        fviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fviewBtnActionPerformed(evt);
            }
        });

        typeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Apartment", "Studio", "Flat" }));

        ownerLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ownerLbl1.setText("Choose an Option!");

        fpriceLbl.setText("Fixed Price:");

        searchBtn.setBackground(new java.awt.Color(187, 134, 252));
        searchBtn.setText("Search Record");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(187, 134, 252));
        deleteBtn.setText("Delete Record");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bathroomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bathroomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bedroomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bedroomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(countyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(countyCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(typeCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ownerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ownerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fpriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fpriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mpriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mpriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yearsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(fixedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mortgageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownerTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownerLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fixedBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countyCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mortgageBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedroomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedroomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bathroomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bathroomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fpriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fpriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fviewBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mpriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(562, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bathroomTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathroomTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathroomTfActionPerformed

    private void fviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fviewBtnActionPerformed
        if (h instanceof Fixed) {
            for (Fixed i : fList) {
                JOptionPane.showMessageDialog(null, i.printDetails());
            }
        }

        if (h instanceof Mortgage) {
            for (Mortgage i : mList) {
                JOptionPane.showMessageDialog(null, i.printDetails());
            }
        }
    }//GEN-LAST:event_fviewBtnActionPerformed

    private void fixedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedBtnActionPerformed
        fpriceLbl.setEnabled(true);
        fpriceTf.setEnabled(true);
        fviewBtn.setEnabled(true);
        addBtn.setEnabled(true);
        searchBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        mpriceLbl.setEnabled(false);
        mpriceTf.setEnabled(false);
        yearsLbl.setEnabled(false);
        yearsTf.setEnabled(false);

        h = new Fixed();
    }//GEN-LAST:event_fixedBtnActionPerformed

    private void mortgageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mortgageBtnActionPerformed
        mpriceLbl.setEnabled(true);
        mpriceTf.setEnabled(true);
        fviewBtn.setEnabled(true);
        addBtn.setEnabled(true);
        searchBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        fpriceLbl.setEnabled(false);
        fpriceTf.setEnabled(false);
        yearsLbl.setEnabled(true);
        yearsTf.setEnabled(true);

        h = new Mortgage();
    }//GEN-LAST:event_mortgageBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (h instanceof Fixed) {
            h = new Fixed();
            h.setOwner(ownerTf.getText());
            h.setType(typeCb.getSelectedItem().toString());
            h.setCounty(countyCb.getSelectedItem().toString());
            h.setBedrooms(Integer.parseInt(bedroomTf.getText()));
            h.setBathrooms(Integer.parseInt(bathroomTf.getText()));
            ((Fixed) h).setFixed_price(Double.parseDouble(fpriceTf.getText()));

            fList.add((Fixed) h);

            writeToFixed();

            JOptionPane.showMessageDialog(null, ownerTf.getText() + " has been added to Fixed");
        }

        if (h instanceof Mortgage) {
            h = new Mortgage();
            h.setOwner(ownerTf.getText());
            h.setType(typeCb.getSelectedItem().toString());
            h.setCounty(countyCb.getSelectedItem().toString());
            h.setBedrooms(Integer.parseInt(bedroomTf.getText()));
            h.setBathrooms(Integer.parseInt(bathroomTf.getText()));
            ((Mortgage) h).setMortgage_price(Double.parseDouble(mpriceTf.getText()));
            ((Mortgage) h).setYears(Integer.parseInt(yearsTf.getText()));

            ((Mortgage) h).compute();

            mList.add((Mortgage) h);

            writeToMortgage();

            JOptionPane.showMessageDialog(null, ownerTf.getText() + " has been added to Mortgage");
        }

        ownerTf.setText("");
        typeCb.setSelectedIndex(0);
        countyCb.setSelectedIndex(0);
        bedroomTf.setText("");
        bathroomTf.setText("");
        fpriceTf.setText("");
        mpriceTf.setText("");
        yearsTf.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new HousingGUI().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if (h instanceof Fixed) {
            String searchType = JOptionPane.showInputDialog(null, "Enter Name of Owner!");

            for (int i = 0; i < fList.size(); i++) {
                if (searchType.equalsIgnoreCase(fList.get(i).getOwner())) {
                    JOptionPane.showMessageDialog(null, fList.get(i).printDetails());
                }
            }
        }

        if (h instanceof Mortgage) {
            String searchType = JOptionPane.showInputDialog(null, "Enter name of Owner");

            for (int i = 0; i < mList.size(); i++) {
                if (searchType.equalsIgnoreCase(mList.get(i).getOwner())) {
                    JOptionPane.showMessageDialog(null, mList.get(i).printDetails());
                }
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (h instanceof Fixed) {
            if (ownerTf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No value Entered!");
            } else {
                owner = ownerTf.getText();

                for (int i = 0; i < fList.size(); i++) {
                    if (fList.get(i).getOwner().equals(owner)) {
                        fList.remove(i);
                        writeToFixed();
                        JOptionPane.showMessageDialog(null, owner + " Has been Deleted!");
                        break;
                    }
                }
            }
        }

        if (h instanceof Mortgage) {
            if (ownerTf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No value Entered!");
            } else {
                owner = ownerTf.getText();

                for (int i = 0; i < mList.size(); i++) {
                    if (mList.get(i).getOwner().equals(owner)) {
                        mList.remove(i);
                        writeToMortgage();
                        JOptionPane.showMessageDialog(null, owner + " Has been Deleted!");
                        break;
                    }
                }
            }
        }
//          && fList.get(i).get()==weighting
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void writeToFixed() {
        try {
            File f = new File("fixed.data");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(fList);
            oStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void readFromFixed() {
        try {
            File f = new File("fixed.data");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);

            fList = (ArrayList<Fixed>) oStream.readObject();
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }

    public void writeToMortgage() {
        try {
            File f = new File("mortgage.data");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(mList);
            oStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void readFromMortgage() {
        try {
            File f = new File("mortgage.data");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);

            mList = (ArrayList<Mortgage>) oStream.readObject();
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
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
            java.util.logging.Logger.getLogger(BuyingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bathroomLbl;
    private javax.swing.JTextField bathroomTf;
    private javax.swing.JLabel bedroomLbl;
    private javax.swing.JTextField bedroomTf;
    private javax.swing.JComboBox<String> countyCb;
    private javax.swing.JLabel countyLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton fixedBtn;
    private javax.swing.JLabel fpriceLbl;
    private javax.swing.JTextField fpriceTf;
    private javax.swing.JButton fviewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mortgageBtn;
    private javax.swing.JLabel mpriceLbl;
    private javax.swing.JTextField mpriceTf;
    private javax.swing.JLabel ownerLbl;
    private javax.swing.JLabel ownerLbl1;
    private javax.swing.JTextField ownerTf;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> typeCb;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JLabel yearsLbl;
    private javax.swing.JTextField yearsTf;
    // End of variables declaration//GEN-END:variables
}