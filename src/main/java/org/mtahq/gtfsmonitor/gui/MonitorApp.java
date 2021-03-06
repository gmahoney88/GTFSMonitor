/*
 * Copyright Metropolitan Transportation Authority NY
 * All Rights Reserved
 */
package org.mtahq.gtfsmonitor.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import org.mtahq.gtfsmonitor.GTFSMonitor;
import org.mtahq.gtfsmonitor.Main;
import org.mtahq.gtfsmonitor.Utils;

/**
 *
 * @author mnilsen
 */
public class MonitorApp extends javax.swing.JFrame implements FeedStatusListener {
    private static GTFSMonitor gm = null;
    private static String configPath = ".";
    private Throbber throb = null;
    
    /**
     * Creates new form MonitorApp
     */
    public MonitorApp() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        runToggleButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jtfUpdate = new javax.swing.JTextField();
        lblThrob = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setText("GTFS Feed Monitor");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        dataTable.setModel(new GtfsTableModel());
        jScrollPane1.setViewportView(dataTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.GridBagLayout());

        runToggleButton.setText("Run");
        runToggleButton.setMaximumSize(new java.awt.Dimension(100, 29));
        runToggleButton.setMinimumSize(new java.awt.Dimension(100, 29));
        runToggleButton.setPreferredSize(new java.awt.Dimension(100, 29));
        runToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel4.add(runToggleButton, gridBagConstraints);

        jLabel2.setText("Last Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel4.add(jLabel2, gridBagConstraints);

        jtfUpdate.setEditable(false);
        jtfUpdate.setMaximumSize(new java.awt.Dimension(250, 26));
        jtfUpdate.setMinimumSize(new java.awt.Dimension(200, 26));
        jtfUpdate.setPreferredSize(new java.awt.Dimension(225, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel4.add(jtfUpdate, gridBagConstraints);

        lblThrob.setText("Throbber");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel4.add(lblThrob, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel4, gridBagConstraints);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void runToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runToggleButtonActionPerformed
        if(this.runToggleButton.isSelected())
        {
            //  Clear table
            GtfsTableModel tm = (GtfsTableModel) this.dataTable.getModel();
            tm.setData(new ArrayList());
            //  Clear Update field
            this.jtfUpdate.setText("");
            this.runToggleButton.setText("Stop");
            this.gm.start();
            this.throb.start();

        } else {
            this.throb.stop();
            this.gm.stop();
            this.runToggleButton.setText("Run");
        }
    }//GEN-LAST:event_runToggleButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(new Locale("en", "US"));
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        Logger.getLogger(Main.class.getCanonicalName()).log(Level.INFO, "Setting Time Zone: {0}", TimeZone.getDefault().getDisplayName());
        
        Utils.config(configPath);
        gm = new GTFSMonitor();
        
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
            java.util.logging.Logger.getLogger(MonitorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MonitorApp ma = new MonitorApp();
                gm.addFeedStatusListener(ma);
                ma.myInit();
                ma.setVisible(true);
            }
        });
    }
    
    public void myInit()
    {
        this.throb = new Throbber(this.lblThrob);
        this.setPreferredSize(new Dimension(1000,600));
        this.setMinimumSize(new Dimension(1000,600));
        this.dataTable.setRowHeight(35);
        Font f = this.dataTable.getFont();
        f = f.deriveFont(14.0f);
        this.dataTable.setFont(f);
        this.dataTable.getColumnModel().getColumn(0).setCellRenderer(new BallCellRenderer());
        
        this.dataTable.getColumnModel().getColumn(0).setMaxWidth(75);
        this.dataTable.getColumnModel().getColumn(1).setMaxWidth(150);
        this.dataTable.getColumnModel().getColumn(2).setMaxWidth(175);
        this.dataTable.getColumnModel().getColumn(3).setMaxWidth(75);
        this.dataTable.getColumnModel().getColumn(4).setMaxWidth(75);
        this.dataTable.getColumnModel().getColumn(5).setMaxWidth(75);
        this.dataTable.getColumnModel().getColumn(0).setMinWidth(75);
        this.dataTable.getColumnModel().getColumn(1).setMinWidth(150);
        this.dataTable.getColumnModel().getColumn(2).setMinWidth(175);
        this.dataTable.getColumnModel().getColumn(3).setMinWidth(75);
        this.dataTable.getColumnModel().getColumn(4).setMinWidth(75);
        this.dataTable.getColumnModel().getColumn(5).setMinWidth(75);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JTable dataTable;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfUpdate;
    private javax.swing.JLabel lblThrob;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JToggleButton runToggleButton;
    // End of variables declaration//GEN-END:variables
    
    private static final DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.LONG);
    @Override
    public void updateListData(List<FeedStatus> list) {
        GtfsTableModel tm = (GtfsTableModel) this.dataTable.getModel();
        tm.setData(list);
        this.jtfUpdate.setText(timeFormat.format(new Date()));
    }

    private static class GtfsTableModel implements TableModel {
        private static final String[] columnNames = {"State","Feed","Timestamp","Age","Size","Updates","Error"};
        private static final Class[] columnClasses = {FeedState.class,String.class,String.class,String.class,String.class,String.class,String.class};
        
        
        private List<FeedStatus> data = null;
        
        private List<TableModelListener> listeners = new ArrayList<>();
        
        public GtfsTableModel() {
        }

        public List<FeedStatus> getData() {
            return data;
        }

        public void setData(List<FeedStatus> data) {
            this.data = data;
            this.fireTableDataChanged();
        }
        
        @Override
        public int getRowCount() {
            return this.data == null?0:this.data.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return columnClasses[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            FeedStatus fs = this.data.get(rowIndex);
            boolean error = fs.getErrorText() != null;
            
            Object res = null;
            switch(columnIndex)
            {
                case 0:
                    res = fs.getFeedState();
                    break;
                case 1:
                    res = fs.getFeed();
                    break;
                case 2:
                    res = error?"":timeFormat.format(new Date(fs.getTimestamp()));
                    break;
                case 3:
                    res = error?"":Float.toString(fs.getAge());
                    break;
                case 4:
                    res = error?null:Long.toString(fs.getSize());
                    break;
                case 5:
                    res = error?null:fs.getUpdateCount();
                    break;
                case 6:
                    res = fs.getErrorText();
                    break;
                default:
                    res = "Bad column index";
            }
            return res;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            //  no op
        }

        @Override
        public void addTableModelListener(TableModelListener l) {
            this.listeners.add(l);
        }

        @Override
        public void removeTableModelListener(TableModelListener l) {
            this.listeners.remove(l);
        }
        
        public void fireTableDataChanged()
        {
            TableModelEvent tme = new TableModelEvent(this);
            this.listeners.forEach((l) -> {
                l.tableChanged(tme);
            });
        }
        
    }
    
    static
    {
        Runtime.getRuntime().addShutdownHook(new ShutdownThread());
    }

    private static class ShutdownThread extends Thread {
        
        public ShutdownThread() {
        }

        @Override
        public void run() {
            System.out.println("Shutting down GTFS Monitor...");
            if(gm != null) gm.stop();
        }
    }
    
    public class BallCellRenderer extends DefaultTableCellRenderer {
        private ImageIcon greenBall = null;
        private ImageIcon yellowBall = null;
        private ImageIcon redBall = null;
        
        public BallCellRenderer() {
            this.greenBall = new ImageIcon(this.getClass().getResource("/green_ball.png"));
            this.yellowBall = new ImageIcon(this.getClass().getResource("/yellow_ball.png"));
            this.redBall = new ImageIcon(this.getClass().getResource("/red_ball.png"));
        }       
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if(value == null) value = FeedState.OK;
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            JLabel lbl = (JLabel) c;    
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
            if(value.getClass() != FeedState.class) return c;
            FeedState fs = (FeedState) value;
            lbl.setText("");
            Icon icon = this.getIconForState(fs);
            lbl.setIcon(icon);
            return c;
        }
        
        private Icon getIconForState(FeedState fs)
        {
            if(fs == FeedState.OK) return this.greenBall;
            if(fs == FeedState.LATE) return this.yellowBall;
            return this.redBall;
        }
        
        
        
    }

}
