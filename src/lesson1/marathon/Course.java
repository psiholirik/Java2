package lesson1.marathon;

public class Course {
  private Obstacle[] obstacles;

  public Obstacle[] getObstacles() {
    return obstacles;
  }

  public Course() {
    this.obstacles = new Obstacle[] {
            new Road(8),
            new Wall(2),
            new Water(1),
            new Wall(2)
    };
  }

  void doIt(Team team) {
    Competitor[] competitors = team.getCompetitors();
    for (Competitor competitor: competitors){
      for (Obstacle obstacle: obstacles){
        obstacle.doIt(competitor);
        if (!competitor.onDistance()) break;
      }
    }
  }
}
