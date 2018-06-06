package red.mfm.musicplayerv3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface HackerEarthApi {

  @GET("/{user}")
  Call<List<Track>> listSongs(@Path("user")String user) ;
}