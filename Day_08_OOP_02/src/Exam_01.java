
public class Exam_01 {
	public static void main(String[] args) {
		Student std1= new Student("Tom", 50, 80);
		Student std2= new Student("Jane", 30, 80);
		Student std3= new Student("Alex", 20, 90); //생성자로 값넣고 출력
		System.out.println("이름\t국어\t영어");
		System.out.println(std1.getName()+"\t"+std1.getKor()+"\t"+std1.getEng());
		System.out.println(std2.getName()+"\t"+std2.getKor()+"\t"+std2.getEng());
		System.out.println(std3);
	}
}
