package model.Car;

import lombok.Data;


@Data
public class Car {
    private String model;
    private String colour;
    private Float dailyCost;
    private String registrationNumber;
    private String vinNumber;
    private String brand;
    private Integer capacity;
    private Integer horsePower;
    private FuelType fuelType;
    private BodyType bodyType;
    private Boolean isBlocked;
    private TransitionType transition;
    private Segment segment;
    private Double priceForClient;
    private Tires tires;

    public Car(String model, String colour, Float dailyCost, String registrationNumber, String vinNumber, String brand,
               Integer capacity, Integer horsePower, FuelType fuelType, BodyType bodyType, Boolean isBlocked,
               TransitionType transition, Segment segment, Tires tires) {
        this.model = model;
        this.colour = colour;
        this.dailyCost = dailyCost;
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.isBlocked = isBlocked;
        this.transition = transition;
        this.segment = segment;
        this.priceForClient = setPriceForClient(this.segment);
        this.tires = tires;
    }

    private Double setPriceForClient(Segment segment) {

        switch(segment){
            case A:{
                return priceForClient = 50.0;
            }
            case B:{
                return priceForClient = 80.0;
            }
            case C:{
                return priceForClient = 110.0;
            }
            case CPremium:{
                return priceForClient = 170.0;
            }
            case D:{
                return priceForClient = 200.0;
            }
            case E:{
                return priceForClient = 250.0;
            }
            case F:{
                return priceForClient = 350.0;
            }
            case G:{
                return priceForClient = 500.0;
            }
            case P:{
                return priceForClient = 200.0;
            }
            case PEx:{
                return priceForClient = 275.0;
            }
            case PCh:{
                return priceForClient = 255.0;
            }
            case PBox:{
                return priceForClient = 180.0;
            }
            case PKon:{
                return priceForClient = 260.0;
            }
            case R:{
                return priceForClient = 300.0;
            }
            case RPremium:{
                return priceForClient = 350.0;
            }
            case MVan:{
                return priceForClient = 170.0;
            }
            case MP:{
                return priceForClient = 150.0;
            }
            case MCh:{
                return priceForClient = 170.0;
            }
            case SUV:{
                return priceForClient = 170.0;
            }
            case SUVPremium:{
                return priceForClient = 300.0;
            }
            case CR:{
                return priceForClient = 170.0;
            }
            case CRPremium:{
                return priceForClient = 300.0;
            }
            default:{
                return priceForClient = 0.0;
            }
        }
    }

}
