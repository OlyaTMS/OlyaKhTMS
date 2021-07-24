package in;

public interface Convertable {
    default double getPower(double power) {
        return power * 0.74;
    }
}
