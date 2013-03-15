package edu.ycp.cs320.gamingwebsite.shared;
/**
 * This class will start the game. 
 * @author shamor1
 *
 */


public class Start {
	/**This is the UI instruction for the kaboom game, needs to be implemented into our project. 
	 * 
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// Create the Game object that represents the game state
				Game game = new Game();
				
				// Create the KabomView that will visualize the game state
				KaboomView view = new KaboomView(game);

				// Create a frame (top-level window) to enclose the KaboomView
				JFrame frame = new JFrame();
				frame.setTitle("Kaboom!");
				frame.setContentPane(view);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				
				// Start the game!
				view.startGame();
				
				// Make the frame visible
				frame.setVisible(true);
			}
		});
	}
	**/
}
