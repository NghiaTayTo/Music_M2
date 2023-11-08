package table2;

import java.util.ArrayList;
import java.util.List;

public class ModelThongTin {

    public List<ThongTin> finAll() {
        List<ThongTin> music = new ArrayList<ThongTin>();
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "HKT", "120K", "03:55"));
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "Ai Biết", "120K", "03:55"));
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "Ai Biết", "120K", "03:55"));
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "Ai Biết", "120K", "03:55"));
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "Ai Biết", "120K", "03:55"));
        music.add(new ThongTin("anhsedoi.jpg", "Anh Sẽ Đợi", "Ai Biết", "120K", "03:55"));
        return music;
    }
}
