package jp.uich.demo.travis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

  @Autowired
  TestService service;

  @Test
  public void hello() throws Exception {
    assertThat(service.hello()).isEqualTo("Hello");
  }

}
