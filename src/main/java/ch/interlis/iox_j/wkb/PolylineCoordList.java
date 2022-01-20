package ch.interlis.iox_j.wkb;

import com.vividsolutions.jts.geom.Coordinate;

import java.util.LinkedList;
import java.util.List;

public class PolylineCoordList {
    final List<Coordinate> coordinates;
    final int wkbType;

    public PolylineCoordList(int wkbType) {
        this.coordinates = new LinkedList<Coordinate>();
        this.wkbType = wkbType;
    }
}
