package lesson1.marathon;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
