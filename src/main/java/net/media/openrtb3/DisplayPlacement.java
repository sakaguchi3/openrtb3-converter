package net.media.openrtb3;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayPlacement {
  private Integer pos;
  private Integer instl;
  private Integer topframe;
  private List<String> ifrbust;
  private Integer clktype;
  private Integer ampren;
  private Integer ptype;
  private Integer context;
  private List<String> mime;
  private List<Integer> api;
  private List<Integer> ctype;
  private Integer w;
  private Integer h;
  private Integer unit = 1;
  private Integer priv = 0;
  private List<DisplayFormat> displayfmt;
  private NativeFormat nativefmt;
  private EventSpec event;
  private Map<String, Object> ext;
}