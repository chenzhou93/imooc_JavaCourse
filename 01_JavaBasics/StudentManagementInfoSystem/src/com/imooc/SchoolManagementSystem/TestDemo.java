package com.imooc.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDemo {
	public List<Student> mainStudentList;
	private School school;
	
    //学校的测试方法：
	public void testBanJi(){
		Scanner s = new Scanner(System.in);
		while(true) {
			banJiMenu();
			int cmdBanji = s.nextInt();
			if(cmdBanji > 0 && cmdBanji < 10) {
				switch(cmdBanji) {
					case 1:
						mainStudentList = new ArrayList<Student>();
						System.out.println("请输入添加学生个数");
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
						Banji tmpBJ = school.searchByName(bjName) == null ? null : school.searchByName(bjName);
						if(tmpBJ != null) {
							System.out.println("请输入要添加的学生个数");
							int num1 = s.nextInt();
							for(int i=0; i<num1; i++) {
								System.out.println("请输入第" + (i+1) + "个学生信息");
								System.out.println("请输入学生id");
								String stuId = s.next();
								boolean flag = false;
								for(Student std : mainStudentList) {
									if(std.getStuNum().equals(stuId)) {
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
									System.out.println(stu);
									tmpBJ.addStudent(stu);
									school.getSchoolMap().put(tmpBJ.getClassId(), tmpBJ);
									System.out.println("添加成功");
								}else {
									System.out.println("学生不在主学生列表中");
								}
								
							}
						}else {
							System.out.println("该班级不存在");
						}
						break;
						
					case 3:
						System.out.println("请输入要查询的班级名称");
						String banjiID3 = s.next();
						Banji bj3 = school.searchByName(banjiID3);
						System.out.println("请输入学生学号");
						String studentID3 = s.next();
						
						if(bj3 != null) {
							Student sRes = bj3.searchStudentByNum(studentID3);
							System.out.println(sRes);
						}
						break;
						
					case 4:
						System.out.println("请输入要查询的班级名称");
						String banjiName4 = s.next();
						Banji bj4 = school.searchByName(banjiName4);
						System.out.println("请输入学生学号");
						String studentId4 = s.next();
						System.out.println("请输入学生语文成绩");
						Float chineseGrade = s.nextFloat();
						bj4.insertChineseScore(studentId4, chineseGrade);
						school.getSchoolMap().put(banjiName4, bj4);
						break;
						
					case 5:
						System.out.println("请输入要查询的班级名称");
						String banjiName5 = s.next();
						Banji bj5 = school.searchByName(banjiName5);
						System.out.println("请输入学生学号");
						String studentId5 = s.next();
						System.out.println("请输入学生数学成绩");
						Float mathGrade = s.nextFloat();
						bj5.insertChineseScore(studentId5, mathGrade);
						school.getSchoolMap().put(banjiName5, bj5);
						break;
						
					case 6:
						System.out.println("请输入要查询的班级名称");
						String banjiName6 = s.next();
						Banji bj6 = school.searchByName(banjiName6);
						bj6.displayAllStudent();
						break;
						
					case 7:
						System.out.println("请输入要查询的班级名称");
						String banjiName7 = s.next();
						Banji bj7 = school.searchByName(banjiName7);
						bj7.displayAllStudent();
						break;
						
					case 9:
						test();
						break;
						
					default:
						break;
				}
			}
		}
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
					case 9:
						test();
						break;
					default:
						break;
				}
			}
		}
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
		Scanner s = new Scanner(System.in);
		while(true) {
			mainMenu();
			System.out.println("请输入对应数字进行列表管理");
			
			int command = s.nextInt();
			if(command == 0) {
				break;
			}else if(command == 1 || command == 2){
				switch(command) {
					case 1:
						testBanJi();
						break;
					case 2:
						testSchool();
						break;
					default:
						break;
				}
			}
			
		}
		
		s.close();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo test = new TestDemo();
		test.test();

	}

}
