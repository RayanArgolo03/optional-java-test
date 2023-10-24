package repository;

import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface Repository<T> {
    Optional<T> findByPredicate(Predicate<T> predicate);
}
