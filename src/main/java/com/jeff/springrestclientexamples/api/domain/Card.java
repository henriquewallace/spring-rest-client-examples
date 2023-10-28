package com.jeff.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

    String type;
    String number;
    ExpirationDate expirationDate;
    String iban;
    String swift;
}
