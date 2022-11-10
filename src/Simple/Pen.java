package Simple;

public class Pen {
    private Colors colors;

    public Pen(Colors colors) {//Инициализирующий коструктор
        this.colors = colors;
    }

    public Colors getColors() {
        return colors;
    }
}
