import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RosettaStone implements ActionListener{
	HashMap<String, String> rs = new HashMap<String,String>();
	
	JFrame frame;
	JPanel panel;
	JButton b1;
public static void main(String[] args) {
	RosettaStone x = new RosettaStone();
	
}
RosettaStone(){
	rs.put("Mesa", "Table");
	rs.put("Zapatos", "Shoes");
	rs.put("Camisa", "Shirt");
	rs.put("Blanca", "White");
	rs.put("Tortuga", "Tortoise");
	rs.put("Agua", "Water");
	rs.put("Gato", "Cat");
	rs.put("Playa", "Beach");
	rs.put("Biblioteca", "Library");
	rs.put("Dinero", "Money");
	rs.put("Pollo", "Chicken");
	rs.put("Soup", "Sopa");
	rs.put("Verduras", "Vegtables");
	rs.put("Computadora", "Computer");
	rs.put("Telephono", "TelePhone");
	
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 200);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	
	b1 = new JButton("Mesa");
	
	panel.add(b1);
	frame.add(b1);
	b1.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == b1) {
		b1.setText("Table");
	}
	
	b1.setText(getRandomKey(rs));


}
String getRandomKey(HashMap<String, String> rs) {
	String[] keysAsArray = rs.keySet().toArray(new String[0]);
	int randomness = new Random().nextInt(rs.size());
	return keysAsArray[randomness];
}

}
