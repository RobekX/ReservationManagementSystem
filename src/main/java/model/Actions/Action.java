package model.Actions;

import lombok.Data;

@Data
public abstract class Action {
    private String startDate;
    private String endDate;
    protected Status status;
}
