package tw.com.beans;

import java.util.Map;

public class Mask {
	
	private String id;
	private String name;
	private String maskAdult;
	private String maskChild;
	
	public Mask(String id,String name,String adult,String child) {
		this.id = id;
		this.name = name;
		this.maskAdult = adult;
		this.maskChild = child;		
	}
	public Mask(Map<String,Object> maskMap) {
		System.out.println("maskMap:"+maskMap);
		System.out.println("id:"+maskMap.get("id"));
		this.id = maskMap.get("id").toString();
		this.name = maskMap.get("name").toString();
		this.maskAdult = maskMap.get("mask_adult").toString();
		this.maskChild = maskMap.get("mask_child").toString();		
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getMaskAdult() {
		return maskAdult;
	}
	
	public String getMaskChild() {
		return maskChild;
	}

	
	public String toString() {
		return "Mask:"+this.getId()+":"+this.getName();
	}
}
