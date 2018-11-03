import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.*;

public class View extends JFrame{
	private Container container;
	
	JLabel BussesDeployed, Cost, CommuteTime, BusCostLabel, BusCapLabel,Busses;
	JTextField BusCostEntry, BusCapEntry, BusNum;
	JTextArea Info;
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
		
		JPanel totalPanel = new JPanel(new GridLayout(3,1));
		mainPanel.add(totalPanel,BorderLayout.SOUTH);
		
		JPanel busInfoPanel = new JPanel(new GridBagLayout());
		mainPanel.add(busInfoPanel,BorderLayout.NORTH);
		
		JPanel routeInfoPanel = new JPanel(new BorderLayout());
		mainPanel.add(routeInfoPanel,BorderLayout.CENTER);
		
		
		//working on totalPanel
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx=0;
		
		BussesDeployed = new JLabel("Total Busses Deployed");
		totalPanel.add(BussesDeployed);
		c.gridx++;
		
		Cost = new JLabel("Total Cost");
		totalPanel.add(Cost);
		c.gridx++;
		
		CommuteTime = new JLabel("Total Commute Time");
		totalPanel.add(CommuteTime);
		c.gridx=0;
		
		//working on busInfoPanel
		BusCostLabel = new JLabel("Bus Cost");
		busInfoPanel.add(BusCostLabel);
		
		BusCostEntry = new JTextField(7);
		busInfoPanel.add(BusCostEntry);
		
		BusCapLabel = new JLabel("Bus Capacity");
		busInfoPanel.add(BusCapLabel);
	
		BusCapEntry = new JTextField(7);
		busInfoPanel.add(BusCapEntry);
		
		submit = new JButton("Submit");
		busInfoPanel.add(submit);
		
		
		//working on route info panel
	
		
		Info = new JTextArea();
		Info.setEditable(false);
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		JScrollPane scroll= new JScrollPane(Info);
		routeInfoPanel.add(Info,BorderLayout.CENTER);
		routeInfoPanel.add(scroll);

		
		JPanel routeSelect = new JPanel(new GridLayout(1,2));
		routeInfoPanel.add(routeSelect,BorderLayout.NORTH);
		
		route = new JComboBox();
		routeSelect.add(route);
		
		JPanel bussesPanel = new JPanel();
		routeSelect.add(bussesPanel);
		Busses = new JLabel("Busses");
		bussesPanel.add(Busses);
		BusNum = new JTextField(5);
		bussesPanel.add(BusNum);
		
		
		
		
		
	
		
		/*
		JPanel busCost = new JPanel(new BorderLayout());
		busInfoPanel.add(busCost,BorderLayout.WEST);
		
		BusCostLabel = new JLabel("Bus Cost");
		busCost.add(BusCostLabel, BorderLayout.WEST);
		BusCostEntry = new JTextField(7);
		busCost.add(BusCostEntry, BorderLayout.EAST);
		
		JPanel busCap = new JPanel(new BorderLayout());
		busInfoPanel.add(busCap,BorderLayout.CENTER);
		
		BusCapLabel = new JLabel("Bus Capacity");
		busCap.add(BusCapLabel, BorderLayout.WEST);
		BusCapEntry = new JTextField(7);
		busCap.add(BusCapEntry, BorderLayout.EAST);
		
		submit = new JButton("Submit");
		busInfoPanel.add(submit, BorderLayout.EAST);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			View gui = new View();
			gui.setVisible(true);
		});
	}
	
	
}
