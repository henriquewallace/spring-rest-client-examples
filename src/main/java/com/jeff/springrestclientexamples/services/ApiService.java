package com.jeff.springrestclientexamples.services;

import com.jeff.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
