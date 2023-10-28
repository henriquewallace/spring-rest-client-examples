package com.jeff.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {

    String date;
    Integer timezoneType;
    String timezone;
}
