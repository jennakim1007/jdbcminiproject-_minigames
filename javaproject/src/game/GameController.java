package game;

import AgameMain.Main;
import exploiter.controller.Controller;

public class GameController implements Controller {

	private static GameController instance = null;

	public static GameController GetInstance() {
		if (instance == null)
			instance = new GameController();

		return instance;
	}

	NumberGuessing gaGuessing = null;
	Hi99 hi99 = null;
	TicTacToe tacToe = null;
	GameService service = new GameService(new GameDaoOracle());

	public GameController() {

		GameInsert insertion = new GameInsert();

		gaGuessing = new NumberGuessing();
		insertion.InsertGame(gaGuessing.getSerialnum(), "NumberGuessing", "Guess Correct Number in 5 time", "Puzzle");

		hi99 = new Hi99();
		insertion.InsertGame(hi99.getSerialNum(), "Hi99", "Solve Multiplication Table in 30 Sec", "Math");

		tacToe = new TicTacToe();
		insertion.InsertGame(tacToe.getSerialnum(), "TicTacToe", "Check one line first", "Puzzle");

	}

	@Override
	public void process() {
		System.out.println("게임을 선택해 주세요 1. 숫자 맞추기 2. 구구단 빨리 맞추기 3. 틱택톡");
		System.out.println("게임 선택화면을 나가시려면 4번을 눌러주세요");
		int result = Main.sc.nextInt();

		switch (result) {
		case 1:
			gaGuessing.gameStart();
			break;
		case 2:
			hi99.game_Start();
			break;
		case 3:
			tacToe.gameStart();
			break;
		case 4:
			
			break;
		}

//		List<Game> list = service.select();
//
//		if (list != null && !list.isEmpty()) {
//			for (Game e : list) {
//				System.out.println(e);
//			}
//		} else {
//			System.out.println(list);
//
//			System.out.println("검색 결과 없음");
//		}

	}
}