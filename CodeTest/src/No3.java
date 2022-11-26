
public class No3 {

	public int solution(int n) {
		 
		int answer = 0;
        int i=0;
        for(i=1;i<=n;i++)
            if(n%i==0)
            answer=answer+i;
        
        return answer;

	}

	public static void main(String[] args) {

		No3 exam = new No3();

		System.out.println(exam.solution(12));

	}
}
