package Task1;

public class Kingdom extends Monarchy {
    private int monarchAge;

    public Kingdom(String name, String description, String monarch, int monarchAge) {
        super(name, description, monarch);
        this.monarchAge = monarchAge;
    }

    public int getMonarchAge() {
        return monarchAge;
    }
    public void setMonarchAge(int monarchAge) {
        this.monarchAge = monarchAge;
    }

    public void Show() {
        super.Show();
        System.out.println("Monarch Age: " + monarchAge);
    }
}
