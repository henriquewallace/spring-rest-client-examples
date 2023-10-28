package com.jeff.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    String street;
    String city;
    String state;
    String postcode;
}
