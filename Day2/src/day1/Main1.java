package day1;

public class Main1 {
	
	public static void main(String[] args) {
		Sample2 sample = new Sample2();
		sample.run();
		sample.run1();
		sample.run2();
		Sample2 sample1 = new Sample2();
		sample1.setRoomNo(1);
		System.out.println(sample1.getRoomNo());
		sample1.setRoomType("Square");
		System.out.println(sample1.getRoomType());
		sample1.setRoomArea(25.6);
		System.out.println(sample1.getRoomArea());
		sample1.setAcMachine("LG");
		System.out.println(sample1.getAcMachine());
		B a = new B();
		a.display();
		a.area();
	}


}
