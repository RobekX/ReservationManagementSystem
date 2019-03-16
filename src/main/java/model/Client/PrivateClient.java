package model.Client;

import lombok.Data;
@Data
public class PrivateClient extends Client {
    private String surname;
    private String idNumber;
    private String pesel;
    private String drivingLicenseNumber;
    private String isInternational;
    private String nationality;
    private String countryOfdrivingLicense;
    private Gender gender;

}
