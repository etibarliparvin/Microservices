package az.topaz.backofficeservice.repository.operator;

import az.topaz.backofficeservice.repository.CrudRepository;

public interface OperatorRepository<T> extends CrudRepository<T> {

    Long countOfCashiers(Long id);
}
