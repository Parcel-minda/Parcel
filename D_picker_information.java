package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_picker_information extends JFrame{
	
	JLabel 取货员信息= new JLabel("\u53D6\u8D27\u5458\u4FE1\u606F");
	JLabel 姓名= new JLabel("\u59D3\u540D");
	JLabel 身份证号= new JLabel("\u8EAB\u4EFD\u8BC1\u53F7");
	JLabel 手机号= new JLabel("\u624B\u673A\u53F7");
	JLabel 注册账号 = new JLabel("\u6CE8\u518C\u8D26\u53F7");
	JLabel 联系地址 = new JLabel("\u8054\u7CFB\u5730\u5740");
	JLabel 所在学校 = new JLabel("\u6240\u5728\u5B66\u6821");
	JButton 保存 = new JButton("\u4FDD\u5B58");
	JButton 删除 = new JButton("\u5220\u9664");
	JButton 取消 = new JButton("\u53D6\u6D88");
	JButton 退出 = new JButton("\u9000\u51FA");
	
	
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	public void pick_update(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//B_pick window = new B_pick();
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		保存.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_store_success a=new D_store_success();
				a.store(all,usertele);
		        a.setVisible(true);
			}
		});
		退出.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	
	public D_picker_information() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		取货员信息.setBounds(195, 25, 66, 15);
		getContentPane().add(取货员信息);
		
		
		姓名.setBounds(50, 60, 54, 15);
		getContentPane().add(姓名);
		
		textField = new JTextField();
		textField.setBounds(114, 57, 66, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		身份证号.setBounds(268, 60, 54, 15);
		getContentPane().add(身份证号);
		
		textField_1 = new JTextField();
		textField_1.setBounds(347, 57, 66, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		手机号.setBounds(50, 95, 54, 15);
		getContentPane().add(手机号);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 92, 66, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		注册账号.setBounds(268, 95, 54, 15);
		getContentPane().add(注册账号);
		
		textField_3 = new JTextField();
		textField_3.setBounds(347, 92, 66, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		联系地址.setBounds(50, 138, 54, 15);
		getContentPane().add(联系地址);
		
		textField_4 = new JTextField();
		textField_4.setBounds(114, 135, 66, 21);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
	    所在学校.setBounds(268, 138, 54, 15);
		getContentPane().add(所在学校);
		
		textField_5 = new JTextField();
		textField_5.setBounds(347, 135, 66, 21);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		保存.setBounds(24, 205, 72, 23);
		getContentPane().add(保存);
		
		
		删除.setBounds(138, 205, 66, 23);
		getContentPane().add(删除);
		
		
		取消.setBounds(244, 205, 66, 23);
		getContentPane().add(取消);
		
		
		退出.setBounds(341, 205, 72, 23);
		getContentPane().add(退出);
	}
}
