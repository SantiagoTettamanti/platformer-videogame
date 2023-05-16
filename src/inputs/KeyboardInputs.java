package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Game;
import main.GamePanel;
import static utils.Constants.Directions.*;



public class KeyboardInputs implements KeyListener {    //<--When you implement you have to actually implement all
                                                        //   methods provided in the interface (KeyListener)
                                                        // It's versatile, could work with Xbox controller.

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.getGame().getPLayer().setDirection(UP);
            case KeyEvent.VK_A -> gamePanel.getGame().getPLayer().setDirection(LEFT);
            case KeyEvent.VK_S -> gamePanel.getGame().getPLayer().setDirection(DOWN);
            case KeyEvent.VK_D -> gamePanel.getGame().getPLayer().setDirection(RIGHT);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_A:
            case KeyEvent.VK_S:
            case KeyEvent.VK_D:
                gamePanel.getGame().getPLayer().setMoving(false);
                break;
        }
    }
}
