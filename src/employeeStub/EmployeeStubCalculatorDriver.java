package employeeStub;

import javax.swing.SwingUtilities;

public class EmployeeStubCalculatorDriver 
{

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater
		(
				new Runnable()
				{
					@Override
					public void run()
					{
						new StubCalculatorGUI();
					}
				}
		);

	}

}
