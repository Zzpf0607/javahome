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
