private void desenharQuadradoPreenchido(Graphics g) {
        int centroX = panelDesenhoPreenchido.getWidth() / 2;
        int centroY = panelDesenhoPreenchido.getHeight() / 2;
        int tamanho = (int) Math.min(lado * 10, 200);
        
        int x = centroX - tamanho / 2;
        int y = centroY - tamanho / 2;
        
        g.setColor(new Color(70, 130, 180));
        g.fillRect(x, y, tamanho, tamanho);
        
        g.setColor(Color.BLACK);
        g.drawString(String.format("Lado: %.1f", lado), x, y - 5);
        g.drawString(String.format("Área: %.1f", lado * lado), x, y + tamanho + 15);
    }

    private void desenharQuadradoContorno(Graphics g) {
        int centroX = panelDesenhoContorno.getWidth() / 2;
        int centroY = panelDesenhoContorno.getHeight() / 2;
        int tamanho = (int) Math.min(lado * 10, 200);
        
        int x = centroX - tamanho / 2;
        int y = centroY - tamanho / 2;
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(new Color(220, 20, 60));
        g2d.drawRect(x, y, tamanho, tamanho);
        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.format("Lado: %.1f", lado), x, y - 5);
        g2d.drawString(String.format("Área: %.1f", lado * lado), x, y + tamanho + 15);
    }

    private void desenharQuadradoEscala(Graphics g) {
        int centroX = panelDesenhoEscala.getWidth() / 2;
        int centroY = panelDesenhoEscala.getHeight() / 2;
        int tamanho = (int) Math.min(lado * 15, 250);
        
        int x = centroX - tamanho / 2;
        int y = centroY - tamanho / 2;
        
        g.setColor(new Color(34, 139, 34));
        g.fillRect(x, y, tamanho, tamanho);
