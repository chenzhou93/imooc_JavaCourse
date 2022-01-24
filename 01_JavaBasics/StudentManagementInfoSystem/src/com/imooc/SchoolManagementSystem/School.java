package com.imooc.SchoolManagementSystem;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	private Map<String, Banji> schoolMap;

	public School() {
		super();
		schoolMap = new HashMap<String, Banji>();
	}

	public Map<String, Banji> getSchoolMap() {
		return schoolMap;
	}

	public void setSchoolMap(Map<String, Banji> schoolMap) {
		this.schoolMap = schoolMap;
	}
	
	//添加班级：
	public void addBanji(Banji banji){
		if(banji != null && banji.getClassId() != null) {
			schoolMap.put(banji.getClassId(), banji);
		}
	}

    //删除班级 ： 
	public void deleteBanji(Banji banji){
		if(banji != null && banji.getClassId() != null) {
			schoolMap.remove(banji.getClassId());
		}
	}

    //通过班级名称查询班级：
	public Banji searchByName(String className) {
		if(className != null && schoolMap.get(className) != null) {
			return schoolMap.get(className);
		}
		return null;
	}

    //对各班语文成绩按平均分进行由大到小排序：
	public void sortChineseByAverage() {
		Map<String, Float> classNameToChineseAvg = new HashMap <String, Float>();
		for(Banji b: schoolMap.values()) {
			List<Student> studentList = b.getStuList();
			float avg = 0.0f;
			float total = 0.0f;
			for(Student s: studentList) {
				total += s.getChinese();
			}
			avg = total / (studentList.size());
			classNameToChineseAvg.put(b.getClassId(), avg);
		}
		Collections.sort((List<Float>)classNameToChineseAvg.values());
	}

    //对各班数学成绩按平均分进行由大到小排序：
	public void sortMathByAverage() {
		Map<String, Float> classNameToMathAvg = new HashMap <String, Float>();
		for(Banji b: schoolMap.values()) {
			List<Student> studentList = b.getStuList();
			float avg = 0.0f;
			float total = 0.0f;
			for(Student s: studentList) {
				total += s.getMath();
			}
			avg = total / (studentList.size());
			classNameToMathAvg.put(b.getClassId(), avg);
		}
		Collections.sort((List<Float>)classNameToMathAvg.values());
	}

    //显示所有班级名称：
	public void displayBanJiName() {
		for(Banji b : schoolMap.values()) {
			System.out.println(b.getClassName());
		}
	}
	
	
}
