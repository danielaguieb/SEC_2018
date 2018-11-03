import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control {
	private Model model;
	private View view;
	
	public Control(Model m, View v) {
		model = m;
		view = v;
		
//		view.addListeners()
		
//		add as such
//		theView.addListeners(new SaveListener(), new DeleteListener(),
//				new ClearListener(), new clientIDBListener(), new lastBListener(),
//				new typeBListener(), new SearchListener(), new ClearSearchListener(),
//				new ListListener());
		
	}
	
	private int validateInt(String s) {
		int i = -1;
		try {
			i = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid number. Program terminating...");
			System.exit(1);
		}
		return i;
	}
	
	public class SubmitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO fixing these functions
			String bus_cost = view.getNewBusCost();
			String bus_cap = view.getNewBusCap();
			model.updateRoutes(bus_cost, bus_cap);
			int[] total_values = model.calculate_total_values()
			view.writeTotalValues(total_values);
		}
	}
	
	public class ListListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			int index = view.getComboBoxList().getSelectedIndex();
			model.getRoute
		}
		
	}
	
	
	
}
