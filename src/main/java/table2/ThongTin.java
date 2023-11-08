package table2;

public class ThongTin {

    private String image;
    private String name;
    private String sing;
    private String view;
    private String time;

    public ThongTin() {
//        super();
    }

    public ThongTin(String image, String name, String sing, String view, String time) {
//        super();
        this.image = image;
        this.name = name;
        this.sing = sing;
        this.view = view;
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
