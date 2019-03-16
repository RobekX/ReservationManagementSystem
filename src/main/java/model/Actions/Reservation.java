package model.Actions;

import lombok.Data;
import model.Actions.Action;
import model.Actions.Status;
import model.Car.Car;
import model.Car.Segment;
import model.Client.Client;

@Data
public class Reservation extends Action {
    private Client client;
    private Car car;
    private Double cost;
    private Segment segment;
    private Integer days;
    private String startDate;
    private String endDate;
    private String pickUpLocation;
    private String dropOffLocation;
    private Integer pickUpLocationDistancefromOffice;
    private Integer dropOffLocationDistanceFromOffice;

    private Double setCost(){
        return cost = days * car.getPriceForClient();
    }
}
