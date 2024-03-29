import java.util.Queue;

public class ConcretePlayer implements Player{

    private boolean isAttacker;
    private int wins;
    private boolean isWinner;

    public ConcretePlayer(boolean isAttacker){
        this.isAttacker = isAttacker;
        this.wins = 0;

    }

    public void setWinner(boolean ae ){
        this.isWinner=ae;
    }
    public boolean isWinner(){
        return this.isWinner;
    }
    public void win(){
        this.wins++;
    }

    @Override
    public boolean isPlayerOne() {
        return isAttacker;
    }

    @Override
    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins){
        this.wins = wins;
    }
}
