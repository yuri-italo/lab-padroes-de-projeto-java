package dev.yuri.gof.facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Carlos Maia", "33333-555");
    }
}
