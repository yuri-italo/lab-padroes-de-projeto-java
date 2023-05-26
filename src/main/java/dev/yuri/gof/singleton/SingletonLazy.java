package dev.yuri.gof.singleton;
/**
 * Implementação "preguiçosa" do Singleton
 *
 * @author yuri-italo
 * */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
