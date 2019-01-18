package lesson1.marathon;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("DreamTeam",
            new Dog("Jack", "black", 10, 1, 2),
            new Cat("Mag", "white", 10, 0, 3),
            new Turtle("Turtle", "green", 100, 10, 0),
            new Human("Rick", 8, 10, 2)
        );
        Course course = new Course();

        team.teamMembersInfo();
        course.doIt(team);
        team.showResults();
    }
}
