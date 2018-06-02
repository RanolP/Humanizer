package io.github.ranolp.humanizer;

public final class Humanizer {
    private static final class SingletonHolder {
        private static final Humanizer INSTANCE = new Humanizer();
    }

    public static Humanizer getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private Humanizer() {
    }
}
