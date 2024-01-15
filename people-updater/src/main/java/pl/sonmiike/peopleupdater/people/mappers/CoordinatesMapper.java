package pl.sonmiike.peopleupdater.people.mappers;

import org.springframework.stereotype.Component;
import pl.sonmiike.peopledata.model.Coordinates;
import pl.sonmiike.peoplerandomapiclient.contract.CoordinatesDTO;

@Component
public class CoordinatesMapper implements IMapEntities<CoordinatesDTO, Coordinates> {
    @Override
    public Coordinates mapToEntity(CoordinatesDTO coordinatesDTO) {
        return map(coordinatesDTO, new Coordinates());
    }

    @Override
    public Coordinates map(CoordinatesDTO coordinatesDTO, Coordinates coordinates) {
        coordinates.setLat(coordinatesDTO.getLongitude());
        coordinates.setLng(coordinatesDTO.getLongitude());
        return coordinates;
    }
}
