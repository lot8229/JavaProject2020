import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import bean.Coffee;
import dao.coffeedao;
import sun.applet.Main;

public class MainUI {

	private static final Color White = null;
	Vector<Coffee> list =new Vector<Coffee>();
	Coffee coffee = null; 
	coffeedao dao = null;
	JLabel lblNewLabel_1;
	String menu="";
		
	private JFrame frame;// 프레임 과 버튼그룹 생성
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	
	public MainUI() {
		
		initialize();
		
	}
	
	
	public void initialize() {// GUI셋팅
		
		coffee = new Coffee();
		dao =new coffeedao();
		
		frame = new JFrame();// 메인 프레임 셋팅 
		frame.setBounds(100, 100, 800, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBackground(White);
		
		JPanel panel = new JPanel();//메인 판넬 셋팅
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 784, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(White);
		
		
		

		
		JButton btnNewButton = new JButton("에스프레소");//버튼 셋팅 (메뉴)
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("에스프레소");
				coffee.setPrice(3000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		btnNewButton.setBounds(50, 37, 100, 70);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("아메리카노");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("아메리카노");
				coffee.setPrice(4000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		btnNewButton_1.setBounds(200, 37, 100, 70);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("카페라떼");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("카페라떼");
				coffee.setPrice(4500);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		btnNewButton_2.setBounds(350, 37, 100, 70);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("바닐라라떼");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("바닐라라떼");
				coffee.setPrice(4600);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		btnNewButton_3.setBounds(500, 37, 100, 70);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uADF8\uB9B0\uD2F0\uB77C\uB5BC");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("그린티라떼");
				coffee.setPrice(4800);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		btnNewButton_4.setBounds(650, 37, 100, 70);
		panel.add(btnNewButton_4);
		
		JButton button = new JButton("\uCE74\uD478\uCE58\uB178");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("카푸치노");
				coffee.setPrice(3900);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button.setBounds(50, 148, 100, 70);
		panel.add(button);
		
		JButton button_1 = new JButton("\uB3CC\uCCB4\uB77C\uB5BC");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("돌체라떼");
				coffee.setPrice(5100);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_1.setBounds(200, 148, 100, 70);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\uCE74\uD398\uBAA8\uCE74");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("카페모카");
				coffee.setPrice(4300);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_2.setBounds(350, 148, 100, 70);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\uD504\uB77C\uD504\uCE58\uB178");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("프라프치노");
				coffee.setPrice(4700);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_3.setBounds(500, 148, 100, 70);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\uB538\uAE30\uC2A4\uBB34\uB514");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("딸기스무디");
				coffee.setPrice(5000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_4.setBounds(650, 148, 100, 70);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\uB9DD\uACE0\uC2A4\uBB34\uB514");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("망고스무디");
				coffee.setPrice(5000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_5.setBounds(50, 266, 100, 70);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\uD56B\uCD08\uCF54");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("핫초코");
				coffee.setPrice(3000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_6.setBounds(200, 266, 100, 70);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\uBE14\uB799\uD2F0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("블랙티");
				coffee.setPrice(4000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_7.setBounds(350, 266, 100, 70);
		panel.add(button_7);
		
		JButton button_8 = new JButton("\uBC84\uBE14\uD2F0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("버블티");
				coffee.setPrice(4000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		button_8.setBounds(500, 266, 100, 70);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\uADF8\uB9B0\uD2F0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffee.setName("그린티");
				coffee.setPrice(4000);
				menu=coffee.getName()+" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
				
		button_9.setBounds(650, 266, 100, 70);
		panel.add(button_9);		
		//버튼
		
		
		JPanel panel_1 = new JPanel();//옵션 판넬 셋팅
		panel_1.setBounds(0, 396, 784, 115);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  ICE");//TEMP 선택 버튼 셋팅
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				coffee.setTemp("ICE");
				menu=coffee.getName()+" / "+coffee.getTemp()+
						" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
				
				
			}
		});
		rdbtnNewRadioButton.setBounds(145, 42, 60, 26);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHot = new JRadioButton("  HOT");
		buttonGroup.add(rdbtnHot);
		rdbtnHot.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setTemp("HOT");
				menu=coffee.getName()+" / "+coffee.getTemp()+
						" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
				
			}
		});
		rdbtnHot.setBounds(209, 42, 121, 26);
		panel_1.add(rdbtnHot);
		
		JRadioButton rdbtnSmall = new JRadioButton("  SMALL");//SIZE 선택 버튼 셋팅
		buttonGroup_1.add(rdbtnSmall);
		rdbtnSmall.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setSize("SMALL");
				menu=coffee.getName()+" / "+coffee.getSize()+
						" / "+coffee.getTemp()+" / "+
						coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		rdbtnSmall.setBounds(469, 42, 80, 26);
		panel_1.add(rdbtnSmall);
		
		JRadioButton rdbtnTall = new JRadioButton("  TALL");
		buttonGroup_1.add(rdbtnTall);
		rdbtnTall.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setSize("TALL");
				coffee.setPrice(coffee.getPrice()+500);
				menu=coffee.getName()+" / "+coffee.getSize()+
						" / "+coffee.getTemp()+" / "+
						coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		rdbtnTall.setBounds(561, 42, 80, 26);
		panel_1.add(rdbtnTall);
		
		JRadioButton rdbtnLarge = new JRadioButton("  LARGE");
		buttonGroup_1.add(rdbtnLarge);
		rdbtnLarge.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setSize("LARGE");
				coffee.setPrice(coffee.getPrice()+1000);
					menu=coffee.getName()+" / "+coffee.getSize()+" / "+coffee.getTemp()+
						" / "+coffee.getPrice();
				lblNewLabel_1.setText(menu);
			}
		});
		rdbtnLarge.setBounds(644, 42, 121, 26);
		panel_1.add(rdbtnLarge);
		
		JLabel lblNewLabel = new JLabel("HOT / ICE");//라벨 추가
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 45, 99, 18);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC74C\uB8CC \uC0AC\uC774\uC988");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(373, 45, 99, 18);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\uC0F7\uCD94\uAC00");
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBounds(59, 86, 99, 18);
		panel_1.add(label_1);
		
		JRadioButton rdbtnYes = new JRadioButton("  YES");
		buttonGroup_2.add(rdbtnYes);
		rdbtnYes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {//선택 한 메뉴+옵션 을 표시 
				coffee.setShot("샷추가");
				coffee.setPrice(coffee.getPrice()+500);
				menu=coffee.getName()+" / "+coffee.getSize()+" / "+
						coffee.getShot()+" / "+coffee.getTemp()+" / "+
						coffee.getPrice()+" 선택하였습니다.";
				lblNewLabel_1.setText(menu);
			}
		});
		rdbtnYes.setBounds(145, 83, 60, 26);
		panel_1.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("  NO");//샷 추가 선택 버튼 셋팅
		buttonGroup_2.add(rdbtnNo);
		rdbtnNo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setShot("NO샷");
				menu=coffee.getName()+" / "+coffee.getSize()+" / "+
						coffee.getShot()+" / "+coffee.getTemp()+" / "+
						coffee.getPrice()+" 선택하였습니다.";
				lblNewLabel_1.setText(menu);
			}
		});
		rdbtnNo.setBounds(209, 83, 121, 26);
		panel_1.add(rdbtnNo);
		//라디오버튼
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 512, 784, 217);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setText("\uCEE4\uD53C");
		
		lblNewLabel_1.setBounds(81, 40, 618, 26);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setText(menu);
		
		
		//lblNewLabel_1.setText(coffee.getShot() +","+coffee.getTemp()+
		//","+ coffee.getSize()+"사이즈" +coffee.getName()+"맞습니까?" + "     
		//가격 :"+coffee.getPrice());
		
		JButton btnNewButton_5 = new JButton("\uACB0\uC81C");//결제 누르면 서버로 입력
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dao.coffeeadd(coffee);
				System.out.println(coffee);
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				lblNewLabel_1.setText("");
				JOptionPane.showMessageDialog(null, "결제 되었습니다");
				
			}
		});
		btnNewButton_5.setBounds(598, 121, 123, 38);
		panel_2.add(btnNewButton_5);
		
		JButton button_10 = new JButton("\uC120\uD0DD\uCDE8\uC18C");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				coffee.setName(null);
				coffee.setShot(null);
				coffee.setSize(null);
				coffee.setTemp(null);
				coffee.setPrice(0);
				lblNewLabel_1.setText("");
				// 버튼 초기화
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection(); 
				System.out.println(coffee);
				JOptionPane.showMessageDialog(null, "선택취소되었습니다.");
				
			}
		});
		button_10.setBounds(431, 121, 123, 38);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("\uD310\uB9E4\uBCF4\uAE30");//판매확인
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SellListUI();
				System.out.println(dao.GetAllSellList());
				
				
				
			}
		});
		button_11.setBounds(57, 121, 123, 38);
		panel_2.add(button_11);
	}

	
}
