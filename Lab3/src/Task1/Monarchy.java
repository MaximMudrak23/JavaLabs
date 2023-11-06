package Task1;

public class Monarchy extends State {
    private String monarch;

    public Monarchy(String name, String description, String monarch) {
        super(name, description);
        this.monarch = monarch;
    }

    public String getMonarch() {
        return monarch;
    }
    public void setMonarch(String monarch) {
        this.monarch = monarch;
    }

    public void Show() {
        super.Show();
        System.out.println("Monarch: " + monarch);
    }
}