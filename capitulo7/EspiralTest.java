package capitulo7;
import javax.swing.JFrame;

public class EspiralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espiral panel = new Espiral();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(400,400);
		app.setVisible(true);
	}

}
