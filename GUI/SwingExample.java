import javax.swing.*;

public class SwingExample {  
	public static void main(String[] args) {  
		JFrame f = new JFrame();//creating instance of JFrame  

		JButton init_button = new JButton("Start");//creating instance of JButton  
		JButton secondary_button = new JButton("Secondary");

		init_button.setBounds(200,100,100, 40);//x axis, y axis, width, height  
        secondary_button.setBounds(50,150,400,30);

		f.add(init_button);//adding button in JFrame  
        f.add(secondary_button);

		f.setSize(500,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}