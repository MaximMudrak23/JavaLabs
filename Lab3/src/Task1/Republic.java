package Task1;

public class Republic extends State {
    private String president;

    public Republic(String name, String description, String president) {
        super(name, description);
        this.president = president;
    }

    public String getPresident() {
        return president;
    }
    public void setPresident(String president) {
        this.president = president;
    }

    public void Show() {
        super.Show();
        System.out.println("President: " + president);
    }
}