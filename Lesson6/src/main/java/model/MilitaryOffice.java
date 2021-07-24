package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice() {
    }
}
