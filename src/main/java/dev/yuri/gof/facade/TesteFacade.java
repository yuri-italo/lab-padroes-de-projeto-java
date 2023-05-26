package dev.yuri.gof.facade;

public class TesteFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Carlos Maia", "33333-555");
    }
}
