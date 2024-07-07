import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Basic {

    @Test
    public void createPlaylist() {
        String userId = "your-user-id";
        String playlistRequest = ""; // Include your playlist request body here
        Response response = RestAssured
                .given()
                .baseUri("https://api.spotify.com/v1/users/" + userId)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer your-access-token") // Include your Spotify access token
                .body(playlistRequest)
                .when()
                .post("/playlists")
                .then()
                .statusCode(201)
                .extract()
                .response();
        String playlistId = response.jsonPath().get("id");

        System.out.println("Created Playlist ID: " + playlistId);
    }
}
