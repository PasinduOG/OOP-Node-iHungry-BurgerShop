package views;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        initComponents();

        //Initial Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#DC0033"));
        btnDashboard.setFont(new Font("", Font.BOLD, 18));

        //Initial Panel visibility
        dashboard.setVisible(true);
        bestCustomerPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
        
        //Initial Sidebar Visibility
        sidePanel1.setVisible(true);
        sidePanel2.setVisible(false);
        sidePanel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSidePanel = new javax.swing.JPanel();
        sidePanel1 = new javax.swing.JPanel();
        btnBestCustomer = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdateOrder = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        sidePanel2 = new javax.swing.JPanel();
        lblImage1 = new javax.swing.JLabel();
        btnSearchOrder = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        sidePanel3 = new javax.swing.JPanel();
        btnProcessOrder = new javax.swing.JButton();
        btnDeliverOrder = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        lblImage3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        orderCountPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerCountPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deliverCountPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bestCustomerPanel = new javax.swing.JPanel();
        lblHeader2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestCustomer = new javax.swing.JTable();
        updateOrderPanel = new javax.swing.JPanel();
        lblHeader3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iHungry BurgerShop");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        sidePanel1.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel1.setForeground(new java.awt.Color(0, 0, 0));

        btnBestCustomer.setBackground(new java.awt.Color(255, 51, 51));
        btnBestCustomer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnBestCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnBestCustomer.setText("Best Customers");
        btnBestCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestCustomerActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 51, 51));
        btnSearch.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdateOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdateOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnUpdateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateOrder.setText("Update Orders");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setToolTipText("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/burger.png"))); // NOI18N

        btnDashboard.setBackground(new java.awt.Color(255, 0, 51));
        btnDashboard.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnViewOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnViewOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setText("View Orders");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanel1Layout = new javax.swing.GroupLayout(sidePanel1);
        sidePanel1.setLayout(sidePanel1Layout);
        sidePanel1Layout.setHorizontalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBestCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanel1Layout.setVerticalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBestCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidePanel2.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel2.setForeground(new java.awt.Color(0, 0, 0));
        sidePanel2.setMaximumSize(new java.awt.Dimension(280, 600));
        sidePanel2.setMinimumSize(new java.awt.Dimension(280, 600));

        lblImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/burger.png"))); // NOI18N

        btnSearchOrder.setBackground(new java.awt.Color(255, 0, 51));
        btnSearchOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSearchOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchOrder.setText("Search Order Details");
        btnSearchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchOrderActionPerformed(evt);
            }
        });

        btnSearchCustomer.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchCustomer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSearchCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCustomer.setText("Search Customer Details");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back to Home");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanel2Layout = new javax.swing.GroupLayout(sidePanel2);
        sidePanel2.setLayout(sidePanel2Layout);
        sidePanel2Layout.setHorizontalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(btnSearchCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanel2Layout.setVerticalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidePanel3.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel3.setForeground(new java.awt.Color(0, 0, 0));
        sidePanel3.setMaximumSize(new java.awt.Dimension(280, 600));
        sidePanel3.setMinimumSize(new java.awt.Dimension(280, 600));

        btnProcessOrder.setBackground(new java.awt.Color(255, 0, 51));
        btnProcessOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnProcessOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessOrder.setText("Processing Orders");
        btnProcessOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrderActionPerformed(evt);
            }
        });

        btnDeliverOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnDeliverOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDeliverOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnDeliverOrder.setText("Delivered Orders");
        btnDeliverOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverOrderActionPerformed(evt);
            }
        });

        btnBack2.setBackground(new java.awt.Color(0, 0, 0));
        btnBack2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("Back to Home");
        btnBack2.setToolTipText("");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        btnCancelOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnCancelOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelOrder.setText("Search Customer Details");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        lblImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/burger.png"))); // NOI18N

        javax.swing.GroupLayout sidePanel3Layout = new javax.swing.GroupLayout(sidePanel3);
        sidePanel3.setLayout(sidePanel3Layout);
        sidePanel3Layout.setHorizontalGroup(
            sidePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeliverOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcessOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanel3Layout.setVerticalGroup(
            sidePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeliverOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainSidePanelLayout = new javax.swing.GroupLayout(mainSidePanel);
        mainSidePanel.setLayout(mainSidePanelLayout);
        mainSidePanelLayout.setHorizontalGroup(
            mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainSidePanelLayout.setVerticalGroup(
            mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addComponent(sidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setForeground(new java.awt.Color(0, 0, 0));

        lblHeader.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Dashboard");

        orderCountPanel.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Orders");

        javax.swing.GroupLayout orderCountPanelLayout = new javax.swing.GroupLayout(orderCountPanel);
        orderCountPanel.setLayout(orderCountPanelLayout);
        orderCountPanelLayout.setHorizontalGroup(
            orderCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        orderCountPanelLayout.setVerticalGroup(
            orderCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderCountPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        customerCountPanel.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Customers");

        javax.swing.GroupLayout customerCountPanelLayout = new javax.swing.GroupLayout(customerCountPanel);
        customerCountPanel.setLayout(customerCountPanelLayout);
        customerCountPanelLayout.setHorizontalGroup(
            customerCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(customerCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        customerCountPanelLayout.setVerticalGroup(
            customerCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerCountPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deliverCountPanel.setBackground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Delivered");

        javax.swing.GroupLayout deliverCountPanelLayout = new javax.swing.GroupLayout(deliverCountPanel);
        deliverCountPanel.setLayout(deliverCountPanelLayout);
        deliverCountPanelLayout.setHorizontalGroup(
            deliverCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(deliverCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        deliverCountPanelLayout.setVerticalGroup(
            deliverCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliverCountPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(orderCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deliverCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(customerCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliverCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        bestCustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        bestCustomerPanel.setForeground(new java.awt.Color(0, 0, 0));

        lblHeader2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader2.setText("Best Customers");

        tblBestCustomer.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblBestCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBestCustomer);

        javax.swing.GroupLayout bestCustomerPanelLayout = new javax.swing.GroupLayout(bestCustomerPanel);
        bestCustomerPanel.setLayout(bestCustomerPanelLayout);
        bestCustomerPanelLayout.setHorizontalGroup(
            bestCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bestCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestCustomerPanelLayout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(lblHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bestCustomerPanelLayout.setVerticalGroup(
            bestCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        updateOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        updateOrderPanel.setForeground(new java.awt.Color(0, 0, 0));

        lblHeader3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader3.setText("Update Order");

        javax.swing.GroupLayout updateOrderPanelLayout = new javax.swing.GroupLayout(updateOrderPanel);
        updateOrderPanel.setLayout(updateOrderPanelLayout);
        updateOrderPanelLayout.setHorizontalGroup(
            updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        updateOrderPanelLayout.setVerticalGroup(
            updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestCustomerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestCustomerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 720, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 280, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBestCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestCustomerActionPerformed
        //Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#FF0033"));
        btnDashboard.setFont(new Font("", Font.PLAIN, 18));
        btnBestCustomer.setBackground(Color.decode("#DC0033"));
        btnBestCustomer.setFont(new Font("", Font.BOLD, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));

        //Panel visibility
        dashboard.setVisible(false);
        bestCustomerPanel.setVisible(true);
        updateOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnBestCustomerActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        //Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#DC0033"));
        btnDashboard.setFont(new Font("", Font.BOLD, 18));
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));

        //Panel visibility
        dashboard.setVisible(true);
        bestCustomerPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirmaion", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Thank you for using iHungry BurgerShop");
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchOrderActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        sidePanel1.setVisible(true);
        sidePanel2.setVisible(false);
        sidePanel3.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        sidePanel1.setVisible(false);
        sidePanel2.setVisible(true);
        sidePanel3.setVisible(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        sidePanel1.setVisible(false);
        sidePanel2.setVisible(false);
        sidePanel3.setVisible(true);
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnProcessOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcessOrderActionPerformed

    private void btnDeliverOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeliverOrderActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        sidePanel1.setVisible(true);
        sidePanel2.setVisible(false);
        sidePanel3.setVisible(false);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        //Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#FF0033"));
        btnDashboard.setFont(new Font("", Font.PLAIN, 18));
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#DC0033"));
        btnUpdateOrder.setFont(new Font("", Font.BOLD, 18));
        
        //Panel visibility
        dashboard.setVisible(false);
        bestCustomerPanel.setVisible(false);
        updateOrderPanel.setVisible(true);
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        new MainPanel().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bestCustomerPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBestCustomer;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDeliverOrder;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchOrder;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JPanel customerCountPanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel deliverCountPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainSidePanel;
    private javax.swing.JPanel orderCountPanel;
    private javax.swing.JPanel sidePanel1;
    private javax.swing.JPanel sidePanel2;
    private javax.swing.JPanel sidePanel3;
    private javax.swing.JTable tblBestCustomer;
    private javax.swing.JPanel updateOrderPanel;
    // End of variables declaration//GEN-END:variables
}
