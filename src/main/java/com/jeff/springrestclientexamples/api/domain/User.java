package com.jeff.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    String gender;
    Name name;
    Location location;
    String email;
    Login login;
    String phone;
    Job job;
    Billing billing;
    String language;
    String currency;
}
