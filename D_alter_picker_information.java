package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_alter_picker_information extends JFrame  {
	
	JLabel 修改取货人信息 = new JLabel("\u4FEE\u6539\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JLabel 点击需要修改的信息 = new JLabel("(\u8BF7\u70B9\u51FB\u9009\u62E9\u9700\u8981\u4FEE\u6539\u7684\u4FE1\u606F)");
	JButton 修改姓名信息 = new JButton("\u4FEE\u6539\u59D3\u540D\u4FE1\u606F");
	JButton 修改身份证信息 = new JButton("\u4FEE\u6539\u8EAB\u4EFD\u8BC1\u4FE1\u606F");
	JButton 修改手机号= new JButton("\u4FEE\u6539\u624B\u673A\u53F7");
	JButton 修改账号信息 = new JButton("\u4FEE\u6539\u8D26\u53F7\u4FE1\u606F");
	JButton 修改联系地址 = new JButton("\u4FEE\u6539\u8054\u7CFB\u5730\u5740");
	JButton 修改学校 = new JButton("\u4FEE\u6539\u5B66\u6821");
	JButton 确定 = new JButton("\u786E\u5B9A");
	JButton 返回 = new JButton("\u8FD4\u56DE");
	/**
	 * Launch the application.
	 */
	public void change(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	
	public D_alter_picker_information() {
		initialize();
	
	}

	
	private void initialize() {
	
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		修改取货人信息.setFont(new Font("Adobe 宋体 Std L", Font.BOLD, 24));
		修改取货人信息.setBounds(129, 23, 186, 33);
		getContentPane().add(修改取货人信息);
		
		
		 点击需要修改的信息.setBounds(143, 65, 156, 15);
		getContentPane().add( 点击需要修改的信息);
		
		
		修改姓名信息.setBounds(39, 90, 124, 23);
		getContentPane().add(修改姓名信息);
		
		
		修改身份证信息.setBounds(270, 90, 124, 23);
		getContentPane().add(修改身份证信息);
		
		
		 修改手机号.setBounds(39, 131, 124, 23);
	getContentPane().add( 修改手机号);
		
		
		修改账号信息.setBounds(269, 131, 125, 23);
		getContentPane().add(修改账号信息);
		
		
		修改联系地址.setBounds(39, 164, 124, 23);
		getContentPane().add(修改联系地址);
		
		
		修改学校.setBounds(270, 164, 124, 23);
		getContentPane().add(修改学校);
		
		
		确定.setBounds(106, 212, 93, 23);
		getContentPane().add(确定);
		
		
		返回.setBounds(254, 212, 93, 23);
		getContentPane().add(返回);
	}

}
