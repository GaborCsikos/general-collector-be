package hu.gcsikos.collector.collectorbackendms.general;

public interface Mapper<Request, Response, Entity> {

    Response mapFromEntityToResponse(Entity entity);

    Entity updateEntity(Entity original, Request toUpdate);

    Entity createEntity(Request toCreate);
}