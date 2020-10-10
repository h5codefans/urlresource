package org.crazy.oop;


public class Student {
   private String name;
   private int age;
   private String gender;
   private String phone;
   private String address;
   private String email;
   public Student(){
	   
   }
   public Student(String name,int age,String gender,String phone,String address,String email){
	   this.name=name;
	   this.age=age;
	   this.gender=gender;
	   this.phone=phone;
	   this.address=address;
	   this.email=email;
   }
    

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
   public void eat(){
	   System.out.println("吃");
   }
   public void drink(){
	   System.out.println("喝");
   }
   public void play(){
	   System.out.println("玩");
   }
   public void sleep(){
	   System.out.println("睡");
   }
   
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", phone=" + phone + ", address=" + address + ", email=" + email
				+ "]";
	}
	public static void main(String[] args){
		   Student[] stu=new Student[3];
		   stu[0]=new Student("张三",20,"男","133","重庆万州","111@qq.com");
		   stu[1]=new Student("李四",21,"男","134","重庆合川","222@qq.com");
		   stu[2]=new Student("王五",22,"男","135","重庆云阳","333@qq.com");
		   
		   
		   System.out.println("请输入查询的姓名，邮箱，或地址");
		 
		   String str="王五";
          
		   for(int i=0;i<stu.length;i++){
			   if(str==stu[i].name||str==stu[i].email||str==stu[i].address){
				   System.out.println(stu[i]);
				   return ;
			   }else if(i==2){
				   System.out.println("您的好友有：");
				   for(int j=0;j<stu.length;j++){
					   System.out.println(stu[j]);
				   }
			   }
		   }
	   }
}
