package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.CreditCard;
import pl.sonmiike.peoplerandomapiclient.contract.CreditCardDTO;

@Component
public class CreditCardMapper implements IMapEntities<CreditCardDTO, CreditCard>{

    @Override
    public CreditCard mapToEntity(CreditCardDTO creditCardDTO) {
        return map(creditCardDTO, new CreditCard());
    }

    @Override
    public CreditCard map(CreditCardDTO creditCardDTO, CreditCard creditCard) {
        creditCard.setCcNumber(creditCardDTO.getCreditCardNumber());
        return creditCard;
    }
}
