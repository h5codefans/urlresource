package cn.bjsxt.lianxi;

public class Test10 {
   public static void main(String[] args) {
	Officer o=new Officer();
	o.setId("232323");
	o.setName("张三");
	o.setDate("1993-03-12");
	o.setDegree("本科");
	o.setJob("销售");
	o.setParty("民族党");
	o.setPosition("政府官员");
	
	System.out.println(o.getId());
	System.out.println(o.getName());
	System.out.println(o.getDate());
	System.out.println(o.getDegree());
	System.out.println(o.getJob());
	System.out.println(o.getParty());
	System.out.println(o.getPosition());
	
}
}
class President{
	private String id;
	private String name;
	private String date;
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
class Adult extends President{
	private String degree;
	private String job;
	public String getDegree(){
		return degree;
	}
	public void setDegree(String degree){
		this.degree=degree;
	}
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job=job;
	}
	
}
class Officer extends Adult{
	private String party;
	private String position;
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
