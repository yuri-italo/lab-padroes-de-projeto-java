package dev.yuri.gof.singleton;
/**
 * Implementação do Singleton com Holder class
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author yuri-italo
 * */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
