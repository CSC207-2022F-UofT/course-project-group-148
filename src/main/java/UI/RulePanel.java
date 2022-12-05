package UI;

import UseCase.GameBoard.GameboardController;
import UseCase.GlobalStatus.StatusController;
import UseCase.Identity;
import UseCase.PlayerJoin.PlayerJoinController;
import UseCase.PlayerJoin.PlayerJoinResponseModel;
import UseCase.PlayerJoin.PlayerJoinUpdatable;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RulePanel extends JPanel{

    private PlayerJoinController playerJoinController;

    public RulePanel(){
//        this.ruleFrame = new JFrame("Rule");
//        ruleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920, 1080);

        this.setLayout(null);
        Image bg = null;
        try {
            bg = ImageIO.read(new File("src/main/resource/rulesbg.jpg"));
        } catch (IOException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        this.setBackground(Color.black);

//        JLabel myLabel = new JLabel(new ImageIcon(bg));
//        myLabel.setSize(1920,1080);


        BufferedImage rules = null;
        try {
            rules = ImageIO.read(new File("src/main/resource/rules.png"));
        } catch (IOException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        assert rules != null;
        JLabel myLabel1 = new JLabel(new ImageIcon(rules));
        myLabel1.setBounds(200,5,1000,700);
        this.add(myLabel1);

        JComboBox<String> players = new JComboBox<>(new String[] {"1","2","3","4","5"});
        players.setBounds(450, 510,300,500);


        JLabel choose = new JLabel("Human Players");
        choose.setForeground(Color.white);
        choose.setFont(new Font("Calibri", Font.BOLD, 18));
        choose.setBounds(450,710, 200, 50);

        JButton cont = new JButton("continue");
        cont.setBounds(850,710,100,50);
        cont.addActionListener(e -> {
            String num = (String) players.getSelectedItem();
            assert num != null;
            int i = Integer.parseInt(num);
            playerJoinController.playersJoin(i);
        });


        this.add(cont);
//        this.add(myLabel);
        this.add(players);
        this.add(choose);
        this.setVisible(false);
    }

    public void setPlayerJoinController(PlayerJoinController playerJoinController) {
        this.playerJoinController = playerJoinController;
    }
}
