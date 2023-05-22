package io.github.huypva.chainofresponsibilitypattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
@Setter
@Getter
@NoArgsConstructor
public abstract class BaseHandler implements Handler {

  protected Handler nextHandler;

  @Override
  public void handleRequest(String request) {
    if (this.nextHandler != null) {
      this.nextHandler.handleRequest(request);
      return;
    }

    log.info("No handler can handle request: {}", request);
  }

}
