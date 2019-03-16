package model.Actions;

import lombok.Getter;

@Getter
public enum Status {
    Reserved,
    Rented,
    Returned,
    Closed,
    ServiceAction,
}