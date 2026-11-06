import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class WordleGameWindow extends JFrame implements KeyListener{
    private JLabel[] letters = new JLabel[30];
    private int letterCounter;
    private Color initBorderColor = Color.decode("#565758");
    private Border initLetterBorder = BorderFactory.createStrokeBorder(new BasicStroke(3.0f), initBorderColor);
    private Color backgroundColor = Color.decode("#121213");
    private Color fontColor = Color.decode("#f8f8f8");

    public WordleGameWindow() {
        letterCounter = 0;
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setLayout(new GridLayout(6,5,8,8));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 250, 170, 250));

        for (int i = 0; i < letters.length; i++){
            JLabel currentLetter = letters[i] = new JLabel("",SwingConstants.CENTER);
            // currentLetter.setBorder(new LineBorder(initBorder));
            currentLetter.setBorder(initLetterBorder);
            currentLetter.setOpaque(true);
            currentLetter.setBackground(backgroundColor);
            currentLetter.setForeground(fontColor);
            currentLetter.setHorizontalTextPosition(JLabel.CENTER);
            currentLetter.setVerticalTextPosition(JLabel.CENTER);
            currentLetter.setFont(new Font("Helvetica", Font.BOLD, 50));
            panel.add(currentLetter);
        }
        
        add(panel);
        setContentPane(panel);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char typedKey = e.getKeyChar();
        if (Character.isLetter(typedKey) && letterCounter < 30){
            String currentLetter = String.valueOf(typedKey).toUpperCase();
            System.out.println(currentLetter);
            letters[letterCounter].setText(currentLetter);
            letterCounter++;
        }

    }

    public static void main(String[] args) throws Exception {
        WordleGameWindow window = new WordleGameWindow();
        //window.getContentPane().setLayout(new GridLayout(6,5,5,5));
        window.setVisible(true);
    }
}
