package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.Address;
import pl.sonmiike.peoplerandomapiclient.contract.AddressDTO;

@Component
public class AddresMapper implements IMapEntities<AddressDTO, Address> {
    @Override
    public Address mapToEntity(AddressDTO addressDTO) {
        return map(addressDTO, new Address());
    }

    @Override
    public Address map(AddressDTO addressDTO, Address address) {
        address.setCity(addressDTO.getCity());
        address.setStreetName(addressDTO.getStreetName());
        address.setStreetAdress(addressDTO.getStreetAddress());
        address.setZipCode(addressDTO.getZipCode());
        address.setState(addressDTO.getState());
        address.setCountry(addressDTO.getCountry());
        return address;
    }
}
