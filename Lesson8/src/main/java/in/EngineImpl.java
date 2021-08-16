package in;

import model.Engine;

public class EngineImpl implements IEngine {
    private final Engine engine;

    public EngineImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean isRunning() {
        return engine.isRunning();
    }

    @Override
    public void start() {
        if (!isRunning()) {
            engine.setRunning(true);
            System.out.println("Двигатель заведен");
        } else {
            System.out.println("Двигатель уже заведен");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            engine.setRunning(false);
            System.out.println("Двигатель заглушен");
        } else {
            System.out.println("Двигатель уже заглушен");
        }
    }
}