package model;

import lombok.Data;


@Data
public class Car {
    private String Model;
    private String Colour;
    private Float DailyCost;
    private String RegistrationNumber;
    private String VinNumber;
    private String Brand;
    private Integer Capacity;
    private Integer HorsePower;
    private FuelType FuelType;
    private BodyType BodyType;
    private Boolean IsBlocked;
    private TransitionType Transition;
    private Segment Segment;
    private Double PriceForClient;

    public Car(String model, String colour, Float dailyCost, String registrationNumber, String vinNumber, String brand, Integer capacity, Integer horsePower, model.FuelType fuelType, model.BodyType bodyType, Boolean isBlocked, TransitionType transition, model.Segment segment, Double priceForClient) {
        Model = model;
        Colour = colour;
        DailyCost = dailyCost;
        RegistrationNumber = registrationNumber;
        VinNumber = vinNumber;
        Brand = brand;
        Capacity = capacity;
        HorsePower = horsePower;
        FuelType = fuelType;
        BodyType = bodyType;
        IsBlocked = isBlocked;
        Transition = transition;
        Segment = segment;
        PriceForClient = setPriceForClient(Segment);
    }

    private Double setPriceForClient(Segment segment) {

        switch(Segment){
            case A:{
                return PriceForClient = 50.0;
            }
            case B:{
                return PriceForClient = 80.0;
            }
            case C:{
                return PriceForClient = 110.0;
            }
            case CPremium:{
                return PriceForClient = 170.0;
            }
            case D:{
                return PriceForClient = 200.0;
            }
            case E:{
                return PriceForClient = 250.0;
            }
            case F:{
                return PriceForClient = 350.0;
            }
            case G:{
                return PriceForClient = 500.0;
            }
            case P:{
                return PriceForClient = 200.0;
            }
            case PEx:{
                return PriceForClient = 275.0;
            }
            case PCh:{
                return PriceForClient = 255.0;
            }
            case PBox:{
                return PriceForClient = 180.0;
            }
            case PKon:{
                return PriceForClient = 260.0;
            }
            case R:{
                return PriceForClient = 300.0;
            }
            case RPremium:{
                return PriceForClient = 350.0;
            }
            case MVan:{
                return PriceForClient = 170.0;
            }
            case MP:{
                return PriceForClient = 150.0;
            }
            case MCh:{
                return PriceForClient = 170.0;
            }
            case SUV:{
                return PriceForClient = 170.0;
            }
            case SUVPremium:{
                return PriceForClient = 300.0;
            }
            case CR:{
                return PriceForClient = 170.0;
            }
            case CRPremium:{
                return PriceForClient = 300.0;
            }
            default:{
                return PriceForClient = 0.0;
            }
        }
    }

}
