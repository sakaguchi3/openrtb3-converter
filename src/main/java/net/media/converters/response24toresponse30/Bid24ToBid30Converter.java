package net.media.converters.response24toresponse30;

import net.media.config.Config;
import net.media.converters.Converter;
import net.media.openrtb24.response.Bid;
import net.media.openrtb3.Media;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

/**
 * @author shiva.b
 */
public class Bid24ToBid30Converter implements Converter<Bid, net.media.openrtb3.Bid> {

  private Converter<Bid, Media> bidMediaConverter;

  public Bid24ToBid30Converter(Converter<Bid, Media> bidMediaConverter) {
    this.bidMediaConverter = bidMediaConverter;
  }

  @Override
  public net.media.openrtb3.Bid map(Bid source, Config config) {
    if (isNull(source)) {
      return null;
    }
    net.media.openrtb3.Bid bid = new net.media.openrtb3.Bid();
    inhance(source, bid, config);
    return bid;
  }

  @Override
  public void inhance(Bid source, net.media.openrtb3.Bid target, Config config) {
    if (source == null || target == null) {
      return;
    }
    Map<String, Object> map = source.getExt();
    if ( map != null ) {
      target.setExt(new HashMap<>(map) );
    }
    else {
      target.setExt( null );
    }
    target.setItem( source.getImpid() );
    target.setDeal( source.getDealid() );
    target.setPurl( source.getNurl() );
    target.setMedia(bidMediaConverter.map(source, config));
    target.setId( source.getId() );
    target.setPrice( source.getPrice() );
    target.setCid( source.getCid() );
    target.setTactic( source.getTactic() );
    target.setBurl( source.getBurl() );
    target.setLurl( source.getLurl() );
    target.setExp( source.getExp() );
  }
}
