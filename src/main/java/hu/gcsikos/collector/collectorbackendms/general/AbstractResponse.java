package hu.gcsikos.collector.collectorbackendms.general;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public abstract class AbstractResponse implements Serializable {
    public static final long serialVersionUID = 1L;
}
