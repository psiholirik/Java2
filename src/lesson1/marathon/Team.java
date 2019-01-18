package lesson1.marathon;

public class Team {
  private String teamName;
  private Competitor[] competitors;

  public Team(String teamName, Competitor... competitors) {
    this.teamName = teamName;
    this.competitors = competitors;
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
