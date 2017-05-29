package employeeStub;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class StubCalculatorGUI extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private int WINDOW_WIDTH = 400;
	private int WINDOW_HEIGHT = 400;
	private JTextField nameText,
					   hoursText,
					   payRateText;
	private JLabel grossText,
				   ssText,
				   medicareText,
				   federalText,
				   netText;
	private JLabel	nameLabel,
					hoursLabel,
					payRateLabel,
					grossLabel,
					ssLabel,
					medicareLabel,
					federalLabel,
					netLabel;
	private JPanel  inputPanel,
					outputPanel,
					buttonPanel;
	private JButton calculateButton;
	private DecimalFormat df = new DecimalFormat(".00");
					   
	public StubCalculatorGUI()
	{
		super("Employee Pay-Stub Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//create new panels
		inputPanel = new JPanel();
		outputPanel = new JPanel();
		buttonPanel = new JPanel();
		
		//create text fields
		nameText = new JTextField(20);
		hoursText = new JTextField(8);
		payRateText = new JTextField(8);
		grossText = new JLabel();
		ssText = new JLabel();
		medicareText = new JLabel();
		federalText = new JLabel();
		netText = new JLabel();
		
		//set borders for panels
		inputPanel.setLayout(new GridLayout(3,2));
		inputPanel.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
		outputPanel.setLayout(new GridLayout(5,2));
		outputPanel.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//set text fields to the right
		hoursText.setHorizontalAlignment(SwingConstants.RIGHT);
		payRateText.setHorizontalAlignment(SwingConstants.RIGHT);
		grossText.setHorizontalAlignment(SwingConstants.RIGHT);
		ssText.setHorizontalAlignment(SwingConstants.RIGHT);
		medicareText.setHorizontalAlignment(SwingConstants.RIGHT);
		federalText.setHorizontalAlignment(SwingConstants.RIGHT);
		netText.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		nameLabel = new JLabel("Name of Employee:");
		hoursLabel = new JLabel("Hours Worked:");
		payRateLabel = new JLabel("Pay Rate for Employee:");
		grossLabel = new JLabel("Gross Income:");
		ssLabel = new JLabel("Social Security:");
		medicareLabel = new JLabel("Medicare:");
		federalLabel = new JLabel("Fedical Withhold:");
		netLabel = new JLabel("Net Pay:");
		
		grossLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ssLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		medicareLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		federalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		netLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		inputPanel.add(nameLabel);
		inputPanel.add(nameText);
		inputPanel.add(hoursLabel);
		inputPanel.add(hoursText);
		inputPanel.add(payRateLabel);
		inputPanel.add(payRateText);
		
		outputPanel.add(grossLabel);
		outputPanel.add(grossText);
		outputPanel.add(ssLabel);
		outputPanel.add(ssText);
		outputPanel.add(medicareLabel);
		outputPanel.add(medicareText);
		outputPanel.add(federalLabel);
		outputPanel.add(federalText);
		outputPanel.add(netLabel);
		outputPanel.add(netText);
		
		add(inputPanel, BorderLayout.NORTH);
		add(outputPanel, BorderLayout.SOUTH);
		
		
		//make the calculate button the default button when user presses enter
		//JRootPane rootPane = SwingUtilities.getRootPane(calculateButton); 
		//rootPane.setDefaultButton(calculateButton);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
