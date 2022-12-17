package album;

public class Album {
private String albumName;
private int id;
private String releaseYear;
private String group;
public Album(String albumName, int id, String releaseYear, String group) {
	this.albumName = albumName;
	this.id = id;
	this.releaseYear = releaseYear;
	this.group = group;
}
public String getAlbumName() {
	return albumName;
}
public int getId() {
	return id;
}
public String getReleaseYear() {
	return releaseYear;
}
public String getGroup() {
	return group;
}


}
