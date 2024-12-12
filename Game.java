public class Game {
    private Player player;
    private Dice dice;

    // コンストラクタ
    public Game() {
        player = new Player();
        dice = new Dice();
    }

    // ゲーム開始
    public void start() {
        player.turn(dice); // サイコロを振る
        System.out.println("サイコロの目: " + dice.getFaceValue()); // 修正: getFaceValueを使用
        judge(); // 結果を判定する
    }

    // ゲームの結果を判定
    private void judge() {
        if (dice.getFaceValue() == 6) { // 修正: getFaceValueを使用
            System.out.println("おめでとう！6が出ました！");
        } else {
            System.out.println("残念！6以外が出ました。");
        }
    }
}
