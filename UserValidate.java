package userreg;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T parameters);
}