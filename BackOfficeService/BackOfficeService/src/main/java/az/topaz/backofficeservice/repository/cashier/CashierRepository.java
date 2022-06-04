package az.topaz.backofficeservice.repository.cashier;

import az.topaz.backofficeservice.repository.CrudRepository;

import java.math.BigDecimal;

public interface CashierRepository<T> extends CrudRepository<T> {

    BigDecimal balanceDifference(Long id);
}
