package zpfjava;
import zpfjava.CPU;
import zpfjava.HardDisk;
public class PC {
	CPU cpu;
	HardDisk disk;
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setDisk(HardDisk disk) {
		this.disk = disk;
	}
	void show() {
		System.out.println("CPU的速度:"+cpu.getsd());
		System.out.println("硬盘的容量:"+disk.getrl());
	}

}
