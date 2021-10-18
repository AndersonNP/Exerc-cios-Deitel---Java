package capitulo7;
import javax.swing.JFrame;

public class EspiralQuadradaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EspiralQuadrada panel = new EspiralQuadrada();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(400,400);
		app.setVisible(true);
	}

}
