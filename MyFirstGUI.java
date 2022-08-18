import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstGUI implements ActionListener {
	
    private int clicks = 5;
    private JLabel label = new JLabel("Number of clicks:  5     ");
    private JLabel label1 = new JLabel("Simple Window with buttons and counter, will close at 0 and 20");
    private JFrame frame = new JFrame();

    //create 2 button.
    private JButton button = new JButton("Plus one Button");
    private JButton button1 = new JButton("Minus one Button");        
    
    public MyFirstGUI() {

 //     button action
        button.addActionListener(this);
    	button1.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(70, 70, 50, 70));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button1);
        panel.add(label);
        panel.add(label1);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MyFirstGUI");
        frame.pack();
        frame.setVisible(true);
        
        ImageIcon logoicon = new ImageIcon("R2D2.png");
		Image logo = logoicon.getImage();
		frame.setIconImage(logo);
    }

    // process the button clicks
 
    public void actionPerformed(ActionEvent evt) {
        
    	if (evt.getSource() == button) {
    	clicks++;
        label.setText("Number of clicks:  " + clicks);
        	if (clicks==21) {
        		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
         }
    	}
    	
        else if (evt.getSource() == button1) {
        clicks--;
        label.setText("Number of clicks:  " + clicks);
        	if (clicks==-1) {
        		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        
        }	
      }
    }
    
    // create one Frame
    public static void main(String[] args) {
        new MyFirstGUI();
    }
}
