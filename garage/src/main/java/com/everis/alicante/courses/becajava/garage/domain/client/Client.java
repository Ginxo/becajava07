package com.everis.alicante.courses.becajava.garage.domain.client;

/**
 * Created by emingora on 29/06/2017.
 */
public class Client {
    private String dni;
    private String name;
    private String surname;
    private String birthDate;

    public Client(String dni, String name, String surname, String birthDate) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
}
