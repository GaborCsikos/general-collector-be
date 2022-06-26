package hu.gcsikos.collector.collectorbackendms.general;

public interface Mapper<Request, Response, Entity, RequestWithId> {

    Response mapFromEntityToResponse(Entity entity);

    Entity updateEntity(Entity original, RequestWithId toUpdate);

    Entity createEntity(Request toCreate);
}