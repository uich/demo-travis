package jp.uich.demo.travis;

import org.springframework.stereotype.Service;

@Service
public class TestService {

  public String hello() {
    return "Hello";
  }
}
