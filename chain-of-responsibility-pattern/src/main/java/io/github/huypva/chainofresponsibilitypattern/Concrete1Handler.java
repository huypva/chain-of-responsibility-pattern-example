package io.github.huypva.chainofresponsibilitypattern;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Concrete1Handler extends BaseHandler {

  public Concrete1Handler() {
    super();
  }

  @Override
  public void handleRequest(String request) {
    if (request.contains("Concrete1")) {
      log.info("Concrete1Handler handle request: {}", request);
      return;
    }

    super.handleRequest(request);
  }
}
