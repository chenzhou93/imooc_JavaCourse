package com.imooc.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class StudentTest {
    public static void main(String[] args) {
		//定义三个Student类的对象及一个HashSet类的对象
		Student s1 = new Student(3, "William", (float)65.0);
		Student s2 = new Student(1, "Tom", (float)87.0);
		Student s3 = new Student(2, "Lucy", (float)95.0);
        
	
		//将Student类的对象添加到集合中
		Set set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
        
        
		//使用迭代器显示Student类的对象中的内容
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
    
    
	}
}
