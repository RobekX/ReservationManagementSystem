package model.Client;

import lombok.Data;

@Data
public class Company extends Client {
    private String nip;
    private String krs;
    private String regon;
    private String invoiceEmailAdress;

}
