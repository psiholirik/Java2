package lesson1.marathon;

public class Team {
  private String teamName;
  private Competitor[] competitors;

  public Team(String teamName) {
    this.teamName = teamName;
    this.competitors = new Competitor[]{
            new Dog("Jack", "black", 10, 1, 2),
            new Cat("Mag", "white", 10, 0, 3),
            new Turtle("Turtle", "green", 100, 10, 0),
            new Human("Rick", 8, 10, 2)
    };
  }

  public void teamMembersInfo() {
    System.out.println("Вывожу информацию по команде " + teamName + ":");
    for (Competitor competitor: competitors){
      System.out.println(competitor.toString());
    }
  }

  public void showResults() {
    System.out.println("Вывожу информацию по результатам:");
    for (Competitor competitor: competitors){
      competitor.info();
    }
  }

  public Competitor[] getCompetitors() {
    return competitors;
  }
}
