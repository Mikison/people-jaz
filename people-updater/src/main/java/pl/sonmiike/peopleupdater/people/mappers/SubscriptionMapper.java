package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.Subscriptions;
import pl.sonmiike.peoplerandomapiclient.contract.SubscriptionDTO;

@Component
public class SubscriptionMapper implements IMapEntities<SubscriptionDTO, Subscriptions>{


    @Override
    public Subscriptions mapToEntity(SubscriptionDTO subscriptionDTO) {
        return map(subscriptionDTO, new Subscriptions());
    }

    @Override
    public Subscriptions map(SubscriptionDTO subscriptionDTO, Subscriptions subscriptions) {
        subscriptions.setPlan(subscriptionDTO.getPlan());
        subscriptions.setStatus(subscriptionDTO.getStatus());
        subscriptions.setPaymentMethod(subscriptionDTO.getPaymentMethod());
        subscriptions.setTerm(subscriptionDTO.getTerm());
        return subscriptions;
    }
}
