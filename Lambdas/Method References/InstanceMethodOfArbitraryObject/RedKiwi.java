import com.sun.source.util.TaskEvent;

public class RedKiwi {
    
    private String color;
    private String taste;
    
    public RedKiwi() {
        // Default
    }

    public RedKiwi(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public void howDOITaste() {
        System.out.println("I taste like "+getTaste());
    }

    public String getTaste() {
        return taste;
    }

    public String getColor() {
        return color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setColor(String color) {
        this.color = color;
    }

}