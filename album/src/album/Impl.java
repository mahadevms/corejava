package album;

import java.util.ArrayList;
import java.util.List;

public class Impl {
	public void getalbumname(List<Album> l) {
		for (Album album1 : l) {
			System.out.println(album1.getAlbumName()+" "+album1.getReleaseYear());
		}
	}
	public void getalbumid(List<Album> l) {
		for (Album album1 : l) {
			System.out.println(album1.getId());
		}
	}
	public void getalbumdate(List<Album> l) {
		for (Album album1 : l) {
			System.out.println(album1.getReleaseYear());
		}
	}
	public void getalbumGroup(List<Album> l) {
		for (Album album1 : l) {
			System.out.println(album1.getGroup());
		}
	}
	public void deleteById(List<Album> l,int id) {
		if (l.contains(l.contains(id))) {
			l.remove(10);
		}
		
	}
	public static void main(String[] args) {
		List<Album>l=new ArrayList<Album>();
		l.add(new Album("ashique",10,"10/10/2022","love"));
		l.add(new Album("singsr",11,"2/10/2022","classic"));
		l.add(new Album("humare",12,"2/11/2022","mashup"));
	
		Impl imp=new Impl();
	//	imp.getalbumname(l);
//		imp.getalbumdate(l);
//		imp.getalbumGroup(l);
		imp.getalbumid(l);
		
		System.out.println(l);


	}
}
