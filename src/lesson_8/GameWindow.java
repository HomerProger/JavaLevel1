package lesson_8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    static final int WINDOW_POS_X=400;
    static final int WINDOW_POS_Y=400;
    static final int WINDOW_WIDTH=505;
    static final int WINDOW_HEIGHT=555;
    private SettingsWindow settingsWindow;
    private BattleMap battleMap;
    public GameWindow()  {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_POS_X,WINDOW_POS_Y,WINDOW_WIDTH,WINDOW_HEIGHT);
        setTitle("Крестики-нолики");


        settingsWindow=new SettingsWindow(this);
        battleMap=new BattleMap(this);

        add(battleMap,BorderLayout.CENTER);
        JPanel panel=new JPanel(new GridLayout(1,2));
        JButton buttonStartNewGame=new JButton("Начать");
        buttonStartNewGame.setBackground(Color.GREEN);
        JButton buttonExit = new JButton("Выйти");
        buttonExit.setBackground(Color.pink);
        buttonExit.addActionListener(e -> {
            System.exit(0);
        });
        buttonStartNewGame.addActionListener(e -> {
        settingsWindow.setVisible(true);
        });
        panel.add(buttonStartNewGame);
        panel.add(buttonExit);
        add(panel,BorderLayout.SOUTH);

        setVisible(true);
    }
public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin){
    System.out.printf("gameMode: %d, fieldSizeX: %d, fieldSizeY: %d, dotsToWin: %d",
            gameMode, fieldSizeX, fieldSizeY, dotsToWin);
}
}
