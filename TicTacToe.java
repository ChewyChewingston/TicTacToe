import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    public static int clickedAmt =0;
    public JFrame f;

    public TicTacToe(){
        super("TicTacToe Buttons");
        setResizable(false);
        setSize(100, 100);
        Init();
    } 

    public void actionPerformed(ActionEvent event){

    }

    public void Init(){
        JFrame f=new JFrame("Tic-Tac-Toe");  
        int xcoord = 20;
        int ycoord = 20;
       // int clickAmt =0;
        ImageIcon imgX = new ImageIcon("/Users/Wendy/Documents/Code/Visual_Studio_Code/X.png");
        ImageIcon imgO = new ImageIcon("/Users/Wendy/Documents/Code/Visual_Studio_Code/O.png");
        
        for(int i = 1; i<=9; i++){
            if(xcoord>180){
                ycoord = ycoord + 80;
                xcoord=20;
            }
            JButton btn = new JButton();
            btn.setBounds(xcoord,ycoord, 75, 75);
            xcoord = xcoord+80;
            
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    clickedAmt++;
                    if(clickedAmt%2== 0){
                        btn.setIcon(imgO);
                    }else{
                        btn.setIcon(imgX);
                    }
                    btn.setEnabled(false);
                }
            });

            f.add(btn);
        }
        
        f.setSize(300,320);  
		f.setLayout(null);    
		f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
       // System.out.println("Hello World");
    }

    public static void main(String[] args) {    
        TicTacToe ttt = new TicTacToe();  
       // ttt.HelloWorld();
	}    
}