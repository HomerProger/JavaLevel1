package lesson_8;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {
    static final int WINDOW_POS_X=GameWindow.WINDOW_POS_X+50;
    static final int WINDOW_POS_Y=GameWindow.WINDOW_POS_Y+50;
    static final int WINDOW_WIDTH=GameWindow.WINDOW_WIDTH-100;
    static final int WINDOW_HEIGHT=400;
    private GameWindow gameWindow;

    private static final int MIN_FIELD_SIZE=3;
    private static final int MAX_FIELD_SIZE=10;

    static final int MODE_H_VS_A=0;
    static final int MODE_H_VS_H=1;

    private JRadioButton radioButtonHvsH=new JRadioButton("Человек-Человек");
    private JRadioButton radioButtonHvsAi=new JRadioButton("Человек-Компьютер", true);
    private ButtonGroup gameMode=new ButtonGroup();
    private JSlider sliderFieldSize=new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
    private JSlider sliderDotsToWin=new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);



    public SettingsWindow(GameWindow gameWindow)  {
        this.gameWindow=gameWindow;
        setBounds(WINDOW_POS_X,WINDOW_POS_Y,WINDOW_WIDTH,WINDOW_HEIGHT);
        setTitle("Настройки игры");

        setLayout(new GridLayout(8,1));

        add(new JLabel("Выберите режим игры"));
        add(radioButtonHvsAi);
        add(radioButtonHvsH);
        gameMode.add(radioButtonHvsAi);
        gameMode.add(radioButtonHvsH);
        add(new JLabel("Выберите размер игрового поля"));
        sliderFieldSize.setMajorTickSpacing(1);
        sliderFieldSize.setPaintLabels(true);
        sliderFieldSize.setPaintTicks(true);
        add(sliderFieldSize);
        add(new JLabel("Выберите длину победной линии"));
        sliderDotsToWin.setMajorTickSpacing(1);
        sliderDotsToWin.setPaintLabels(true);
        sliderDotsToWin.setPaintTicks(true);
        add(sliderDotsToWin);
        sliderFieldSize.addChangeListener(e -> {
            sliderDotsToWin.setMaximum(sliderFieldSize.getValue());
        });
        JButton buttonStartNewGame= new JButton("Начать игру");
        buttonStartNewGame.setBackground(Color.GREEN);
        add(buttonStartNewGame);
        buttonStartNewGame.addActionListener(e -> {
            setVisible(false);

            int mode;
            if(radioButtonHvsAi.isSelected()){
                mode=MODE_H_VS_A;
            }else {
                mode=MODE_H_VS_H;
            }
            int fieldSize=sliderFieldSize.getValue();
            int dotsToWin=sliderDotsToWin.getValue();
gameWindow.startNewGame(mode,fieldSize,fieldSize,dotsToWin);
        });


        setVisible(false);
    }
}
