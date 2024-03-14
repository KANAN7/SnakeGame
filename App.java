import javax.swing.*;
public class App{

    public static void main(String[] args) {
        int boardWidth=600;
        int boardHeight=boardWidth;

        JFrame frame=new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(boardWidth, boardHeight);
        frame.setVisible(true);

        SnakeGame snakeGame=new SnakeGame(boardWidth,boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus(); 
    }
}