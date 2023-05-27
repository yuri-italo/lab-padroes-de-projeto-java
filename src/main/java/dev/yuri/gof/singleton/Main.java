package dev.yuri.gof.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println("Endereço de memoria instancia lazy 1 -> " + singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println("Endereço de memoria instancia lazy 2 -> " + singletonLazy);

        System.out.println("------------------------");

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println("Endereço de memoria instancia eager 1 -> " + singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println("Endereço de memoria instancia eager 2 -> " + singletonEager);

        System.out.println("------------------------");

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Endereço de memoria instancia lazyHolder 1 -> " + singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Endereço de memoria instancia lazyHolder 2 -> " + singletonLazyHolder);
    }
}
