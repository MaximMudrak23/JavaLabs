public class Rectangle {
    private double longerLine;
    private double shorterLine;
    public Rectangle(double longerLine, double shorterLine) {
        this.longerLine = longerLine;
        this.shorterLine = shorterLine;
    }

    public void setLongerLine(double longerLine) {
        this.longerLine = longerLine;
    }

    public void setShorterLine(double shorterLine) {
        this.shorterLine = shorterLine;
    }

    public double getShorterLine() {return this.shorterLine; }

    public double getLongerLine() {return this.longerLine; }

    public double perimeterOfRectangle() {
        return 2 * (longerLine + shorterLine);
    } // Тому що у прямокутника є дві сторони довжини а та дві сторони довжини б тому 2 ну і множим довжину одної лінії на довжину іншої

    public double rectangleArea() {
        return longerLine * shorterLine;
    } // площа = довжина * ширина

    @Override
    public boolean equals(Object x) { // перевіряєм чи 2 прямокутника є рівними
        if (this == x) { // this це об'єкт для якого ми викликаэмо метод, тобто Rectangle1, якщо 2 наших прямокутника вказують на 1 область в памяті, то це один і той самий прямокутник, а значить вони рівні, тобто співвідношення їх у обох однакові
            return true;
        }

        if (x == null || getClass() != x.getClass()) { // якщо об'єкт з яким ми порівнюємо вказує на 0, то порівняння неможливе, повертаємо false || якщо 2 обєкта різних класів то порівняння теж неможливе, повертаємо false
            return false;
        }

        Rectangle rectangle = (Rectangle) x; // приводимо х до класу Rectangle замість того, щоб він залишася Object, щоб ми могли отримати доступ до полів, методів Rectangle, приводити до типу можна тільки якщо ми точно впевнені що це той клас, інакше буде помилка
        return Double.compare(rectangle.longerLine, longerLine) == 0 && Double.compare(rectangle.shorterLine, shorterLine) == 0; // порівнюємо довгу та коротку лінії в обидвох прямокутниках, якщо значення дорівнює 0 то вони однакові
    }

    public boolean similarRectangles(Rectangle r2) { // якщо співвідношення сторін однакове, то виводим true
        return this.longerLine / this.shorterLine == r2.longerLine / r2.shorterLine;
    }
}