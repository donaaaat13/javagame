package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SingleOrMulti extends JPanel {
    public SingleOrMulti() {

        JPanel menu = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(700, 800);
            };
        };
        menu.setLayout(null);
        add(menu);
        menu.setBackground(Color.white);
        menu.setVisible(true);


        JLabel alkeszLabel = new JLabel("AlkeszTheGame");
        alkeszLabel.setBounds(170, 60, 500, 120);
        alkeszLabel.setHorizontalTextPosition(JLabel.CENTER);
        menu.add(alkeszLabel);
        alkeszLabel.setFont(new Font("Sans", Font.PLAIN, 50));

        JLabel menuLabel = new JLabel("MENU");
        menuLabel.setBounds(225, 200, 250, 120);
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menu.add(menuLabel);
        menuLabel.setFont(new Font("Sans", Font.BOLD, 60));

        JButton single = new JButton("SinglePlayer");
        single.setBounds(236, 315, 230, 60);
        menu.add(single);
        single.setBackground(Color.DARK_GRAY);
        single.setForeground(Color.white);
        single.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DataField.currentpanel = "PlayerName";
                System.out.println(DataField.currentpanel);
                menu.setVisible(false);
                MenuSystem ms = new MenuSystem();
                ms.drawWindow();
            }
        });

        JButton multi = new JButton("MultiPlayer");
        multi.setBounds(236, 380, 230, 60);
        menu.add(multi);
        multi.setBackground(Color.DARK_GRAY);
        multi.setForeground(Color.white);

        JButton scoreboard = new JButton("ScoreBoard");
        scoreboard.setBounds(236, 445, 230, 60);
        menu.add(scoreboard);
        scoreboard.setBackground(Color.DARK_GRAY);
        scoreboard.setForeground(Color.white);

    }
}
