private void calcularArea() {
        try {
            lado = Double.parseDouble(txtLado.getText());
            
            if (lado <= 0) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor, digite um valor positivo para o lado!", 
                    "Erro de Entrada", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double area = lado * lado;
            lblResultado.setText(String.format("Área: %.2f unidades²", area));
            
            panelDesenhoPreenchido.repaint();
            panelDesenhoContorno.repaint();
            panelDesenhoEscala.repaint();
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, digite um valor numérico válido!", 
                "Erro de Entrada", 
                JOptionPane.ERROR_MESSAGE);
        }
    }