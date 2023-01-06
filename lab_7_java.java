class thread1 implements Runnable {
	Thread t;
	thread1(String ss) {
		t=new Thread(this,"New Thread");
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("BMSCE");
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("Thread interrupted");
		}
	}
}

class thread2 implements Runnable {
	Thread t;
	thread2(String ss) {
		t=new Thread(this,"BMS Thread");
		
	}
	public void run() {
		try {
			for(int i=25;i>0;i--) {
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("Thread interrupted");
		}
	}
}
class threadmain {
	public static void main(String xx[]) {
		thread1 t1 = new thread1("Thread");
		thread2 t2 = new thread2("Thread");
		t1.t.start();
		t2.t.start();
	}	
}
