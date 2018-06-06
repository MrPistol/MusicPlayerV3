package red.mfm.musicplayerv3;

import com.google.gson.annotations.SerializedName;

/**
 * Created by echessa on 11/26/16.
 */
public class Track {

  @SerializedName("song")
  private String mTitle;

  @SerializedName("artists")
  private String mID;

  @SerializedName("url")
  private String mStreamURL;

  @SerializedName("cover_image")
  private String mArtworkURL;

  public String getTitle() {
    return mTitle;
  }

  public String getID() {
    return mID;
  }

  public String getStreamURL() {
    return mStreamURL;
  }

  public String getArtworkURL() {
    return mArtworkURL;
  }

}