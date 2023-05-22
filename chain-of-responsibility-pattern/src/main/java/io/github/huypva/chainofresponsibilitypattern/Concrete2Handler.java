package io.github.huypva.chainofresponsibilitypattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Concrete2Handler extends BaseHandler {

  public Concrete2Handler() {
    super();
  }

  @Override
  public void handleRequest(String request) {
    if (request.contains("Concrete2")) {
      log.info("Concrete2Handler handle request: {}", request);
      return;
    }

    super.handleRequest(request);
  }
}
