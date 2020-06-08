package lesson_8;

import javax.swing.*;
import java.awt.*;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.GRAY);

    }
}
