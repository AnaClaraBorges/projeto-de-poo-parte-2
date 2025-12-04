private JTabbedPane criarTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        panelDesenhoPreenchido = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (lado > 0) {
                    desenharQuadradoPreenchido(g);
                }
            }
        };
        panelDesenhoPreenchido.setBorder(BorderFactory.createTitledBorder("Quadrado Preenchido"));
        
        panelDesenhoContorno = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (lado > 0) {
                    desenharQuadradoContorno(g);
                }
            }
        };
        panelDesenhoContorno.setBorder(BorderFactory.createTitledBorder("Quadrado com Contorno"));
        
        panelDesenhoEscala = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (lado > 0) {
                    desenharQuadradoEscala(g);
                }
            }
        };
        panelDesenhoEscala.setBorder(BorderFactory.createTitledBorder("Quadrado em Escala Proporcional"));
        
        tabbedPane.addTab("Preenchido", panelDesenhoPreenchido);
        tabbedPane.addTab("Contorno", panelDesenhoContorno);
        tabbedPane.addTab("Escala", panelDesenhoEscala);
        
        return tabbedPane;
    }
