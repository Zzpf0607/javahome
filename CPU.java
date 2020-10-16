package zpfjava;
public class CPU {
	private int sd;    
	private float jg;    
	private String zl;  
	CPU(){
		}
	CPU(int speed,float price,String type){
		this.sd=sd;
		this.jg=jg;
		this.zl=zl;         
	}
	public int getsd(){     
		return sd;
	}
	 public void setsd(int sd){   
		 this.sd=sd;
	}
	  private void panduan (float jg){            
		 if (jg>=0 && jg<=500){
		  System.out.println("CPU¼Û¸ñÊÇ"+jg);
		 }
		 else {
			 System.out.println("´íÎó");
			 }
	 }
	
}