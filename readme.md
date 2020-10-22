# 计G201  张鹏飞  2020322072
  

#阅读程序  

```  

package zpfjava;
public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();   
		cpu.setsd(2200);  
		HardDisk disk = new HardDisk();
		disk.setrl(200);
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
}

```  

##实验目的  

计算计算机中CPU的速度和硬盘容量  

##实验过程  

分别创建cpu.class、harddisk.class、pc.class和test.class文件  cpu和硬盘文件中用构造方法设置属性变量 pc中分别给各个属性实例化 test给变量赋值  输出  
##核心方法  

1.cpu类中变量都是private类型  
```  

public class CPU {
	private int sd;    
	private float jg;    
	private String zl;  
	CPU(){
		}    
		
```
2.在cpu类中添加了逻辑判断，判断价格是否符合要求  
```
  private void panduan (float jg){            
		 if (jg>=0 && jg<=500){
		  System.out.println("CPU价格是"+jg);
		 }
		 else {
			 System.out.println("错误");
			 }
	 }
```
3.cpu和hd类中都运用了构造方法  
```  

	CPU(int speed,float price,String type){
		this.sd=sd;
		this.jg=jg;
		this.zl=zl;         
	}  
	
```  

4.在test类中用show（）方法输出结果  
```  

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();   
		cpu.setsd(2200);  
		HardDisk disk = new HardDisk();
		disk.setrl(200);
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}  
	
```  


##实验结果  

CPU的速度:2200  
硬盘的容量:200  

##实验感想  

通过这次实验，学会了用构造方法，构造方法没有类型；给成员变量实例化；用show（）方法输出结果；private型数据不能直接访问；
