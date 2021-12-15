public class Person {
    String name;
    int grade;
    double meetingsPerWeek;

    Person(String aName, int aGrade, double mpw) {
        this.name = aName;
        this.grade = aGrade;
        this.meetingsPerWeek = mpw;
    }

    boolean likelyToAttend() {
        if (this.grade > 12 || this.grade < 9) {
            return false;
        }
        if (this.meetingsPerWeek < 0) {
            return false;
        }
        return true;
    }

    
}
