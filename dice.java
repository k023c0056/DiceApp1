public class Dice {
    private int faceValue; // サイコロの目

    // サイコロを振るメソッド
    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    // サイコロの目を取得するメソッド
    public int getFaceValue() {
        return faceValue;
    }
}
