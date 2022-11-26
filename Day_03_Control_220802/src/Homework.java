import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어느날 당신은 여유를 즐기며 침대위에서 책을 보고 있었습니다.\r\n"
				+ "그런데...!! 갑자기 나타난 커다란 벌레.\r\n"
				+ "당신은 이 벌레를 보고 어떻게 하시겠습니까?\r\n"
				+ "======\r\n"
				+ "1. 살충제를 듬뿍 뿌려버린다.\r\n"
				+ "2. 벌레를 못본 적 하고 그냥 책을 읽는다.\r\n"
				+ "3. 집이 떠나가라 소리를 지른다.\r\n"
				+ "4. 무엇이든 손에 들고 벌레를 때려잡는다.");
		System.out.println("======");
		System.out.println("1~4까지 중에 숫자를 입력하세요.");
		
		int num = Integer.parseInt(sc.nextLine());
		
		if(num == 1) {
			System.out.println("======");
			System.out.println("이번 심리테스트는 여러분이 싫은 사람을 대할 때의 태도를 알아볼수 있는 테스트입니다.\r\n");
			System.out.println("1) 살충제를 듬뿍 뿌려버린다.\r\n"
					+ "겉으로는 친한 척 합니다. 그러나 실제는 그렇지 않습니다.\r\n"
					+ "나는 착하지만, 너는 나쁘다 라는 생각을 하고 있을 수 있습니다.\r\n"
					+ "겉으로는 친하게 보이지만 뒤에서 몰래 험담을 하기도 합니다.");
			
		} else if(num == 2) {
			System.out.println("======");
			System.out.println("이번 심리테스트는 여러분이 싫은 사람을 대할 때의 태도를 알아볼수 있는 테스트입니다.\r\n");
			System.out.println("2) 벌레를 못본 적 하고 그냥 책을 읽는다.\r\n"
					+ "싫어하는 사람이 있다면 그냥 무시하는 타입.\r\n"
					+ "싫어하는 사람이 있다면 못본척 무시하고 상대하지 않습니다.\r\n"
					+ "최대한 그 사람과 관계없이 지낼 수 있도록 노력하려고 합니다.\r\n"
					+ "");
			
		} else if(num == 3) {
			System.out.println("======");
			System.out.println("이번 심리테스트는 여러분이 싫은 사람을 대할 때의 태도를 알아볼수 있는 테스트입니다.\r\n");
			System.out.println("3) 집이 떠나가라 소리를 지른다.\r\n"
					+ "당신은 상대를 싫어하는 감정을 그대로 드러내는 성향입니다.\r\n"
					+ "평소에 상대에 대한 험담을 하기도 하구요.\r\n"
					+ "만약 당신이 싫어하는 사람이 당신을 공격한다면 정말 크게 화를 내기도합니다.\r\n"
					+ "그리고 자신이 그 사람을 싫어하는 것에는 그만한 이유가 있다고 생각하는 편입니다.");
			
		} else if(num == 4) {
			System.out.println("======");
			System.out.println("이번 심리테스트는 여러분이 싫은 사람을 대할 때의 태도를 알아볼수 있는 테스트입니다.\r\n");
			System.out.println("4) 무엇이든 손에 들고 벌레를 때려잡는다.\r\n"
					+ "싫은 티를 내면서 상대를 공격하는 성향입니다.\r\n"
					+ "노골적으로 자신의 감정을 드러냅니다. 싫어하는 사람이 앞에 있으면 숨기지를 못하시는군요.\r\n"
					+ "때로는 싫어하는 상대를 공격하며 당황하는 모습을 보고비웃기도 하는 성향이네요.");
			
		} else {
			System.out.println("1~4까지의 숫자 중에서만 입력 가능합니다. 다시 입력해주세요.");
		}
		
	}
}
