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
        placeOrderPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
        
        //Initial Search Panel visibility
        bestCustomerPanel.setVisible(false);
        searchOrderPanel.setVisible(false);
        
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
        btnSearch = new javax.swing.JButton();
        btnUpdateOrder = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblImage2 = new javax.swing.JLabel();
        sidePanel2 = new javax.swing.JPanel();
        lblImage1 = new javax.swing.JLabel();
        btnSearchOrder = new javax.swing.JButton();
        btnBestCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();
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
        placeOrderPanel = new javax.swing.JPanel();
        lblHeader4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        placeOrderBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        bestCustomerPanel = new javax.swing.JPanel();
        lblHeader2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestCustomer = new javax.swing.JTable();
        searchOrderPanel = new javax.swing.JPanel();
        lblHeader3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtOrderId1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        updateOrderPanel = new javax.swing.JPanel();
        lblHeader5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtOrderId2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtQty2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        updateOrderBtn = new javax.swing.JButton();
        cancelBtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iHungry BurgerShop");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        sidePanel1.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel1.setForeground(new java.awt.Color(0, 0, 0));
        sidePanel1.setMaximumSize(new java.awt.Dimension(280, 600));
        sidePanel1.setMinimumSize(new java.awt.Dimension(280, 600));

        btnSearch.setBackground(new java.awt.Color(255, 51, 51));
        btnSearch.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setMaximumSize(new java.awt.Dimension(268, 40));
        btnSearch.setMinimumSize(new java.awt.Dimension(268, 40));
        btnSearch.setPreferredSize(new java.awt.Dimension(268, 40));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdateOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdateOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnUpdateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateOrder.setText("Update Orders");
        btnUpdateOrder.setMaximumSize(new java.awt.Dimension(268, 40));
        btnUpdateOrder.setMinimumSize(new java.awt.Dimension(268, 40));
        btnUpdateOrder.setPreferredSize(new java.awt.Dimension(268, 40));
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

        btnDashboard.setBackground(new java.awt.Color(255, 0, 51));
        btnDashboard.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.setMaximumSize(new java.awt.Dimension(268, 40));
        btnDashboard.setMinimumSize(new java.awt.Dimension(268, 40));
        btnDashboard.setPreferredSize(new java.awt.Dimension(268, 40));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnViewOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnViewOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setText("View Orders");
        btnViewOrder.setMaximumSize(new java.awt.Dimension(268, 40));
        btnViewOrder.setMinimumSize(new java.awt.Dimension(268, 40));
        btnViewOrder.setPreferredSize(new java.awt.Dimension(268, 40));
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnPlaceOrder.setBackground(new java.awt.Color(255, 51, 51));
        btnPlaceOrder.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setMaximumSize(new java.awt.Dimension(268, 40));
        btnPlaceOrder.setMinimumSize(new java.awt.Dimension(268, 40));
        btnPlaceOrder.setPreferredSize(new java.awt.Dimension(268, 40));
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/burger.png"))); // NOI18N

        javax.swing.GroupLayout sidePanel1Layout = new javax.swing.GroupLayout(sidePanel1);
        sidePanel1.setLayout(sidePanel1Layout);
        sidePanel1Layout.setHorizontalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanel1Layout.setVerticalGroup(
            sidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
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

        btnBestCustomer.setBackground(new java.awt.Color(255, 51, 51));
        btnBestCustomer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnBestCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnBestCustomer.setText("Search Best Customer");
        btnBestCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestCustomerActionPerformed(evt);
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

        btnSearchCustomer.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchCustomer.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSearchCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCustomer.setText("Search Customer Details");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
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
                    .addComponent(btnBestCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanel2Layout.setVerticalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBestCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
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
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(orderCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deliverCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(customerCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliverCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderCountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        placeOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        placeOrderPanel.setForeground(new java.awt.Color(0, 0, 0));
        placeOrderPanel.setMaximumSize(new java.awt.Dimension(720, 600));
        placeOrderPanel.setMinimumSize(new java.awt.Dimension(720, 600));

        lblHeader4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader4.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader4.setText("Place an Order");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Order ID : ");

        txtOrderId.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOrderId.setText("B0001");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Customer ID : ");

        txtCustomerId.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtCustomerId.setText("0702436642");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Customer Name : ");

        txtCustomerName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtCustomerName.setText("Pasindu Madhuwantha");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Quantity : ");

        txtQty.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtQty.setText("0");

        placeOrderBtn.setBackground(new java.awt.Color(0, 153, 0));
        placeOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderBtn.setText("Place Order");

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("LKR 0");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Price : ");

        javax.swing.GroupLayout placeOrderPanelLayout = new javax.swing.GroupLayout(placeOrderPanel);
        placeOrderPanel.setLayout(placeOrderPanelLayout);
        placeOrderPanelLayout.setHorizontalGroup(
            placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader4, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(placeOrderPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(placeOrderPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(placeOrderPanelLayout.createSequentialGroup()
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeOrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        placeOrderPanelLayout.setVerticalGroup(
            placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeOrderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(placeOrderPanelLayout.createSequentialGroup()
                        .addComponent(placeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))
                    .addGroup(placeOrderPanelLayout.createSequentialGroup()
                        .addComponent(lblHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(placeOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addGap(186, 186, 186))))
        );

        bestCustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        bestCustomerPanel.setForeground(new java.awt.Color(0, 0, 0));

        lblHeader2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader2.setText("Search Best Customers");

        tblBestCustomer.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblBestCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        searchOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchOrderPanel.setForeground(new java.awt.Color(0, 0, 0));
        searchOrderPanel.setMaximumSize(new java.awt.Dimension(720, 600));
        searchOrderPanel.setMinimumSize(new java.awt.Dimension(720, 600));

        lblHeader3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader3.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader3.setText("Search Order");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Order ID : ");

        txtOrderId1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOrderId1.setText("B0001");

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Customer ID : ");

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Customer Name : ");

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Quantity : ");

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Price : ");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("[Empty]");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("[Empty]");

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("[Empty]");

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("[Empty]");

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("[Empty]");

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Status : ");

        javax.swing.GroupLayout searchOrderPanelLayout = new javax.swing.GroupLayout(searchOrderPanel);
        searchOrderPanel.setLayout(searchOrderPanelLayout);
        searchOrderPanelLayout.setHorizontalGroup(
            searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(searchOrderPanelLayout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10))
                        .addGroup(searchOrderPanelLayout.createSequentialGroup()
                            .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel26)
                                .addComponent(jLabel28)
                                .addComponent(jLabel32))
                            .addGap(18, 18, 18)
                            .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31))))
                    .addGroup(searchOrderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrderId1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchOrderPanelLayout.setVerticalGroup(
            searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrderId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(69, 69, 69)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(searchOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        updateOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        updateOrderPanel.setForeground(new java.awt.Color(0, 0, 0));

        lblHeader5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeader5.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader5.setText("Update an Order");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Enter Order ID : ");

        txtOrderId2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOrderId2.setText("B0001");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Customer ID : ");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Customer Name : ");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Quantity : ");

        txtQty2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtQty2.setText("0");

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Price : ");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("LKR 0");

        updateOrderBtn.setBackground(new java.awt.Color(0, 153, 0));
        updateOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateOrderBtn.setText("Update Order");

        cancelBtn2.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelBtn2.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn2.setText("Cancel");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("[Empty]");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("[Empty]");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Status : ");

        statusComboBox.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelled", "Preparing", "Delivered" }));

        javax.swing.GroupLayout updateOrderPanelLayout = new javax.swing.GroupLayout(updateOrderPanel);
        updateOrderPanel.setLayout(updateOrderPanelLayout);
        updateOrderPanelLayout.setHorizontalGroup(
            updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader5, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateOrderPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(22, 22, 22)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderId2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateOrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(updateOrderPanelLayout.createSequentialGroup()
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel9))
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel8)))
                            .addGroup(updateOrderPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        updateOrderPanelLayout.setVerticalGroup(
            updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateOrderPanelLayout.createSequentialGroup()
                        .addComponent(updateOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))
                    .addGroup(updateOrderPanelLayout.createSequentialGroup()
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrderId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(updateOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(bestCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(placeOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestCustomerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(placeOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        //Sidebar 01 Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#DC0033"));
        btnDashboard.setFont(new Font("", Font.BOLD, 18));
        btnPlaceOrder.setBackground(Color.decode("#FF0033"));
        btnPlaceOrder.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 02 Button Selection Visibility
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnSearchOrder.setBackground(Color.decode("#FF0033"));
        btnSearchOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 03 Button Selection Visibility
        btnProcessOrder.setBackground(Color.decode("#FF0033"));
        btnProcessOrder.setFont(new Font("", Font.PLAIN, 18));
        btnDeliverOrder.setBackground(Color.decode("#FF0033"));
        btnDeliverOrder.setFont(new Font("", Font.PLAIN, 18));
        btnCancelOrder.setBackground(Color.decode("#FF0033"));
        btnCancelOrder.setFont(new Font("", Font.PLAIN, 18));

        //Panel visibility
        dashboard.setVisible(true);
        placeOrderPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
        
        //Search Panel visibility
        bestCustomerPanel.setVisible(false);
        searchOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Thank you for using iHungry BurgerShop");
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOrderActionPerformed
        //Sidebar 01 Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#FF0033"));
        btnDashboard.setFont(new Font("", Font.PLAIN, 18));
        btnPlaceOrder.setBackground(Color.decode("#FF0033"));
        btnPlaceOrder.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 02 Button Selection Visibility
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnSearchOrder.setBackground(Color.decode("#DC0033"));
        btnSearchOrder.setFont(new Font("", Font.BOLD, 18));
        
        //Sidebar 03 Button Selection Visibility
        btnProcessOrder.setBackground(Color.decode("#FF0033"));
        btnProcessOrder.setFont(new Font("", Font.PLAIN, 18));
        btnDeliverOrder.setBackground(Color.decode("#FF0033"));
        btnDeliverOrder.setFont(new Font("", Font.PLAIN, 18));
        btnCancelOrder.setBackground(Color.decode("#FF0033"));
        btnCancelOrder.setFont(new Font("", Font.PLAIN, 18));

        //Panel visibility
        dashboard.setVisible(false);
        placeOrderPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
        
        //Search Panel visibility
        bestCustomerPanel.setVisible(false);
        searchOrderPanel.setVisible(true);
    }//GEN-LAST:event_btnSearchOrderActionPerformed

    private void btnBestCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestCustomerActionPerformed
        //Sidebar 01 Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#DC0033"));
        btnDashboard.setFont(new Font("", Font.PLAIN, 18));
        btnPlaceOrder.setBackground(Color.decode("#FF0033"));
        btnPlaceOrder.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 02 Button Selection Visibility
        btnBestCustomer.setBackground(Color.decode("#DC0033"));
        btnBestCustomer.setFont(new Font("", Font.BOLD, 18));
        btnSearchOrder.setBackground(Color.decode("#FF0033"));
        btnSearchOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 03 Button Selection Visibility
        btnProcessOrder.setBackground(Color.decode("#FF0033"));
        btnProcessOrder.setFont(new Font("", Font.PLAIN, 18));
        btnDeliverOrder.setBackground(Color.decode("#FF0033"));
        btnDeliverOrder.setFont(new Font("", Font.PLAIN, 18));
        btnCancelOrder.setBackground(Color.decode("#FF0033"));
        btnCancelOrder.setFont(new Font("", Font.PLAIN, 18));

        //Panel visibility
        dashboard.setVisible(false);
        placeOrderPanel.setVisible(false);
        updateOrderPanel.setVisible(false);
        
        //Search Panel visibility
        bestCustomerPanel.setVisible(true);
        searchOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnBestCustomerActionPerformed

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
        btnPlaceOrder.setBackground(Color.decode("#FF0033"));
        btnPlaceOrder.setFont(new Font("", Font.PLAIN, 18));
        btnUpdateOrder.setBackground(Color.decode("#DC0033"));
        btnUpdateOrder.setFont(new Font("", Font.BOLD, 18));
        
        //Sidebar 02 Button Selection Visibility
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnSearchOrder.setBackground(Color.decode("#FF0033"));
        btnSearchOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 03 Button Selection Visibility
        btnProcessOrder.setBackground(Color.decode("#FF0033"));
        btnProcessOrder.setFont(new Font("", Font.PLAIN, 18));
        btnDeliverOrder.setBackground(Color.decode("#FF0033"));
        btnDeliverOrder.setFont(new Font("", Font.PLAIN, 18));
        btnCancelOrder.setBackground(Color.decode("#FF0033"));
        btnCancelOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Panel visibility
        dashboard.setVisible(false);
        placeOrderPanel.setVisible(false);
        updateOrderPanel.setVisible(true);
        
        //Search Panel visibility
        bestCustomerPanel.setVisible(false);
        searchOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        //Button Selection Visibility
        btnDashboard.setBackground(Color.decode("#FF0033"));
        btnDashboard.setFont(new Font("", Font.PLAIN, 18));
        btnPlaceOrder.setBackground(Color.decode("#DC0033"));
        btnPlaceOrder.setFont(new Font("", Font.BOLD, 18));
        btnUpdateOrder.setBackground(Color.decode("#FF0033"));
        btnUpdateOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 02 Button Selection Visibility
        btnBestCustomer.setBackground(Color.decode("#FF0033"));
        btnBestCustomer.setFont(new Font("", Font.PLAIN, 18));
        btnSearchOrder.setBackground(Color.decode("#FF0033"));
        btnSearchOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Sidebar 03 Button Selection Visibility
        btnProcessOrder.setBackground(Color.decode("#FF0033"));
        btnProcessOrder.setFont(new Font("", Font.PLAIN, 18));
        btnDeliverOrder.setBackground(Color.decode("#FF0033"));
        btnDeliverOrder.setFont(new Font("", Font.PLAIN, 18));
        btnCancelOrder.setBackground(Color.decode("#FF0033"));
        btnCancelOrder.setFont(new Font("", Font.PLAIN, 18));
        
        //Panel visibility
        dashboard.setVisible(false);
        placeOrderPanel.setVisible(true);
        updateOrderPanel.setVisible(false);
        
        //Search Panel visibility
        bestCustomerPanel.setVisible(false);
        searchOrderPanel.setVisible(false);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

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
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchOrder;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelBtn2;
    private javax.swing.JPanel customerCountPanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel deliverCountPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JLabel lblHeader4;
    private javax.swing.JLabel lblHeader5;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JLabel lblImage3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainSidePanel;
    private javax.swing.JPanel orderCountPanel;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JPanel placeOrderPanel;
    private javax.swing.JPanel searchOrderPanel;
    private javax.swing.JPanel sidePanel1;
    private javax.swing.JPanel sidePanel2;
    private javax.swing.JPanel sidePanel3;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTable tblBestCustomer;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtOrderId1;
    private javax.swing.JTextField txtOrderId2;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQty2;
    private javax.swing.JButton updateOrderBtn;
    private javax.swing.JPanel updateOrderPanel;
    // End of variables declaration//GEN-END:variables
}
