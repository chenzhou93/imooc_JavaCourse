package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notice notice1 = new Notice(1, "welcome to imooc", "Admin", new Date());
		Notice notice2 = new Notice(1, "please submit assignments", "Instructor", new Date());
		Notice notice3 = new Notice(1, "Attendence", "Instructor", new Date());
		
		//add notice
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//show notice
		System.out.println("show notice");
		for(int i=0; i<noticeList.size(); i++) {
			System.out.println(i+1 + ": " + ((Notice)noticeList.get(i)).getTitle());
		}
		
		Notice notice4 = new Notice(4, "Online IDE is ready", "Admin", new Date());
		noticeList.add(1, notice4);
		
		//show notice
		System.out.println("show notice after add");
		for(int i=0; i<noticeList.size(); i++) {
			System.out.println(i+1 + ": " + ((Notice)noticeList.get(i)).getTitle());
		}
		
		//Delete
		noticeList.remove(2);
		System.out.println("show notice after delete");
		for(int i=0; i<noticeList.size(); i++) {
			System.out.println(i+1 + ": " + ((Notice)noticeList.get(i)).getTitle());
		}
		
		notice4.setTitle("Java IDE");
		noticeList.set(1, notice4);
		System.out.println("show notice after update");
		for(int i=0; i<noticeList.size(); i++) {
			System.out.println(i+1 + ": " + ((Notice)noticeList.get(i)).getTitle());
		}
	}

}
