import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WordleGameWindow extends JFrame implements KeyListener{
    public WordleGameWindow() {
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        add(panel);

        this.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char typedKey = e.getKeyChar();
        if (Character.isLetter(typedKey)){
            System.out.println(typedKey);
        }

    }

    public static void main(String[] args) throws Exception {
        WordleGameWindow window = new WordleGameWindow();
        window.setVisible(true);
    }
}
