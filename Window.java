import javax.swing.JFrame;

public class Window {
//where the window for the game is being created(by jframe)
	
	public Window(String title, Main game) {
    //constructor takes paramater for the title and a game.
		JFrame frame = new JFrame(title);
  //title is being added to the Jframe 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //closes the game when X is being clicked on
		frame.setResizable(false);
    //window is not be allowed to be resized
		frame.add(game); 
    //The window gets the  game from main class( Main game)
		frame.pack();
    //packs the game so all the components can fit.
		 frame.setLocationRelativeTo(null);
    //the game is centered.
		frame.setVisible(true);
    //the game is visible
	}

}