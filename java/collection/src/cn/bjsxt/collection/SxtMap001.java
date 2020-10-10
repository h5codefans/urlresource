package cn.bjsxt.collection;

/**
 * 自定义实现map的功能
 * 暂不完美！
 * Map:存放键值对，根据键对象对象找对应的值对象
 * @author Administrator
 *
 */
public class SxtMap001 {
	SxtEntry[] arr=new SxtEntry[990];
	int size;
	
	
	public void put(Object key,Object value){
		SxtEntry e=new SxtEntry(key, value);
		
		//解决键重复的处理
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				arr[i].value=value;
				return ;
			}
		}
		arr[size++]=e;
	}
	
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value){
		for(int i=0;i<size;i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	
    public static void main(String[] args) {
		SxtMap001 m=new SxtMap001();
		m.put("高淇", new Wife("杨幂"));
		m.put("张三", new Wife("李四"));
		Wife w=(Wife)m.get("张三");
		System.out.println(w.name);
	}
}

class SxtEntry{
	Object key;
	Object value;
	public SxtEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}
