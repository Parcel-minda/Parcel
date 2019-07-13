package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class A_enter extends JFrame{

	private JTextField ÊÖ»úºÅ;
	private JTextField ÃÜÂë;
     JButton µÇÂ¼ = new JButton("\u767B\u5F55");
		JButton È¡Ïû = new JButton("\u53D6\u6D88");
		JButton ×¢²á = new JButton("\u6CE8\u518C");
	/**
	 * Launch the application.
	 */
	public void enter(final A_allinformation  member){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		×¢²á.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				A_login login=new A_login();
				try {
					login.login(member);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				login.setVisible(true);
			}
		});
		µÇÂ¼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				int i=0;
				String str1=ÊÖ»úºÅ.getText();
				String str2=ÃÜÂë.getText();
				for(i=0;i<member.member.Memberarry.size();i++) {
					Y_Member g=member.member.Memberarry.get(i);
					if(str1!=null&&g.telenum.contentEquals(str1)&&g.secret.contentEquals(str2)) {
						JOptionPane.showMessageDialog(null, "µÇÂ½³É¹¦!~");
						dispose();
						//ÌøÈëÖ÷½çÃæ----------------------------------------
						B_center center=new B_center();
						center.center_main(member,g.telenum);
						center.setVisible(true);
						return;
					}
					}
					if(i==member.member.Memberarry.size()) {
						JOptionPane.showMessageDialog(null, "µÇÂ½Ê§°Ü£¡~");
						dispose();
			  			A_enter enter=new A_enter();
			  			enter.enter(member);
			  			enter.setVisible(true);
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public A_enter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setFont(new Font("ËÎÌå", Font.PLAIN, 12));
		setBounds(100, 100, 450, 395);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u767B\u5F55");
		label.setFont(new Font("ËÎÌå", Font.BOLD, 24));
		label.setBounds(178, 0, 84, 56);
		getContentPane().add(label);
		
		JLabel label_2 = new JLabel("\u624B\u673A\u53F7\uFF1A");
		label_2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_2.setBounds(37, 56, 89, 42);
		getContentPane().add(label_2);
		
		ÊÖ»úºÅ = new JTextField();
		ÊÖ»úºÅ.setBounds(128, 60, 252, 32);
		getContentPane().add(ÊÖ»úºÅ);
		ÊÖ»úºÅ.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		label_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_1.setBounds(38, 106, 92, 51);
		getContentPane().add(label_1);
		
		ÃÜÂë = new JTextField();
		ÃÜÂë.setBounds(128, 112, 253, 34);
		getContentPane().add(ÃÜÂë);
		ÃÜÂë.setColumns(10);
		
		
		µÇÂ¼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		µÇÂ¼.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		µÇÂ¼.setBounds(41, 229, 344, 38);
		getContentPane().add(µÇÂ¼);
		
		È¡Ïû.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		È¡Ïû.setBounds(41, 283, 343, 38);
		getContentPane().add(È¡Ïû);
		
		JCheckBox checkBox = new JCheckBox("\u8BB0\u4F4F\u5BC6\u7801");
		checkBox.setFont(new Font("·ÂËÎ", Font.PLAIN, 18));
		checkBox.setBounds(37, 174, 115, 32);
		getContentPane().add(checkBox);
		
		JButton Íü¼ÇÃÜÂë = new JButton("\u5FD8\u8BB0\u5BC6\u7801");
		Íü¼ÇÃÜÂë.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Íü¼ÇÃÜÂë.setFont(new Font("·ÂËÎ", Font.PLAIN, 18));
		Íü¼ÇÃÜÂë.setBounds(138, 175, 114, 31);
		getContentPane().add(Íü¼ÇÃÜÂë);
		
		×¢²á.setFont(new Font("·ÂËÎ", Font.PLAIN, 18));
		×¢²á.setBounds(269, 176, 112, 32);
		getContentPane().add(×¢²á);
	}
}
