package pl.sonmiike.peopleupdater.people.mappers;

public interface IMapEntities <TDto, TEntity> {

    TEntity mapToEntity(TDto dto);
    TEntity map(TDto dto, TEntity entity);
}
