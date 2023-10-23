public class Baloon
{
    private int x;
    private int y;
    private int z;
    private int radius;

    public Baloon(int x, int y, int z, int radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    public double unionVolume(Baloon other) { // об'єм об'єднання - якщо фігури хоч трохи торкаються одне одного, то з них виходить одна фігура
        double d = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) + Math.pow(this.z - other.z, 2)); // тут ми визначаємо відстань між центрами двох куль, тобто яка відстань між місцями де вони зя'вились
        double r1 = this.radius; // тут ми присвоюэм змінним радіус кожної з куль, щоб не писати довгу строку
        double r2 = other.radius;

        if (d >= r1 + r2) { // якщо кулі не торкаються одне одної то це означає що їх об'єм буде об'ємом двух окремих куль
            return (4.0 / 3.0) * Math.PI * Math.pow(r1, 3) + (4.0 / 3.0) * Math.PI * Math.pow(r2, 3); // об'єм кулі можна визначити за формулою V = 4/3 πr^3
        }
        else
        {
            double h1 = (r1 - r2 + d) / 2; // далі обчислюємо висоти куль
            double h2 = d - h1;
            double volume1 = (1.0 / 3.0) * Math.PI * h1 * h1 * (3 * r1 - h1);
            double volume2 = (1.0 / 3.0) * Math.PI * h2 * h2 * (3 * r2 - h2);
            return volume1 + volume2;
        }
    }

    public double intersectionVolume(Baloon other) { // об'єм перетину - площа тільки того місця де фігури торкаються
        double d = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) + Math.pow(this.z - other.z, 2)); // тут ми використовуємо формулу теореми Піфагора d = √ (x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2
        double r1 = this.radius; // тут ми так само присвоюэм змінним радіус кожної з куль, щоб не писати довгу строку
        double r2 = other.radius;

        if (d >= r1 + r2) { // тут ми перевіряємо чи кулі не перетинаються, якщо д = або більше р1 + р2 (двух радіусів), то кулі точно не перетинаються, повертаємо 0
            return 0.0;
        }
        else if (d <= Math.abs(r1 - r2)) { // тут ми перевіряємо чи одна куля знаходиться повністю всередині іншої, якщо це так то повертаємо розмір меншої з них, бо торкаються вони одне одного очевидно тільки в місці де менша з них
            double smallerRadius = Math.min(r1, r2); // якраз для цього ми використовуємо Math.min щоб повернути менше з двух значень
            return (4.0 / 3.0) * Math.PI * Math.pow(smallerRadius, 3);
        }
        else // у решті випадків, якщо кулі все ж таки перетинаються, но при цьому не повністю, то працюємо таким чином
        {
            double h1 = (1.0 / 2.0) * (1 - ((Math.pow(r2, 2) - Math.pow(r1, 2) + Math.pow(d, 2)) / (2 * d))); // тут ми використовуємо формулу для обчислення висоти h1 перетину між двума кулями h1 = (1/2) * (1 - ((r2^2 - r1^2 + d^2) / (2 * d)))
            double h2 = d - h1;
            double volume1 = (1.0 / 3.0) * Math.PI * h1 * h1 * (3 * r1 - h1); // визначаємо об'єм першої кулі яка перетинається з другою, а нижче об'єм другої кулі яка перетинається з першою
            double volume2 = (1.0 / 3.0) * Math.PI * h2 * h2 * (3 * r2 - h2);
            return volume1 + volume2; // загальний об'єм перетину двох куль
        }
    }
}