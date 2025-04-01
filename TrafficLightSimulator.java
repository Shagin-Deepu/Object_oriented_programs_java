import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener 
{
	private JButton redButton,yellowButton, greenButton;
	private Jpanel lightPanel;
	
	public TrafficlightSimulator ()
	{
		setTitle("Traffic Light  Simulator ");
		setSize(200);
		setLayout(new JButton("Red");
		yellowButton = new JButton("Yellow");
		greenButton = new JButton("Green");
		
		redButton.addActionListner(this);
		yellowButton.addActionListener(this);
		greenButton.addActionListner(this);
		
		lightPanel = new JPanel();
		lightPanel.setBackground(color.LIGHT_GREY);
		
		JPanel buttonPanel = new JPanel ();
		buttonPanel.add(redButton);
		buttonPanel.add (greenButton);
		
		add(lightPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@override
	public void actionPerformed (ActionEvent e )
	{
		redButton.setBackground(null);
		yellowbutton.setBackground(null);
		greenButton.setBackground(null);
		
		JButton clicked = (JButton) e.getSource();
		switch (clickButton.getText())	{
			case "Red" :
				lightPanel.setBackground(Color.RED);
				break;
			case "Yellow":
				lightPanel.setBackground(Color .YELLOW);
			case "Green":
				lightPanel.setBackground(Color.GREEN);
				break;
		}
	}
}
	
	
	
	
	
	
	
	
	
	
