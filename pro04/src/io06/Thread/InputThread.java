package io06.Thread;

import javax.swing.JOptionPane;

public class InputThread extends Thread{

	@Override
	public void run() {
		String input=JOptionPane.showInputDialog("10초 안에 값을 입력하세요.");
		
		if(input!=null) {
			SubThread.inputCheck=true;
			
			System.out.println("입력하신 값은 : "+input+"입니다.");
		}
	}
}
