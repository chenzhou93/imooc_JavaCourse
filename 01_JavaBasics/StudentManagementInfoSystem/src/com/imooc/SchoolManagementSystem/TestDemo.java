package com.imooc.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDemo {
	public List<Student> mainStudentList;
	private School school;
	private Banji bj;
	
    //学校的测试方法：
	public void testBanJi(){
		bj = new Banji();
		Scanner s = new Scanner(System.in);
		while(true) {
			banJiMenu();
			int cmdBanji = s.nextInt();
			if(cmdBanji == 9) {
				break;
			}else if(cmdBanji > 0 && cmdBanji < 8) {
				switch(cmdBanji) {
					case 1:
						mainStudentList = new ArrayList<Student>();
						int num = s.nextInt();
						for(int i=0; i<num; i++) {
							
							System.out.println("请输入第" + (i+1) + "个学生信息");
							System.out.println("请输入学生id");
							String stuId = s.next();
							System.out.println("请输入学生姓名");
							String name = s.next();
							Student stu = new Student();
							stu.setStuNum(stuId);
							stu.setStuName(name);
							
							mainStudentList.add(stu);
							System.out.println("添加成功");
							
						}
						
						System.out.println("主学生列表第学生信息为:");
						
						for(Student std : mainStudentList) {
							System.out.println(std);
						}
						
						break;
					
					case 2:
						System.out.println("请输入要添加的班级名称");
						String bjName = s.next();
						Banji tmpBJ = school.searchByName(bjName);
						if(tmpBJ != null) {
							System.out.println("请输入要添加的学生个数");
							int num1 = s.nextInt();
							for(int i=0; i<num1; i++) {
								System.out.println("请输入第" + (i+1) + "个学生信息");
								System.out.println("请输入学生id");
								String stuId = s.next();
								boolean flag = false;
								for(Student std : mainStudentList) {
									if(std.getStuNum() == stuId) {
										flag = true;
										break;
									}
								}
								if(flag) {
									System.out.println("请输入学生姓名");
									String name = s.next();
									Student stu = new Student();
									stu.setStuNum(stuId);
									stu.setStuName(name);
									tmpBJ.addStudent(stu);
								}else {
									System.out.println("学生不在主学生列表中");
								}
								
							}
						}else {
							System.out.println("该班级不存在");
						}
						
						break;
					case 3:
						System.out.println("请输入学生学号");
						String banjiId3 = s.next();
						bj.searchStudentByNum(banjiId3);
						break;
					case 4:
						System.out.println("请输入学生学号");
						String banjiId4 = s.next();
						System.out.println("请输入学生语文成绩");
						Float chineseGrade = s.nextFloat();
						bj.insertChineseScore(banjiId4, chineseGrade);
						break;
					case 5:
						System.out.println("请输入学生学号");
						String banjiId5 = s.next();
						System.out.println("请输入学生数学成绩");
						Float matGrade = s.nextFloat();
						bj.insertChineseScore(banjiId5, matGrade);
						break;
					case 6:
						System.out.println("请输入学生学号");
						String banjiId6 = s.next();
						bj.deleteStudent(banjiId6);
						break;
					case 7:
						bj.displayAllStudent();
						break;
					default:
						break;
				}
			}
		}
		s.close();
	}
	
	//班级的测试方法：
	public void testSchool(){
		school = new School();
		Scanner s = new Scanner(System.in);
		while(true) {
			schoolMenu();
			int cmd = s.nextInt();
			if(cmd == 9) {
				break;
			}else if(cmd > 0 && cmd < 7) {
				switch(cmd) {
					case 1:
						System.out.println("请输入班级编号");
						String banjiId = s.next();
						System.out.println("请输入班级名");
						String banjiName = s.next();
						Banji bjRes = new Banji(banjiId, banjiName);
						school.addBanji(bjRes);
						break;
					case 2:
						System.out.println("请输入班级名");
						String banjiNameToDelete = s.next();
						Banji bjRes1 = school.searchByName(banjiNameToDelete);
						school.deleteBanji(bjRes1);
						break;
					case 3:
						System.out.println("请输入班级名");
						String banjiNameToSearch = s.next();
						Banji bjRes2 = school.searchByName(banjiNameToSearch);
						System.out.println(bjRes2);
						break;
					case 4:
						school.sortChineseByAverage();
						break;
					case 5:
						school.sortMathByAverage();
						break;
					case 6:
						school.displayBanJiName();
						break;
					default:
						break;
				}
			}
		}
		s.close();
	}

		
    //主菜单： 
	public void mainMenu(){
		System.out.println("*********************************");
		System.out.println("***************主菜单**************");
		System.out.println("*************1--班级管理**********");
		System.out.println("*************2--学校管理**************");
		System.out.println("*************0--退出***************");
		System.out.println("*********************************");
	}

    //学校管理菜单：
	public void schoolMenu(){
		System.out.println("**学校管理**");
		System.out.println("1--创建班级");
		System.out.println("2--删除班级");
		System.out.println("3--通过班级名称查询班级信息");
		System.out.println("4--对各班语文成绩按平均分进行由大到小排序");
		System.out.println("5--对各班数学成绩按平均分进行由大到小排序");
		System.out.println("6--显示所有班级名称");
		System.out.println("9--返回上一级菜单");
	}

    //班级管理菜单：
	public void banJiMenu(){
		System.out.println("**班级管理**");
		System.out.println("1--添加学生到主学生列表");
		System.out.println("2--添加学生信息到普通班级");
		System.out.println("3--通过学号查询学生信息");
		System.out.println("4--输入班级的语文成绩");
		System.out.println("5--输入班级的数学成绩");
		System.out.println("6--删除学生信息");
		System.out.println("7--删除所有学生信息");
		System.out.println("9--返回上一级菜单");
	}

    //主流程：
	public void test(){
		mainMenu();
		System.out.println("请输入对应数字进行列表管理");
		Scanner s = new Scanner(System.in);
		int command = s.nextInt();
		switch(command) {
			case 1:
				testBanJi();
				break;
			case 2:
				testSchool();
				break;
			case 0:
				break;
			default:
				break;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
