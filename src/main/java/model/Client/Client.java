package model.Client;

import lombok.Data;

@Data
public abstract class Client {
    private String name;
    private String adress;
    private String postCode;
    private String city;
    private String phoneNumber;
    private String emailAdress;
    private Boolean isBlocked;

}
