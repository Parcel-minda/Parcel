package Parcel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class D_pickup  extends JFrame{

	JLabel ��Ҫȡ�� = new JLabel("\u6211\u8981\u53D6\u4EF6");
	JLabel �ֻ��� = new JLabel("\u624B\u673A\u53F7");
	JLabel ���� = new JLabel("\u59D3  \u540D");
	JLabel ��ݱ��= new JLabel("\u5FEB\u9012\u7F16\u53F7");
	JButton ȷ�� = new JButton("\u786E\u8BA4");
	JButton ȡ�� = new JButton("\u53D6\u6D88");
	JButton ���ظ������� = new JButton("\u8FD4\u56DE");
	JButton �޸�ȡ���� = new JButton("\u4FEE\u6539\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton ɾ��ȡ���� = new JButton("\u5220\u9664\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton ���ȡ���� = new JButton("\u6DFB\u52A0\u53D6\u8D27\u4EBA\u4FE1\u606F");
	JButton �������� = new JButton("\u7269\u6D41\u8DDF\u8E2A");
	
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
//	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	void pick_information(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		��������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_trace a=new D_trace();
				a.trace(all,usertele);
				a.setVisible(true);
			}
		});
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_sucsess a=new D_sucsess();
				a.success(all,usertele);
				a.setVisible(true);
			}
		});
		�޸�ȡ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_alter_picker_information a=new D_alter_picker_information();
				a.change(all,usertele);
				a.setVisible(true);
			}
		});
		ɾ��ȡ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_delete_picker_information a=new D_delete_picker_information();
				a.Delete(all,usertele);
				a.setVisible(true);
			}
		});
		���ȡ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_picker_information a=new D_picker_information();
				a.pick_update(all,usertele);
				a.setVisible(true);
			}
		});
		���ظ�������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public D_pickup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
     public  void initialize() {
		setBounds(100, 100, 613, 326);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		��Ҫȡ��.setFont(new Font("����", Font.BOLD, 24));
		��Ҫȡ��.setBounds(251, 43, 107, 39);
		getContentPane().add(��Ҫȡ��);
		
		
		�ֻ���.setBounds(203, 148, 54, 15);
		getContentPane().add(�ֻ���);
		
		
		����.setBounds(203, 103, 54, 15);
		getContentPane().add(����);
		
		textField_1= new JTextField();
		textField_1.setBounds(297, 145, 130, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(298, 100, 129, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		��ݱ��.setBounds(203, 189, 54, 15);
		getContentPane().add(��ݱ��);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 186, 129, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
	
		ȷ��.setBounds(85, 241, 93, 23);
		getContentPane().add(ȷ��);
		
		
		
		
		ȡ��.setBounds(269, 241, 93, 23);
		getContentPane().add(ȡ��);
		
		
		���ظ�������.setBounds(440, 241, 93, 23);
		getContentPane().add(���ظ�������);
		
		
		�޸�ȡ����.setBounds(328, 10, 117, 23);
		getContentPane().add(�޸�ȡ����);
		
	
		
		
		ɾ��ȡ����.setBounds(175, 10, 129, 23);
		getContentPane().add(ɾ��ȡ����);
		
		
		 ���ȡ����.setBounds(35, 10, 117, 23);
		getContentPane().add( ���ȡ����);
		 
		�������� .setBounds(481, 10, 93, 23);
		getContentPane().add(��������);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
