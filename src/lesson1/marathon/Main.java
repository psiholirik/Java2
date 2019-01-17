package lesson1.marathon;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("DreamTeam");
        Course course = new Course();

        team.teamMembersInfo();
        course.doIt(team);
        team.showResults();
    }
}
