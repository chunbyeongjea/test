package ch02;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Myblog extends JFrame {

	private JLabel blogTitle;

	private JLabel menuTtitle;
	private JLabel menu1;
	private JLabel menu2;
	private JLabel menu3;
	private JLabel menu4;

	private JTextField post;
	private JButton saveBtn;
	private JCheckBox allCheck;
	private JCheckBox commentCheck;

	ImageIcon img1 = new ImageIcon(Myblog.class.getResource("profile.jpg"));
	Image img = img1.getImage();
	private JPanel profile;
	private JLabel profileImg;
	private JLabel profileName;
	private JLabel profileIntroduce1;
	private JLabel profileIntroduce2;

	public Myblog() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("MyBlog");
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		blogTitle = new JLabel("Welcome My Blog ★");

		menuTtitle = new JLabel("☆ MENU ☆");
		menu1 = new JLabel("JAVA");
		menu2 = new JLabel("HTML");
		menu3 = new JLabel("CSS");
		menu4 = new JLabel("Spring");

		post = new JTextField("게시글을 작성해주세요.");
		saveBtn = new JButton("저장");
		allCheck = new JCheckBox("전체 공개");
		commentCheck = new JCheckBox("댓글 허용");

		profile = new JPanel();
		profileImg = new JLabel(img1);
		profileName = new JLabel("Name : 이춘식");
		profileIntroduce1 = new JLabel("춘식이의");
		profileIntroduce2 = new JLabel("블로그입니다. ");

	}

	public void setInitLayout() {
		setLayout(null);
		setVisible(true);
		add(blogTitle);
		blogTitle.setSize(500, 200);
		blogTitle.setLocation(0, 0);
		blogTitle.setFont(new Font("Serif", Font.BOLD, 30));
		blogTitle.setForeground(Color.BLUE);
		blogTitle.setHorizontalAlignment(JLabel.CENTER);

		add(menuTtitle);
		menuTtitle.setSize(80, 30);
		menuTtitle.setLocation(15, 220);
		menuTtitle.setHorizontalAlignment(JLabel.CENTER);
		menuTtitle.setForeground(Color.green);
		add(menu1);
		add(menu2);
		add(menu3);
		add(menu4);
		menu1.setSize(80, 20);
		menu2.setSize(80, 20);
		menu3.setSize(80, 20);
		menu4.setSize(80, 20);
		menu1.setHorizontalAlignment(JLabel.CENTER);
		menu2.setHorizontalAlignment(JLabel.CENTER);
		menu3.setHorizontalAlignment(JLabel.CENTER);
		menu4.setHorizontalAlignment(JLabel.CENTER);
		menu1.setLocation(15, 250);
		menu2.setLocation(15, 270);
		menu3.setLocation(15, 290);
		menu4.setLocation(15, 310);

		add(post);
		post.setSize(250, 400);
		post.setLocation(110, 220);
		post.setHorizontalAlignment(JLabel.CENTER);

		add(saveBtn);
		saveBtn.setSize(70, 30);
		saveBtn.setLocation(290, 630);

		add(allCheck);
		allCheck.setSize(100, 30);
		allCheck.setLocation(200, 630);

		add(commentCheck);
		commentCheck.setSize(100, 30);
		commentCheck.setLocation(110, 630);

		add(profile);
		profile.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY)));
		profile.setLayout(null);
//		profile.setBackground(Color.LIGHT_GRAY);
		profile.setSize(100, 150);
		profile.setLocation(370, 220);
		profile.add(profileImg);

		profileImg.setSize(100, 100);
		profileImg.setLocation(0, 0);

		profile.add(profileName);
		profileName.setSize(90, 25);
		profileName.setLocation(10, 100);

		profile.add(profileIntroduce1);
		profileIntroduce1.setSize(90, 20);
		profileIntroduce1.setLocation(10, 118);

		profile.add(profileIntroduce2);
		profileIntroduce2.setSize(90, 20);
		profileIntroduce2.setLocation(10, 130);

	}

	public static void main(String[] args) {
		new Myblog();

	}

}