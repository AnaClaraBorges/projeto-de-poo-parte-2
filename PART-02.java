import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometriaQuadrado extends JFrame {
    private JTextField txtLado;
    private JLabel lblResultado;
    private JPanel panelDesenhoPreenchido;
    private JPanel panelDesenhoContorno;
    private JPanel panelDesenhoEscala;
    private double lado;

    public GeometriaQuadrado() {
        setTitle("Calculadora de Área do Quadrado - Ecotech");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel panelEntrada = criarPanelEntrada();
        mainPanel.add(panelEntrada, BorderLayout.NORTH);
        
        JTabbedPane tabbedPane = criarTabbedPane();
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        
        add(mainPanel);
    }