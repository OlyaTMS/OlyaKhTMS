package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Engine {

    private String type;
    private int volume;
    private boolean isRunning;

    public Engine(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }
}
