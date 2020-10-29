package kata_bowling;

public class BowlingGame {
    private int [] rolls = new int[21];
    private int currentRoll=0;

    public void roll(int pins) {
        rolls[currentRoll++]= pins;
    }

    public int score() {
        int score =0;
        int frameindex =0;
        for (int frame=0;frame<10;frame++){
            if(isStrike(frameindex)){
                score += 10 + strikeBonus(frameindex);
                frameindex++;
            }else if (isSpare(frameindex)){
                score += 10 + spareBonus(frameindex);
                frameindex += 2;
            }else{

                score += sumOfBallsInFrame(frameindex);
                frameindex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int frameindex) {
        return rolls[frameindex] ==10;
    }

    private int sumOfBallsInFrame(int frameindex) {
        return rolls[frameindex] + rolls[frameindex+1];
    }

    private int spareBonus(int frameindex) {
        return rolls[frameindex+2];
    }

    private int strikeBonus(int frameindex) {
        return rolls[frameindex + 1] + rolls[frameindex + 2];
    }

    private boolean isSpare(int frameindex) {
        return sumOfBallsInFrame(frameindex) ==10;
    }
}
