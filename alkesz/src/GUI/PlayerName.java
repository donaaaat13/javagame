package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerName extends JPanel {
    public PlayerName(){

        JPanel playername = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(700, 800);
            };
        };
        playername.setLayout(null);
        add(playername);
        playername.setBackground(Color.white);
        playername.setVisible(true);


        JLabel alkeszLabel = new JLabel("AlkeszTheGame");
        alkeszLabel.setBounds(170, 60, 500, 120);
        alkeszLabel.setHorizontalTextPosition(JLabel.CENTER);
        playername.add(alkeszLabel);
        alkeszLabel.setFont(new Font("Sans", Font.PLAIN, 50));

        JLabel menuLabel = new JLabel("MEN");
        menuLabel.setBounds(225, 200, 250, 120);
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        playername.add(menuLabel);
        menuLabel.setFont(new Font("Sans", Font.BOLD, 60));

        JButton single = new JButton("SinglePlayer");
        single.setBounds(236, 315, 230, 60);
        playername.add(single);
        single.setBackground(Color.DARK_GRAY);
        single.setForeground(Color.white);
        single.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DataField.currentpanel = "PlayerName";
                System.out.println(DataField.currentpanel);
                playername.setVisible(false);
                MenuSystem ms = new MenuSystem();
                ms.drawWindow();
            }
        });

        JButton multi = new JButton("MultiPlayer");
        multi.setBounds(236, 380, 230, 60);
        playername.add(multi);
        multi.setBackground(Color.DARK_GRAY);
        multi.setForeground(Color.white);

        JButton scoreboard = new JButton("ScoreBoard");
        scoreboard.setBounds(236, 445, 230, 60);
        playername.add(scoreboard);
        scoreboard.setBackground(Color.DARK_GRAY);
        scoreboard.setForeground(Color.white);

    }
}
