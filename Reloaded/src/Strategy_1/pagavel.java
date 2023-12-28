package Strategy_1;

import java.math.BigDecimal;

public interface pagavel {  // Esta interface impede que as estratégias concretas tenham acess aos dados da regra de negócio.
    BigDecimal getValue();
}
