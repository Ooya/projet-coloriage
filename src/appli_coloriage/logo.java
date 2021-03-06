package appli_coloriage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
 
public class logo extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		g.setColor(new Color(229, 229, 229));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		ClassLoader myClassLoaderLOGO = Thread.currentThread().getContextClassLoader();
		Toolkit tkLOGO = Toolkit.getDefaultToolkit();
		Image img = tkLOGO.getImage(myClassLoaderLOGO.getResource("logo_accueil.jpg"));
		
		g.drawImage(img, 0, 0, this);
	}
}