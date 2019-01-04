package net.media.converters.request24toRequest30;

import net.media.config.Config;
import net.media.converters.Converter;
import net.media.openrtb24.request.Source;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rajat.go on 03/01/19.
 */
public class SourceToSourceConverter implements Converter<Source, net.media.openrtb3.Source> {
  @Override
  public net.media.openrtb3.Source map(Source source, Config config) {
    if ( source == null ) {
      return null;
    }

    net.media.openrtb3.Source source1 = new net.media.openrtb3.Source();

    source1.setTid( source.getTid() );
    source1.setPchain( source.getPchain() );
    Map<String, Object> map = source.getExt();
    if ( map != null ) {
      source1.setExt( new HashMap<String, Object>( map ) );
    }

    inhance( source, source1, config
    );

    return source1;
  }

  @Override
  public void inhance(Source source, net.media.openrtb3.Source target, Config config) {
    if(source == null)
      return;
    if(source.getExt() == null)
      return;
    target.setTs((Integer) source.getExt().get("ts"));
    target.setDs((String) source.getExt().get("ds"));
    target.setDsmap((String) source.getExt().get("dsMap"));
    target.setCert((String) source.getExt().get("cert"));
    target.setDigest((String) source.getExt().get("digest"));
    target.getExt().remove("ts");
    target.getExt().remove("ds");
    target.getExt().remove("dsMap");
    target.getExt().remove("cert");
    target.getExt().remove("digest");

    if(source.getFd() != null) {
      if(target.getExt() == null)
        target.setExt(new HashMap<>());
      target.getExt().put("fd", source.getFd());
    }
  }
}
