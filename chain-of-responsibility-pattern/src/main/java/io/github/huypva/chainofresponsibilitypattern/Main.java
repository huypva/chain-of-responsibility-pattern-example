package io.github.huypva.chainofresponsibilitypattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Handler concre1Hander = new Concrete1Handler();
    Handler concre2Hander = new Concrete2Handler();

    concre1Hander.setNextHandler(concre2Hander);
    concre1Hander.handleRequest("Concrete1 request");

    concre1Hander.setNextHandler(concre2Hander);
    concre1Hander.handleRequest("Concrete2 request");

    concre1Hander.setNextHandler(concre2Hander);
    concre1Hander.handleRequest("Concrete3 request");
  }
}
