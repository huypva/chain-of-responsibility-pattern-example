package io.github.huypva.chainofresponsibilitypattern;

/**
 * @author huypva
 */
public interface Handler {
  public void setNextHandler(Handler handler);
  public void handleRequest(String request);
}
