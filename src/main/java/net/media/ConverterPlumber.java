package net.media;

import net.media.converters.Converter;
import net.media.openrtb24.request.BidRequest;
import net.media.openrtb24.response.BidResponse;
import net.media.openrtb3.OpenRTB;
import net.media.utils.Provider;

/**
 * Created by shiva.b on 03/01/19.
 */
public class ConverterPlumber {

  private Provider<Conversion, Converter> converterProvider;

  public ConverterPlumber() {
    converterProvider = new Provider<>(null);
    converterProvider.register(new Conversion(BidResponse.class, OpenRTB.class),
      bidResponseToOpenRtb());
    converterProvider.register(new Conversion(BidRequest.class, OpenRTB.class),
      bidRequestToOpenRtb());
    converterProvider.register(new Conversion(OpenRTB.class, BidResponse.class),
      openRtbToBidResponseConverter());
    converterProvider.register(new Conversion(OpenRTB.class, BidRequest.class),
      OpenRtbToBidRequestConverter());
  }

  private Converter<OpenRTB, BidRequest> OpenRtbToBidRequestConverter() {

    return null;
  }

  private Converter<OpenRTB, BidResponse> openRtbToBidResponseConverter() {
    return null;
  }

  private Converter<BidRequest, OpenRTB> bidRequestToOpenRtb() {

    return null;
  }

  private Converter<BidResponse, OpenRTB> bidResponseToOpenRtb() {
    return null;
  }

  public <U, V> Converter<U, V> getConverter(Class<U> source, Class<V> target) {
    return converterProvider.fetch(new Conversion(source, target));
  }

}
