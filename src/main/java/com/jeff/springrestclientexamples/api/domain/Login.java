package com.jeff.springrestclientexamples.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {

    String username;
    String password;
    String md5;
    String sha1;
    String sha256;
}
