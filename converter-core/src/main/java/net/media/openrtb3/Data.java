package net.media.openrtb3;

import java.util.List;
import java.util.Map;

public class Data {

  private String id;
  private String name;
  private List<Segment> segment;
  private Map<String, Object> ext;

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<Segment> getSegment() {
    return this.segment;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSegment(List<Segment> segment) {
    this.segment = segment;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
