package net.media.converters.request24toRequest30;

import net.media.config.Config;
import net.media.converters.Converter;
import net.media.openrtb24.request.Segment;

import java.util.HashMap;
import java.util.Map;

public class SegmentToSegmentConverter implements Converter<Segment, net.media.openrtb3.Segment> {
  @Override
  public net.media.openrtb3.Segment map(Segment source, Config config) {
    if ( source == null ) {
      return null;
    }

    net.media.openrtb3.Segment segment1 = new net.media.openrtb3.Segment();

    segment1.setId( source.getId() );
    segment1.setName( source.getName() );
    segment1.setValue( source.getValue() );
    Map<String, Object> map = source.getExt();
    if ( map != null ) {
      segment1.setExt( new HashMap<String, Object>( map ) );
    }

    return segment1;
  }

  @Override
  public void inhance(Segment source, net.media.openrtb3.Segment target, Config config) {

  }
}
