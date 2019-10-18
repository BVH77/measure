package pro.com.measure.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Measurement1 {

    private String id;
    private LocalDateTime dateTime;
    private float pick;
    private String desc;

    public Measurement1() {
    }

    public Measurement1(LocalDateTime dateTime, float pick) {
        this.dateTime = dateTime;
        this.pick = pick;
    }

    public Measurement1(LocalDateTime dateTime, float pick, String desc) {
        this.dateTime = dateTime;
        this.pick = pick;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public float getPick() {
        return pick;
    }

    public void setPick(float pick) {
        this.pick = pick;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Measurement1{" +
                "id='" + id + '\'' +
                ", dateTime=" + dateTime +
                ", pick=" + pick +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement1 that = (Measurement1) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
