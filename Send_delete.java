package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Send_delete extends JFrame {
	private JTextField textField;
	JLabel 输入 = new JLabel("\u8BF7\u8F93\u5165\u8981\u5220\u9664\u7684\u8BA2\u5355\u7F16\u53F7");
	JButton 确认 = new JButton("\u786E\u8BA4");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	
	public void delete(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				System.out.println("输入的数："+str);
				int i;
				for(i=0;i<all.publish.arry.size();i++) {
					Y_Addresser_Collection g=all.publish.arry.get(i);
					System.out.println("长度："+all.publish.arry.size());
					if(str.contentEquals(g.parcel_ID)&&usertele==g.usertele) {
						System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
						dispose();
						Send_little1 a=new Send_little1();
						a.little1(all,usertele);
						a.setVisible(true);
						try {
							all.mysql.deletepick(str);
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					}
				}
				System.out.println("i："+i);
				if(i==all.picker.pickerarry.size()) {
					dispose();
				Send_deletewrong a=new Send_deletewrong();
				a.deletewrong(all, usertele);
				a.setVisible(true);
				}
			}
		});
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_delete() {
		this.setTitle("删除订单");
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		输入.setFont(new Font("宋体", Font.PLAIN, 20));
		输入.setBounds(91, 57, 220, 30);
		getContentPane().add(输入);
		
		textField = new JTextField();
		textField.setBounds(91, 102, 220, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		确认.setBounds(61, 200, 123, 29);
		getContentPane().add(确认);
		
		
		
		返回.setBounds(222, 200, 123, 29);
		getContentPane().add(返回);
	}
}
