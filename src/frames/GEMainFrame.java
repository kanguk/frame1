package frames;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import constans.GEConstants;

@SuppressWarnings("serial")
public class GEMainFrame extends JFrame{
	
	private static GEMainFrame uniqueMainFrame =
			new GEMainFrame(GEConstants.TITLE_MAINFRAME);
	private GEDrawingPanel drawingPanel;
	
	private GEMainFrame(String title){
		super(title);
		
		drawingPanel = new GEDrawingPanel();
		add(drawingPanel);
	}
	
	public static GEMainFrame getInstance(){
		return uniqueMainFrame;
	}
	
	public void init(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(GEConstants.WIDTH_MAINFRAME,GEConstants.HEIGHT_MAINFRAME);
		setVisible(true);
	}
}
