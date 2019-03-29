package net.media.openrtb25.request;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by vishnu on 6/5/16.
 */
public class Banner {

  public static final Collection<Integer> DEFAULT_MIME_TYPES = Arrays.asList(1, 2, 4);

  public static final Integer DEFAULT_BANNER_POSITION = 1;

  private Integer w;

  private Integer h;

  private Collection<Format> format;

  private String id;

  private Collection<Integer> btype;

  private Collection<Integer> battr;

  private Integer pos;

  private Collection<String> mimes;

  private Integer topframe;

  private Collection<Integer> expdir;

  private Collection<Integer> api;

  private Integer vcm;

  private Map<String, Object> ext;

  public Banner(Banner banner) {
    this.id = banner.id;
    this.w = banner.w;
    this.h = banner.h;
    this.format = banner.format;
    this.btype = banner.btype;
    this.battr = banner.battr;
    this.pos = banner.pos;
    this.mimes = banner.mimes;
    this.topframe = banner.topframe;
    this.expdir = banner.expdir;
    this.api = banner.api;
    this.ext = banner.ext;
  }

  public Banner() {
  }

  public Integer getW() {
    return this.w;
  }

  public Integer getH() {
    return this.h;
  }

  public Collection<Format> getFormat() {
    return this.format;
  }

  public String getId() {
    return this.id;
  }

  public Collection<Integer> getBtype() {
    return this.btype;
  }

  public Collection<Integer> getBattr() {
    return this.battr;
  }

  public Integer getPos() {
    return this.pos;
  }

  public Collection<String> getMimes() {
    return this.mimes;
  }

  public Integer getTopframe() {
    return this.topframe;
  }

  public Collection<Integer> getExpdir() {
    return this.expdir;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public Integer getVcm() {
    return this.vcm;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public void setFormat(Collection<Format> format) {
    this.format = format;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setBtype(Collection<Integer> btype) {
    this.btype = btype;
  }

  public void setBattr(Collection<Integer> battr) {
    this.battr = battr;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public void setMimes(Collection<String> mimes) {
    this.mimes = mimes;
  }

  public void setTopframe(Integer topframe) {
    this.topframe = topframe;
  }

  public void setExpdir(Collection<Integer> expdir) {
    this.expdir = expdir;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public void setVcm(Integer vcm) {
    this.vcm = vcm;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Banner)) return false;
    final Banner other = (Banner) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$format = this.getFormat();
    final Object other$format = other.getFormat();
    if (this$format == null ? other$format != null : !this$format.equals(other$format))
      return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$btype = this.getBtype();
    final Object other$btype = other.getBtype();
    if (this$btype == null ? other$btype != null : !this$btype.equals(other$btype)) return false;
    final Object this$battr = this.getBattr();
    final Object other$battr = other.getBattr();
    if (this$battr == null ? other$battr != null : !this$battr.equals(other$battr)) return false;
    final Object this$pos = this.getPos();
    final Object other$pos = other.getPos();
    if (this$pos == null ? other$pos != null : !this$pos.equals(other$pos)) return false;
    final Object this$mimes = this.getMimes();
    final Object other$mimes = other.getMimes();
    if (this$mimes == null ? other$mimes != null : !this$mimes.equals(other$mimes)) return false;
    final Object this$topframe = this.getTopframe();
    final Object other$topframe = other.getTopframe();
    if (this$topframe == null ? other$topframe != null : !this$topframe.equals(other$topframe))
      return false;
    final Object this$expdir = this.getExpdir();
    final Object other$expdir = other.getExpdir();
    if (this$expdir == null ? other$expdir != null : !this$expdir.equals(other$expdir))
      return false;
    final Object this$api = this.getApi();
    final Object other$api = other.getApi();
    if (this$api == null ? other$api != null : !this$api.equals(other$api)) return false;
    final Object this$vcm = this.getVcm();
    final Object other$vcm = other.getVcm();
    if (this$vcm == null ? other$vcm != null : !this$vcm.equals(other$vcm)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    if (this$ext == null ? other$ext != null : !this$ext.equals(other$ext)) return false;
    return true;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $w = this.getW();
    result = result * PRIME + ($w == null ? 43 : $w.hashCode());
    final Object $h = this.getH();
    result = result * PRIME + ($h == null ? 43 : $h.hashCode());
    final Object $format = this.getFormat();
    result = result * PRIME + ($format == null ? 43 : $format.hashCode());
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $btype = this.getBtype();
    result = result * PRIME + ($btype == null ? 43 : $btype.hashCode());
    final Object $battr = this.getBattr();
    result = result * PRIME + ($battr == null ? 43 : $battr.hashCode());
    final Object $pos = this.getPos();
    result = result * PRIME + ($pos == null ? 43 : $pos.hashCode());
    final Object $mimes = this.getMimes();
    result = result * PRIME + ($mimes == null ? 43 : $mimes.hashCode());
    final Object $topframe = this.getTopframe();
    result = result * PRIME + ($topframe == null ? 43 : $topframe.hashCode());
    final Object $expdir = this.getExpdir();
    result = result * PRIME + ($expdir == null ? 43 : $expdir.hashCode());
    final Object $api = this.getApi();
    result = result * PRIME + ($api == null ? 43 : $api.hashCode());
    final Object $vcm = this.getVcm();
    result = result * PRIME + ($vcm == null ? 43 : $vcm.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Banner;
  }

  public String toString() {
    return "net.media.openrtb25.request.Banner(w=" + this.getW() + ", h=" + this.getH() + ", format=" + this.getFormat() + ", id=" + this.getId() + ", btype=" + this.getBtype() + ", battr=" + this.getBattr() + ", pos=" + this.getPos() + ", mimes=" + this.getMimes() + ", topframe=" + this.getTopframe() + ", expdir=" + this.getExpdir() + ", api=" + this.getApi() + ", vcm=" + this.getVcm() + ", ext=" + this.getExt() + ")";
  }
}
