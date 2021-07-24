package in;

public interface Convertible {
    default double getPower(double power) {
        return power * 0.74;
    }
}