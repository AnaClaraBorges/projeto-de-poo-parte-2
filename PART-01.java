private JPanel criarPanelEntrada() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Entrada de Dados"));
        
        JLabel lblLado = new JLabel("Lado do quadrado:");
        txtLado = new JTextField(10);
        JButton btnCalcular = new JButton("Calcular Área");
        lblResultado = new JLabel("Resultado aparecerá aqui");
        
        lblLado.setFont(new Font("Arial", Font.BOLD, 14));
        txtLado.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        btnCalcular.setBackground(new Color(70, 130, 180));
        btnCalcular.setForeground(Color.WHITE);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        lblResultado.setForeground(new Color(0, 100, 0));
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularArea();
            }
        });
        
        panel.add(lblLado);
        panel.add(txtLado);
        panel.add(btnCalcular);
        panel.add(lblResultado);
        
        return panel;
    }