package one.digitalinnovation.gof.singleton;

/**
 * Sigleton "Lazy Holder".
 *
 * @author riquelme
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 */
public class SingletonLazyHolder {
    private static class InstaceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return InstaceHolder.instancia;
    }
}
