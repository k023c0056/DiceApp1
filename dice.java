public class Dice {
    private int faceValue; // サイコロの目

    // サイコロを振る
    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    // 現在の目を取得
    public int getFaceValue() {
        return faceValue;
    }
}
