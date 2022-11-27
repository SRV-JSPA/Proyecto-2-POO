package bankgua;
import java.awt.Toolkit;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Banco extends javax.swing.JFrame {
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta = new ArrayList<String>();
    Cliente cliente;
    Cuenta cuenta;
    Tarjeta tarjeta;
    
    DefaultTableModel modelMovs = new DefaultTableModel();

    public Banco() {
        initComponents();
        this.setTitle("BankGua");
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/1.png"));
        this.setIconImage(img);
        logo.setIcon(new ImageIcon(img.getScaledInstance(logo.getHeight(),logo.getHeight(),Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        modelMovs.addColumn("Cuenta");
        modelMovs.addColumn("Fecha");
        modelMovs.addColumn("Tipo");
        modelMovs.addColumn("Monto");
        tblMovimientos.setModel(modelMovs);

    }
    
       public void revisarT(){
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        Boolean revision = false;
        double limite = tarjeta.getLimite();
        double saldo = limite;
        while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
        }
        for(Movimiento m : tarjeta.getMismovimientos()){
            Object mov[]=new Object [4];
            mov[0] = tarjeta.getTipoTarjeta();
            mov[1]= m.getFechaMovimiento();
            mov[2]=m.getTipoMovimiento();
            mov[3]=aMoneda(m.getMonto());
            saldo+=m.getMonto();
            modelMovs.addRow(mov);
        }

 public void revisarT(){
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        Boolean revision = false;
        double limite = tarjeta.getLimite();
        double saldo = limite;
        while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
        }
        for(Movimiento m : tarjeta.getMismovimientos()){
            Object mov[]=new Object [4];
            mov[0] = tarjeta.getTipoTarjeta();
            mov[1]= m.getFechaMovimiento();
            mov[2]=m.getTipoMovimiento();
            mov[3]=aMoneda(m.getMonto());
            saldo+=m.getMonto();
            modelMovs.addRow(mov);
        }
        
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento(cboTipoMovimiento1.getSelectedItem().toString());
        double monto = Double.parseDouble(txtMontoMovimiento1.getText().toString());
        monto = m.getTipoMovimiento().endsWith("PAGO")?monto:(monto*-1);
        m.setMonto(monto);
        
        
        double saldo2 = saldo + monto;
        
        if (saldo2 > 0 ){
            revision = true;
        }
        if (revision == true){
            tarjeta.addMovimiento(m);
            verMovimientosT();
            verDatos();
        }
        if (revision == false){
            int input;
            input = JOptionPane.showConfirmDialog(this, "No tiene suficiente limite para realizar el consumo.", "Cliente",JOptionPane.DEFAULT_OPTION);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboCuentaCliente = new javax.swing.JComboBox<>();
        txtMontoInicial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarTipoCuenta = new javax.swing.JToggleButton();
        btnAgregarCuenta = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnNuevaTarjeta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cboConsultaCliente = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboConsultaTipoCuenta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cboConsultaTarjeta = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cboConsultaTipoTarjeta = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cboTipoMovimiento1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txtMontoMovimiento1 = new javax.swing.JTextField();
        btnAgregarMovimiento1 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BankGua");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 160, 24));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 73, -1));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 24, 280, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 58, 73, -1));

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 58, 280, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 73, -1));

        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 92, 280, -1));

        btnAgregarCliente.setText("AGREGAR CLIENTE");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 0, 400, 200));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Cuenta"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Cliente:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 95, -1));

        cboTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(cboTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de Cuenta");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cboCuentaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCuentaClienteActionPerformed(evt);
            }
        });
        jPanel2.add(cboCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 290, -1));

        txtMontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoInicialActionPerformed(evt);
            }
        });
        jPanel2.add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 290, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nueva Tarjeta:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, -1));

        btnAgregarTipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAgregarTipoCuenta.setText("+");
        btnAgregarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 50, 50));

        btnAgregarCuenta.setText("AGREGAR CUENTA");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Monto Inicial");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 85, -1));

        btnNuevaTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNuevaTarjeta.setText("+");
        btnNuevaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTarjetaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 410, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cliente:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 95, -1));

        cboConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaClienteActionPerformed(evt);
            }
        });
        jPanel3.add(cboConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Cliente:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 95, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 100, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 669, 100));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tipo de Cuenta:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 110, -1));

        cboConsultaTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTipoCuentaActionPerformed(evt);
            }
        });
        jPanel3.add(cboConsultaTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 100, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tipo Movimiento:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, -1));

        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "RETIRO" }));
        cboTipoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoMovimientoActionPerformed(evt);
            }
        });
        jPanel3.add(cboTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 100, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Tipo Movimiento:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -30, 120, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Monto:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 150, 20));

        txtMontoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMovimientoActionPerformed(evt);
            }
        });
        jPanel3.add(txtMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 160, 30));

        btnAgregarMovimiento.setText("AGREGAR MOVIMIENTO");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 170, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 990, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Nombre:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 52, -1));
        jPanel4.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 20));
        jPanel4.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 20));

        jLabel20.setText("Teléfono:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel17.setText("Tipo Cuenta:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));
        jPanel4.add(lblTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 20));

        jLabel21.setText("Monto Inicial:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));
        jPanel4.add(lblMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, 20));

        jLabel23.setText("Direccion:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));
        jPanel4.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 388, 340, 140));

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 640, 90));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 160, 160));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("Saldo");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 200, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Saldo");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos Tarjeta"));
        jPanel6.setToolTipText("");
        jPanel6.setName(""); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Cliente:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 95, -1));

        cboConsultaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTarjetaActionPerformed(evt);
            }
        });
        jPanel6.add(cboConsultaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Tipo de Tarjeta:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, -1));

        cboConsultaTipoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTipoTarjetaActionPerformed(evt);
            }
        });
        jPanel6.add(cboConsultaTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Tipo Movimiento:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, -1));

        cboTipoMovimiento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GASTO", "PAGO" }));
        cboTipoMovimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoMovimiento1ActionPerformed(evt);
            }
        });
        jPanel6.add(cboTipoMovimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 100, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Monto:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 150, 20));

        txtMontoMovimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMovimiento1ActionPerformed(evt);
            }
        });
        jPanel6.add(txtMontoMovimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 160, 30));

        btnAgregarMovimiento1.setText("AGREGAR MOVIMIENTO");
        btnAgregarMovimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimiento1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarMovimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 170, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 990, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtMontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoInicialActionPerformed

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento(cboTipoMovimiento.getSelectedItem().toString());
        double monto = Double.parseDouble(txtMontoMovimiento.getText().toString());
        monto = m.getTipoMovimiento().endsWith("DEPOSITO")?monto:(monto*-1);
        m.setMonto(monto);
        cuenta.addMovimiento(m);
        verMovimientos();
        txtMontoMovimiento.setText("");
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    private void cboCuentaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCuentaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCuentaClienteActionPerformed

    private void cboConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaClienteActionPerformed
        refrescarComboCuentas();
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_cboConsultaClienteActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void cboConsultaTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTipoCuentaActionPerformed
        verDatos();
        verMovimientos();
    }//GEN-LAST:event_cboConsultaTipoCuentaActionPerformed

    private void cboTipoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoMovimientoActionPerformed

    private void txtMontoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMovimientoActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        cliente = listaClientes.get(cboCuentaCliente.getSelectedIndex());
        Cuenta cuenta = new Cuenta();
        cuenta.setTipoCuenta(listaTipoCuenta.get(cboTipoCuenta.getSelectedIndex()));
        cuenta.setMontoinicial(Double.parseDouble(txtMontoInicial.getText()));
        cliente.addCuenta(cuenta);
        
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento("Apertura");
        m.setMonto(Double.parseDouble(txtMontoInicial.getText()));
        cuenta.addMovimiento(m);
        borrarFormCuenta();
        refrescarComboCuentas(); 
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    public String aMoneda(double cantidad){
        cantidad = Math.round(cantidad*100.0)/100.0;
        DecimalFormat formato = new DecimalFormat("Q #,###.##");
        return formato.format(cantidad);
    }
    public void verDatos(){
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        lblNombreCliente.setText(cliente.getNombre());
        lblTelefonoCliente.setText(cliente.getTelefono());
        lblDireccionCliente.setText(cliente.getDireccion());
        
        if(cliente.getMiscuentas().size()>0){
            cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
            lblTipoCuenta.setText(cuenta.getTipoCuenta());
            lblMontoInicial.setText(aMoneda(cuenta.getMontoinicial()));
            
        }else{
            lblTipoCuenta.setText("No Tiene Una Cuenta");
            lblMontoInicial.setText("No Tiene Una Cuenta");
        }
    }
    public void verMovimientos(){
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        cuenta = cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        double saldo = 0;
        while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
        }
        for(Movimiento m : cuenta.getMismovimientos()){
            Object mov[]=new Object [4];
            mov[0] = cuenta.getTipoCuenta();
            mov[1]= m.getFechaMovimiento();
            mov[2]=m.getTipoMovimiento();
            mov[3]=aMoneda(m.getMonto());
            saldo+=m.getMonto();
            modelMovs.addRow(mov);
        }
        for(Movimiento m : tarjeta.getMismovimientos()){
            Object mov[]=new Object [4];
            mov[0] = tarjeta.getTipoTarjeta();
            mov[1]= m.getFechaMovimiento();
            mov[2]=m.getTipoMovimiento();
            mov[3]=aMoneda(m.getMonto());
            saldo+=m.getMonto();
            modelMovs.addRow(mov);
        }
        tblMovimientos.setModel(modelMovs);
        lblSaldo.setText(aMoneda(saldo));
        
    }
    public void verMovimientosT(){
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        double saldo = 0;
        while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
        }
        for(Movimiento m : tarjeta.getMismovimientos()){
            Object mov[]=new Object [4];
            mov[0] = tarjeta.getTipoTarjeta();
            mov[1]= m.getFechaMovimiento();
            mov[2]=m.getTipoMovimiento();
            mov[3]=aMoneda(m.getMonto());
            saldo+=m.getMonto();
            modelMovs.addRow(mov);
        }
        tblMovimientos.setModel(modelMovs);
        lblSaldo.setText(aMoneda(saldo));
        
    }
    public void refrescarComboCuentas(){
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        int i=0;
        ArrayList<String> cuentas = new ArrayList<String>();
        
        for (Cuenta c: cliente.getMiscuentas()){
            cuentas.add(c.getTipoCuenta());
            
        }
        cboConsultaTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
        
    }
    public void refrescarComboTarjetas(){
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        int i=0;
        ArrayList<String> tarjetas = new ArrayList<String>();
        
        for (Tarjeta t: cliente.getMistarjetas()){
            tarjetas.add(t.getTipoTarjeta());
            
        }
        cboConsultaTipoTarjeta.setModel(new DefaultComboBoxModel(tarjetas.toArray()));
    }
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente c = new Cliente();
        c.setNombre(txtNombreCliente.getText());
        c.setTelefono(txtTelefonoCliente.getText());
        c.setDireccion(txtDireccionCliente.getText());
        listaClientes.add(c);
        borrarFormCliente();
        llenarCombosClientes();
        
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgregarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoCuentaActionPerformed
        String tipoCuenta = JOptionPane.showInputDialog(this,"Tipo Cuenta");
        listaTipoCuenta.add(tipoCuenta);
        llenarCombosTipoCuenta();
    }//GEN-LAST:event_btnAgregarTipoCuentaActionPerformed

    private void btnNuevaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTarjetaActionPerformed
        // TODO add your handling code here:
        Object clientes[]=new Object[listaClientes.size()];
        
        String tipos[]= {"Debito","Credito"};
        
        int i=0;
        for (Cliente c: listaClientes){
            clientes[i]=c.getNombre();
            i++;
        }
        JComboBox cb = new JComboBox(clientes);
        JComboBox cb2 = new JComboBox(tipos);
        int input;
        int input2;
        input = JOptionPane.showConfirmDialog(this, cb, "Cliente",JOptionPane.DEFAULT_OPTION);
        input2 = JOptionPane.showConfirmDialog(this, cb2, "Tipo",JOptionPane.DEFAULT_OPTION);
        cliente = listaClientes.get(cb.getSelectedIndex());
        Tarjeta Tarjeta = new Tarjeta();
        String tipoTarjeta = (String)cb2.getSelectedItem();
        Tarjeta.setTipoTarjeta(tipoTarjeta);
        
        cliente.addTarjeta(Tarjeta);
        
        refrescarComboTarjetas(); 
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_btnNuevaTarjetaActionPerformed

    private void cboConsultaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTarjetaActionPerformed
        refrescarComboTarjetas();
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_cboConsultaTarjetaActionPerformed

    private void cboConsultaTipoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTipoTarjetaActionPerformed
        verDatos();
        verMovimientos();
    }//GEN-LAST:event_cboConsultaTipoTarjetaActionPerformed

    private void cboTipoMovimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoMovimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoMovimiento1ActionPerformed

    private void txtMontoMovimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMovimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMovimiento1ActionPerformed

    private void btnAgregarMovimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimiento1ActionPerformed
        cliente = listaClientes.get(cboConsultaTarjeta.getSelectedIndex());
        tarjeta = cliente.getMistarjetas().get(cboConsultaTipoTarjeta.getSelectedIndex());
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento(cboTipoMovimiento1.getSelectedItem().toString());
        double monto = Double.parseDouble(txtMontoMovimiento1.getText().toString());
        monto = m.getTipoMovimiento().endsWith("PAGO")?monto:(monto*-1);
        m.setMonto(monto);
        tarjeta.addMovimiento(m);
        verMovimientos();
        txtMontoMovimiento1.setText("");
    }//GEN-LAST:event_btnAgregarMovimiento1ActionPerformed

    private void cboTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoCuentaActionPerformed

    public void llenarCombosTipoCuenta(){
        Object tipos[]=new Object[listaTipoCuenta.size()];
        int i=0;
        for (String tipo: listaTipoCuenta){
            tipos[i]=tipo;
            i++;
        }
        cboTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
    }
    public void borrarFormCuenta(){
        cboCuentaCliente.setSelectedIndex(0);
        cboTipoCuenta.setSelectedIndex(0);
        txtMontoInicial.setText("");
        
        
    }
    public void borrarFormCliente(){
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
    }
    public void llenarCombosClientes(){
        Object clientes[]=new Object[listaClientes.size()];
        int i=0;
        for (Cliente c: listaClientes){
            clientes[i]=c.getNombre();
            i++;
        }
        cboCuentaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboConsultaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboConsultaTarjeta.setModel(new DefaultComboBoxModel(clientes));
        
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnAgregarMovimiento1;
    private javax.swing.JToggleButton btnAgregarTipoCuenta;
    private javax.swing.JButton btnNuevaTarjeta;
    private javax.swing.JComboBox<String> cboConsultaCliente;
    private javax.swing.JComboBox<String> cboConsultaTarjeta;
    private javax.swing.JComboBox<String> cboConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cboConsultaTipoTarjeta;
    private javax.swing.JComboBox<String> cboCuentaCliente;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JComboBox<String> cboTipoMovimiento1;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtMontoMovimiento1;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
