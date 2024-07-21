package org.trips.service_framework.utils.search.filters;

import lombok.Builder;
import lombok.Data;
import org.trips.service_framework.utils.search.Filter;
import org.trips.service_framework.utils.search.operators.BinaryOperator;

/**
 * @author : hardikphalet
 * @since : 22/07/24
 **/

@Data
@Builder
public class BinaryFilter<T> implements Filter {
    private String field;
    private T value;
    private BinaryOperator operation;

    @Override
    public String getQuery() {
        return String.format("%s.%s:%s", field, operation.getOperation(), value);
    }
}
