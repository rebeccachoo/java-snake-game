import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame() { 
		
		this.add(new GamePanel()); 
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.pack(); // it actually going to take our jframe and fit it around all of the components
		this.setVisible(true);
		this.setLocationRelativeTo(null); // put the screen at the middle
	}
}
