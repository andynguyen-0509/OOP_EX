package hust.soict.hedspi.aims.Aims;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import  hust.soict.hedspi.aims.media.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class ExFrame extends JFrame {
    
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTable table;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExFrame frame = new ExFrame();
					frame.setTitle("H_Shop");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public ExFrame() {
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King");
		 dvd1.setCategory("Animation");
		 dvd1.setLength(87);
		 dvd1.setCost(19.95f);
		 dvd1.setDirector("Roller Allers");

		 
		 DigitalVideoDisc dvd2= new DigitalVideoDisc("The Star War");
		 dvd2.setCost(24.95f);
		 dvd2.setCategory("Animation");
		 dvd2.setDirector("Georgle Lucas");
		 
		 DigitalVideoDisc dvd3= new DigitalVideoDisc("Fly");
		 dvd3.setCost(23.05f);
		 dvd3.setCategory("Animation");
		 dvd3.setDirector("Georgle Regard");
		 
		 DigitalVideoDisc dvd4= new DigitalVideoDisc("Alice in Wonderland");
		 dvd4.setCost(25.05f);
		 dvd4.setCategory("Animation");
		 dvd4.setDirector("Anwar Regard");
		 
		 Book book1 = new Book("The happy","Comic");
		 book1.setCost(19.05f);
		 //book1.setAuthors("Author Hard");
		 Media[] media = new Media[5];
		 media[0]=dvd1;
		 media[1]=dvd2;
		 media[2]= dvd3;
		 media[3]= dvd4;
		 media[4]=book1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(57, 223, 400, 200);
		panel.add(textArea);
		
	
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DVD", "CD ", "Book"}));
		comboBox.setBounds(142, 116, 150, 35);
		panel.add(comboBox);
		
		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String selected = comboBox.getSelectedItem().toString();
	    if(selected=="DVD") {
	    	for(int i=0;i<4;i++)
	     textArea.append((i+1)+". "+media[i].getTitle()+"\n");
	    
	    }
		}
		});
		btnNewButton.setBounds(323, 116, 85, 35);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(57, 107, 100, 50);
		panel.add(lblNewLabel);
		
		
	      //  JTable jt = new JTable(data);
	     
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
	/*	table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);*/
		jt.setBounds(491, 25, 335, 200);
		panel.add(jt);
		
	
		
		
		
		
	}
}
