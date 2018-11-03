import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.*;

public class View extends JFrame{
	private Container container;
	
	JLabel total,BussesDeployed, Cost, CommuteTime, BusCostLabel, BusCapLabel;
	JTextField BusCostEntry, BusCapEntry;
	JButton submit;
	JComboBox route;
	
	
	
	
	View(){
		createFrame();
		
		setTitle("Customizable Window");
		setSize(420,315);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void createFrame(){
		
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		getContentPane().add(mainPanel);
		
		JPanel totalPanel = new JPanel(new BorderLayout());
		mainPanel.add(totalPanel,BorderLayout.SOUTH);
		
		JPanel busInfoPanel = new JPanel(new BorderLayout());
		mainPanel.add(busInfoPanel,BorderLayout.NORTH);
		
		JPanel routeInfoPanel = new JPanel(new BorderLayout());
		mainPanel.add(routeInfoPanel,BorderLayout.CENTER);
		
		
		//working on totalPanel
		total = new JLabel("Total");
		totalPanel.add(total,BorderLayout.WEST);
		
		JPanel totalInfoPanel = new JPanel(new BorderLayout());
		totalPanel.add(totalInfoPanel,BorderLayout.EAST);
		
		BussesDeployed = new JLabel("Busses Deployed");
		totalInfoPanel.add(BussesDeployed,BorderLayout.WEST);
		
		Cost = new JLabel("Cost");
		totalInfoPanel.add(Cost,BorderLayout.CENTER);
		
		CommuteTime = new JLabel("Commute Time");
		totalInfoPanel.add(CommuteTime,BorderLayout.EAST);
		
		
		//working on busInfoPanel
		JPanel busCost = new JPanel(new BorderLayout());
		busInfoPanel.add(busCost,BorderLayout.WEST);
		
		BusCostLabel = new JLabel();
		busCost.add(BusCostLabel, BorderLayout.WEST);
		BusCostEntry = new JTextField();
		busCost.add(BusCostEntry, BorderLayout.EAST);
		
		JPanel busCap = new JPanel(new BorderLayout());
		busInfoPanel.add(busCap,BorderLayout.CENTER);
		
		BusCapLabel = new JLabel();
		busCap.add(BusCapLabel, BorderLayout.WEST);
		BusCapEntry = new JTextField();
		busCap.add(BusCapEntry, BorderLayout.EAST);
		
		submit = new JButton();
		busInfoPanel.add(submit, BorderLayout.EAST);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			View gui = new View();
			gui.setVisible(true);
		});
	}
	
	
}
