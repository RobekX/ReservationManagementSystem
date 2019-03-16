package model.Car;

import lombok.Data;

@Data
public abstract class Car {
    private String Model;
    private String Colour;
    private Float Cost;
    private String RegistrationNumber;
    private String VinNumber;
    private String Brand;
    private Integer Capacity;
    private Integer HorsePower;
    private Enum<model.FuelType> FuelType;
    private Enum<model.BodyType> BodyType;
    private Boolean IsBlocked;
}
