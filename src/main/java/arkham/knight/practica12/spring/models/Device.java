package arkham.knight.practica12.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int alarmTimer;

    public Device(String name, int alarmTimer) {
        this.name = name;
        this.alarmTimer = alarmTimer;
    }

    public Device() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlarmTimer() {
        return alarmTimer;
    }

    public void setAlarmTimer(int alarmTimer) {
        this.alarmTimer = alarmTimer;
    }
}
