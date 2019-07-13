package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_update extends JFrame{

	//private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	JLabel 收件人信息 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F:");
	JLabel 收货人信息 = new JLabel("\u6536\u8D27\u4EBA\u4FE1\u606F:");
	JLabel 接收时间段 = new JLabel("\u63A5\u6536\u65F6\u95F4\u6BB5:");
	JLabel 联系电话 = new JLabel("\u8054\u7CFB\u7535\u8BDD:");
	JLabel 送货详细地址 = new JLabel("\u9001\u8D27\u8BE6\u7EC6\u5730\u5740:");
	JLabel 货物信息 = new JLabel("\u8D27\u7269\u8BE6\u7EC6\u4FE1\u606F\uFF1A");
	JLabel 数量 = new JLabel("\u6570\u91CF:");
	JLabel 体积 = new JLabel("\u4F53\u79EF:");
	JLabel 重量 = new JLabel("\u91CD\u91CF:");
	JLabel 单号 = new JLabel("\u5355\u53F7:");
	JButton 确认 = new JButton("\u786E\u8BA4");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	//JButton 返回 = new JButton("\u8FD4\u56DE");
	
	 void update(final A_allinformation all,final String usertele){
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
				dispose();
				Send_little2 a=new Send_little2();
				a.little2(all,usertele);
				a.setVisible(true);
			}
		});
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_innum b=new Send_innum();
				b.innum(all,usertele);
				b.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_update() {
		this.setTitle("修改订单");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 710, 628);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		收件人信息.setFont(new Font("宋体", Font.BOLD, 24));
		收件人信息.setBounds(15, 15, 147, 45);
		getContentPane().add(收件人信息);
		
		
		收货人信息.setFont(new Font("宋体", Font.PLAIN, 20));
		收货人信息.setBounds(10, 75, 120, 21);
		getContentPane().add(收货人信息);
		
		textField = new JTextField();
		textField.setBounds(131, 72, 252, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		接收时间段.setFont(new Font("宋体", Font.PLAIN, 20));
		接收时间段.setBounds(10, 111, 115, 31);
		getContentPane().add(接收时间段);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 113, 252, 29);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		联系电话.setFont(new Font("宋体", Font.PLAIN, 20));
		
		
		联系电话.setBounds(10, 157, 105, 31);
		getContentPane().add(联系电话);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 157, 253, 31);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		送货详细地址.setFont(new Font("宋体", Font.PLAIN, 20));
		送货详细地址.setBounds(10, 212, 137, 31);
		getContentPane().add(送货详细地址);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 214, 243, 31);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		数量.setFont(new Font("宋体", Font.PLAIN, 20));
		数量.setBounds(15, 348, 81, 21);
		getContentPane().add(数量);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 345, 96, 27);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		体积.setFont(new Font("宋体", Font.PLAIN, 20));
		体积.setBounds(219, 348, 81, 21);
		getContentPane().add(体积);
		
		textField_5 = new JTextField();
		textField_5.setBounds(276, 343, 107, 32);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		重量.setFont(new Font("宋体", Font.PLAIN, 20));
		重量.setBounds(15, 425, 81, 21);
		getContentPane().add(重量);
		
		textField_6 = new JTextField();
		textField_6.setBounds(98, 422, 96, 27);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		
		单号.setFont(new Font("宋体", Font.PLAIN, 20));
		单号.setBounds(219, 425, 81, 21);
		getContentPane().add(单号);
		
		textField_7 = new JTextField();
		textField_7.setBounds(276, 422, 107, 27);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		
		
		确认.setBounds(152, 528, 123, 29);
		getContentPane().add(确认);
		
		
		
		返回.setBounds(419, 528, 123, 29);
		getContentPane().add(返回);
		
		
		货物信息.setFont(new Font("宋体", Font.BOLD, 24));
		货物信息.setBounds(15, 286, 179, 39);
		getContentPane().add(货物信息);
	}
}
