package study;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		float temp = ((float) (kor + eng + math) / 3);
		return ((temp * 100) + 5) / 100;
	}

}

public class Practice6_2 {

	public static void main(String[] args) {

		Student s1 = new Student("나루토", 1, 1, 50, 65, 76);
//		Student s2 = new Student("사스케", 1, 2, 90, 42, 19);
//		Student s3 = new Student("히나타", 1, 3, 100, 99, 59);
//		Student s4 = new Student("가아라", 3, 1, 59, 49, 100);
//		Student s5 = new Student("오로치마루", 2, 1, 87, 25, 42);

		System.out.println("이름: " + s1.name);
		System.out.println("총점: " + s1.getTotal());
		System.out.println("평균: " + s1.getAverage());

	} // main
} // class
