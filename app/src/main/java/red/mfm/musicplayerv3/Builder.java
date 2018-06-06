package red.mfm.musicplayerv3;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class Builder {

  private static final Retrofit RETROFIT = new Retrofit.Builder()
      .baseUrl(Config.API_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build();
  private static final HackerEarthApi HACKEREARTH_API = RETROFIT.create(HackerEarthApi.class);

  public static HackerEarthApi getApi() {
    return HACKEREARTH_API;
  }
}