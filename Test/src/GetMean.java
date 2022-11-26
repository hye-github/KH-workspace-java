public class GetMean {
        int i = 10;
        if (i > 0) {
            return "0보다 큽니다";
        } else if (i <= 0){
            return "0이거나 0보다 작습니다";
        }
    }


    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        try {
			
        System.out.println("평균값 : " + getMean.getMean());
        } catch (Exception e) {
			e.printStackTrace();
		}
    }
