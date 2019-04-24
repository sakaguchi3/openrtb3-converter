/*
 * Copyright  2019 - present. MEDIA.NET ADVERTISING FZ-LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.media.converters.response30toresponse25;

import net.media.config.Config;
import net.media.converters.Converter;
import net.media.exceptions.OpenRtbConverterException;
import net.media.openrtb25.response.Bid;
import net.media.openrtb3.Video;
import net.media.utils.CommonConstants;
import net.media.utils.Provider;

import java.util.HashMap;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public class VideoToBidConverter implements Converter<Video, Bid> {

  public Bid map(Video source, Config config, Provider converterProvider)
      throws OpenRtbConverterException {
    if (isNull(source) || isNull(config)) return null;
    Bid bid = new Bid();
    enhance(source, bid, config, converterProvider);
    return bid;
  }

  public void enhance(Video source, Bid target, Config config, Provider converterProvider) {
    if (isNull(source) || isNull(target) || isNull(config)) return;

    target.setAdm(source.getAdm());
    if (nonNull(source.getApi()) && source.getApi().size() > 0)
      target.setApi(source.getApi().iterator().next());
    if (isNull(target.getExt())) {
      target.setExt(new HashMap<>());
    }
    target.getExt().put(CommonConstants.CTYPE, source.getCtype());
    target.getExt().put(CommonConstants.DUR, source.getDur());
    target.getExt().put(CommonConstants.CURL, source.getCurl());
    if (isEmpty(target.getNurl())) {
      target.setNurl(source.getCurl());
    }
    target.getExt().put(CommonConstants.MIME, source.getMime());
    if (nonNull(source.getExt())) target.getExt().putAll(source.getExt());
  }
}
