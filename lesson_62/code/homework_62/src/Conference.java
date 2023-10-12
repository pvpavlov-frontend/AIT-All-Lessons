package homework_62.src;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conference implements Comparable<Conference>{
    private String theme;
    private LocalDateTime time;
    private String link;

    public Conference(String theme, String dateStr, String timeStr, String link) {
        this.theme = theme;
        String str = dateStr+" "+timeStr;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        this.time = LocalDateTime.parse(str, formatter);
        this.link = link;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
        return "Conference{" +
            "them='" + theme+ '\'' +
            ", time=" + time.format(formatter) +
            ", link='" + link + '\'' +
            '}';
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Conference o) {
        return this.time.compareTo(o.time);
    }
}
