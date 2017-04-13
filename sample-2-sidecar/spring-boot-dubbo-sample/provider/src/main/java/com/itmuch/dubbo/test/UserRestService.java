package com.itmuch.dubbo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestService implements UserService {

  @Autowired
  private UserService userServer;

  @Override
  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    return this.userServer.findById(id);
  }
}
