package AgameMain;
import java.util.HashMap;
import java.util.Map;
import exploiter.controller.Controller;
import exploiter.controller.DeleteController;
import exploiter.controller.ExitController;
import exploiter.controller.InsertController;
import exploiter.controller.LogInController;
import exploiter.controller.UpdateController;
import rank.controller.RankResearchController;

//Main.Command
//메인.커멘드
public class UserCommand {
	public Map<Integer, Controller> command;

	public UserCommand() {
		command = new HashMap<>();

		command.put(1, new GameController()); // 게임시작
		command.put(2, new RankResearchController()); // 랭크확인
		// command.put(3, new ); // 로그아웃
		command.put(4, new UpdateController()); // 회원수정
		command.put(5, new DeleteController()); // 회원탈퇴 

	}

}
